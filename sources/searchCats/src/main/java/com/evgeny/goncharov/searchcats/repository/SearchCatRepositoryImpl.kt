package com.evgeny.goncharov.searchcats.repository

import com.evgeny.goncharov.coreapi.database.dao.CatsWallDAO
import com.evgeny.goncharov.coreapi.dto.database.CatBreedDto
import com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreedDto
import com.evgeny.goncharov.coreapi.rest.ApiCatSearch
import com.evgeny.goncharov.searchcats.model.CatCatchEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Реализация логики источника данных искомых котов
 * @property api апи для запросов в сеть
 * @property dao дао для запросов в базу данных
 */
class SearchCatRepositoryImpl @Inject constructor(
    private val api: ApiCatSearch,
    private val dao: CatsWallDAO
) : SearchCatRepository {

    override suspend fun loadFromDatabase(text: String) = withContext(Dispatchers.IO) {
        if (text.isEmpty()) {
            emptyList()
        } else {
            mapModelsFromDatabase(dao.getCatLike("%$text%")?.sortedBy {
                it.name
            } ?: emptyList())
        }
    }

    private fun mapModelsFromDatabase(list: List<CatBreedDto>) = list.map {
        CatCatchEntity(
            catName = it.name ?: "-",
            catId = it.id
        )
    }

    override suspend fun loadFromInternet(request: Map<String, String>): List<CatCatchEntity> {
        val response = api.getCatDescriptionAsync(request)
            .await()
        return mapModels(response)
    }

    private fun mapModels(list: List<ChooseCatBreedDto>) = list.map {
        CatCatchEntity(
            catName = it.name ?: "-",
            catId = it.id
        )
    }
}