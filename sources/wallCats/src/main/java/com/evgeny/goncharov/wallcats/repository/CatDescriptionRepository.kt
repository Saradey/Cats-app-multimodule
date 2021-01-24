package com.evgeny.goncharov.wallcats.repository

import com.evgeny.goncharov.wallcats.model.view.CatDescriptionEntity

/**
 * Контракт источника данных экрана описание кота
 */
interface CatDescriptionRepository {

    /**
     * Загрузить кота через интернет
     * @param catId id кота
     */
    suspend fun loadChooseCatFromInternet(catId: String): CatDescriptionEntity?

    /**
     * Загрузить кота через базу данных
     * @param catId id кота
     */
    suspend fun loadChooseCatFromDatabase(catId: String): CatDescriptionEntity?

    /**
     * Загрузить кота через базу данных
     * @param catId id кота
     */
    suspend fun loadChooseCatFromDatabaseSpare(catId: String): CatDescriptionEntity?
}