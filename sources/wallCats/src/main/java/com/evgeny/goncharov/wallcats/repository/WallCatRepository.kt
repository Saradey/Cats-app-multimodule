package com.evgeny.goncharov.wallcats.repository

import com.evgeny.goncharov.wallcats.model.request.WallCatRequest
import com.evgeny.goncharov.wallcats.model.view.CatBreedEntity

/**
 * Контракт источника данных стены котов
 */
interface WallCatRepository {

    /**
     * Загрузка котов из интернета
     * @param request
     */
    suspend fun loadWallCatFromInternet(request: WallCatRequest): List<CatBreedEntity>

    /**
     * Загрузка котов из базы данных
     */
    suspend fun loadWallCatFromDatabase(): List<CatBreedEntity>
}