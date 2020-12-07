package com.evgeny.goncharov.wallcats.gateways

import com.evgeny.goncharov.coreapi.database.dao.CatsWallDao
import com.evgeny.goncharov.coreapi.dto.database.CatBreed
import com.evgeny.goncharov.coreapi.managers.SortCatsManager
import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.wallcats.model.request.GetImageRequest
import com.evgeny.goncharov.wallcats.model.request.WallCatRequest
import com.evgeny.goncharov.wallcats.model.response.CatBreedImage
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import com.evgeny.goncharov.wallcats.rest.ApiBreeds
import kotlinx.coroutines.*
import javax.inject.Inject

/**
 * Реализация логики источника данных экрана стены котов
 * @property api для загрузки котов из сети
 * @property daoWallCat для загрузки котов из бд
 * @property sortManager менеджер который отдает тип сортировки
 */
class WallCatGatewayImpl @Inject constructor(
    private val api: ApiBreeds,
    private val daoWallCat: CatsWallDao,
    private val sortManager: SortCatsManager
) : WallCatGateway {

    companion object {

        /** Паттерн для вытаскивания числа из строки */
        private const val PATTERN_MAP_STRING_TO_INT = "- \\d"
    }

    /** Скоуп для загрузки картинок и ожидание пока все не загрузится */
    private val coroutineScopeIo = CoroutineScope(Dispatchers.IO + SupervisorJob())

    override suspend fun loadWallCatFromInternet(request: WallCatRequest) =
        withContext(Dispatchers.IO) {
            val result = api.getBreedsAsync(
                request.createRequest()
            ).await()
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

    private fun mapResponse(modelResponse: List<CatBreed>) = modelResponse.map { modelDb ->
        CatBreedView(
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

    private suspend fun loadAllImage(result: List<CatBreed>) {
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
        var result = emptyList<CatBreedImage>()
        try {
            result = api.getImageUrlAsync(
                request.createRequest()
            ).await()
        } catch (exp: Exception) {
            exp.printStackTrace()
        }
        return result.firstOrNull()?.url
    }

    override fun getSortType(): SortType = sortManager.getSortedType()
}