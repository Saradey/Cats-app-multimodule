package com.evgeny.goncharov.searchcats.gateway

import com.evgeny.goncharov.coreapi.database.dao.CatsWallDao
import com.evgeny.goncharov.coreapi.dto.database.CatBreed
import com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed
import com.evgeny.goncharov.coreapi.rest.ApiCatSearch
import com.evgeny.goncharov.searchcats.model.CatCatch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/**
 * Реализация логики источника данных искомых котов
 * @property api апи для запросов в сеть
 * @property dao дао для запросов в базу данных
 */
class SearchCatGatewayImpl @Inject constructor(
    private val api: ApiCatSearch,
    private val dao: CatsWallDao
) : SearchCatGateway {

    override suspend fun loadFromDatabase(text: String): List<CatCatch> =
        withContext(Dispatchers.IO) {
            if (text.isEmpty()) {
                emptyList()
            } else {
                mapModelsFromDatabase(dao.getCatLike("%$text%")?.sortedBy {
                    it.name
                } ?: emptyList())
            }
        }

    private fun mapModelsFromDatabase(list: List<CatBreed>) = list.map {
        CatCatch(
            it.name ?: "-",
            it.id
        )
    }

    override suspend fun loadFromInternet(request: Map<String, String>): List<CatCatch> {
        val response = api.getCatDescriptionAsync(request)
            .await()
        return suspendCoroutine { continuation ->
            continuation.resume(
                mapModels(response)
            )
        }
    }

    private fun mapModels(list: List<ChooseCatBreed>) = list.map {
        CatCatch(
            it.name ?: "-",
            it.id
        )
    }
}