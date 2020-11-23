package com.evgeny.goncharov.wallcats.gateways

import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.wallcats.model.request.WallCatRequest
import com.evgeny.goncharov.wallcats.model.view.CatBreedView

/**
 * Контракт источника данных стены котов
 */
interface WallCatGateway {

    /**
     * Загрузка котов из  интернета
     * @param request
     */
    suspend fun loadWallCatFromInternet(request: WallCatRequest): List<CatBreedView>

    /**
     * Загрузка котов из базы данных
     */
    suspend fun loadWallCatFromDatabase(): List<CatBreedView>

    /**
     * Получить тип сортировки
     */
    fun getSortType() : SortType
}