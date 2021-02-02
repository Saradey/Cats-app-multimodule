package com.evgeny.goncharov.wallcats.repository

import androidx.core.os.bundleOf
import com.evgeny.goncharov.coreapi.consts.FATAL_LOAD_MESSAGE_PARAM
import com.evgeny.goncharov.coreapi.consts.IMAGE_CAT_ID_PARAM
import com.evgeny.goncharov.coreapi.database.dao.CatsWallDAO
import com.evgeny.goncharov.coreapi.dto.database.CatBreedDto
import com.evgeny.goncharov.coreapi.managers.AnalyticsManager
import com.evgeny.goncharov.wallcats.analytics.events.FatalLoadImageCat
import com.evgeny.goncharov.wallcats.model.request.GetImageRequest
import com.evgeny.goncharov.wallcats.model.request.WallCatRequest
import com.evgeny.goncharov.wallcats.model.response.CatBreedImageDto
import com.evgeny.goncharov.wallcats.model.view.CatBreedEntity
import com.evgeny.goncharov.wallcats.services.ServiceBreeds
import kotlinx.coroutines.*
import javax.inject.Inject

/**
 * Реализация логики источника данных экрана стены котов
 * @property service для загрузки котов из сети
 * @property daoWallCat для загрузки котов из бд
 */
class WallCatRepositoryImpl @Inject constructor(
    private val service: ServiceBreeds,
    private val daoWallCat: CatsWallDAO,
    private val analyticsManager: AnalyticsManager
) : WallCatRepository {

    /** Скоуп для загрузки картинок и ожидание пока все не загрузится */
    private val coroutineScopeIo = CoroutineScope(Dispatchers.IO + SupervisorJob())

    override suspend fun loadWallCatFromInternet(request: WallCatRequest) =
        withContext(Dispatchers.IO) {
            val result = service.getBreedsAsync(request.createRequest()).await()
            loadAllImage(result)
            daoWallCat.insertWallCat(result)
            val resultMap = mapResponse(result)
            resultMap
        }

    override suspend fun loadWallCatFromDatabase() = withContext(Dispatchers.IO) {
        val result = daoWallCat.getCatBreed()
        val mapResult = mapResponse(result.sortedBy {
            it.name
        })
        mapResult
    }

    private fun mapResponse(modelResponse: List<CatBreedDto>) = modelResponse.map { modelDb ->
        CatBreedEntity(
            name = modelDb.name,
            description = modelDb.description,
            id = modelDb.id,
            wikipediaUrl = modelDb.wikipediaUrl,
            urlImage = modelDb.urlImageCat,
            lifeSpan = mapStringToInt(modelDb.lifeSpan),
            weightKg = mapStringToInt(modelDb.weight?.metric)
        )
    }

    private fun mapStringToInt(value: String?) =
        Regex(PATTERN_MAP_STRING_TO_INT).find(value.orEmpty())?.value?.replace("- ", "")
            ?.toInt()

    private suspend fun loadAllImage(result: List<CatBreedDto>) {
        val jobs = mutableListOf<Job>()
        result.forEach { response ->
            val job = coroutineScopeIo.launch {
                response.urlImageCat = getUrlImage(GetImageRequest(response.id))
            }
            jobs.add(job)
        }
        jobs.forEach {
            it.join()
        }
    }

    private suspend fun getUrlImage(request: GetImageRequest): String? {
        var result = emptyList<CatBreedImageDto>()
        try {
            result = service.getImageUrlAsync(request.createRequest()).await()
        } catch (exception: Exception) {
            error(request, exception)
            exception.printStackTrace()
        }
        return result.firstOrNull()?.url
    }

    private fun error(
        request: GetImageRequest,
        exception: Exception
    ) {
        analyticsManager.toEvent(FatalLoadImageCat.apply {
            bundle = bundleOf(
                Pair(IMAGE_CAT_ID_PARAM, request.breedId),
                Pair(FATAL_LOAD_MESSAGE_PARAM, exception.message)
            )
        })
    }

    companion object {

        /** Паттерн для вытаскивания числа из строки */
        private const val PATTERN_MAP_STRING_TO_INT = "- \\d"
    }
}