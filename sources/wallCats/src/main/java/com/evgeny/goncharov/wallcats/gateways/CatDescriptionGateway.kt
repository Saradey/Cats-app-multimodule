package com.evgeny.goncharov.wallcats.gateways

import com.evgeny.goncharov.wallcats.model.view.CatDescription

/**
 * Контракт источника данных экрана описание кота
 */
interface CatDescriptionGateway {

    /**
     * Загрузить кота через интернет
     * @param catId id кота
     */
    suspend fun loadChooseCatFromInternet(catId: String): CatDescription?

    /**
     * Загрузить кота через базу данных
     * @param catId id кота
     */
    suspend fun loadChooseCatFromDatabase(catId: String): CatDescription?

    /**
     * Загрузить кота через базу данных
     * @param catId id кота
     */
    suspend fun loadChooseCatFromDatabaseSpare(catId: String): CatDescription?
}