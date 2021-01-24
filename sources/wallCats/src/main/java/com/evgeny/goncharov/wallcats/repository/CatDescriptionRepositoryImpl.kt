package com.evgeny.goncharov.wallcats.repository

import com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO
import com.evgeny.goncharov.coreapi.database.dao.CatsWallDAO
import com.evgeny.goncharov.coreapi.dto.database.CatBreedDto
import com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreedDto
import com.evgeny.goncharov.coreapi.dto.request.GetChooseCatRequest
import com.evgeny.goncharov.coreapi.exception.ChooseCateNullPointerException
import com.evgeny.goncharov.coreapi.rest.ApiCatSearch
import com.evgeny.goncharov.wallcats.model.view.CatDescriptionEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Реализация логики источника данных экрана описание кота
 * @property api для загрузки искомого кота
 * @property dao для загрузки искомого кота из базы данных
 * @property daoWallCat для загрузки искомого кота из базы данных
 */
class CatDescriptionRepositoryImpl @Inject constructor(
    private val api: ApiCatSearch,
    private val dao: CatDescriptionDAO,
    private val daoWallCat: CatsWallDAO
) : CatDescriptionRepository {

    override suspend fun loadChooseCatFromInternet(catId: String) = withContext(Dispatchers.IO) {
        val model = api.getCatDescriptionAsync(
            GetChooseCatRequest(catId).createRequest()
        ).await().firstOrNull()
        model?.let {
            dao.insert(model)
        } ?: let {
            throw ChooseCateNullPointerException()
        }
        mapModel(model)
    }

    override suspend fun loadChooseCatFromDatabase(catId: String) = withContext(Dispatchers.IO) {
        val model = dao.selectModelFromId(catId)
        mapModel(model)
    }

    private fun mapModel(model: ChooseCatBreedDto?) = if (model != null) {
        CatDescriptionEntity(
            name = model.name ?: "-",
            urlImage = getUrlImageFromDataBase(model.id) ?: "null",
            origin = model.origin ?: "-",
            lifeSpan = model.lifeSpan ?: "-",
            weight = model.weight?.metric ?: "-",
            temperament = model.temperament ?: "-",
            description = model.description ?: "-",
            urlWiki = model.wikipediaUrl ?: "-"
        )
    } else {
        null
    }

    private fun getUrlImageFromDataBase(id: String?) =
        daoWallCat.getCatFromId(id ?: "")?.urlImageCat

    override suspend fun loadChooseCatFromDatabaseSpare(catId: String) =
        withContext(Dispatchers.IO) {
            val model = daoWallCat.getCatFromId(catId)
            mapModel(model)
        }

    private fun mapModel(model: CatBreedDto?) = CatDescriptionEntity(
        name = model?.name ?: "-",
        urlImage = getUrlImageFromDataBase(model?.id) ?: "null",
        origin = model?.origin ?: "-",
        lifeSpan = model?.lifeSpan ?: "-",
        weight = model?.weight?.metric ?: "-",
        temperament = model?.temperament ?: "-",
        description = model?.description ?: "-",
        urlWiki = model?.wikipediaUrl ?: "-"
    )
}