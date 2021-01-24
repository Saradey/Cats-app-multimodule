package com.evgeny.goncharov.coreapi.providers

import com.evgeny.goncharov.coreapi.database.DatabaseContract
import com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO
import com.evgeny.goncharov.coreapi.database.dao.CatsWallDAO

/**
 * Контракт провайдер базы данны
 */
interface DatabaseProvider {

    /**
     * Провайдит контракт который предоставляет DAO
     */
    fun provideDatabase(): DatabaseContract

    /**
     * Провайдит DAO для фрагмента стены котов
     */
    fun provideCatsWallDao(): CatsWallDAO

    /**
     * Провайдит DAO для фрагмента описание кота
     */
    fun provideCatDescriptionDAO(): CatDescriptionDAO
}