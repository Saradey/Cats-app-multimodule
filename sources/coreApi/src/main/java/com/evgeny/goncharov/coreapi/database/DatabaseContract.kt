package com.evgeny.goncharov.coreapi.database

import com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO
import com.evgeny.goncharov.coreapi.database.dao.CatsWallDao

/**
 * Контракт который возвращает DAO
 */
interface DatabaseContract {

    /**
     * DAO для экрана стены котов
     */
    fun createCatsWallDao(): CatsWallDao

    /**
     * DAO для экрана описания кота
     */
    fun createCatDescriptionDAO(): CatDescriptionDAO
}