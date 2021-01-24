package com.evgeny.goncharov.coreapi.database

import com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO
import com.evgeny.goncharov.coreapi.database.dao.CatsWallDAO

/**
 * Контракт который возвращает DAO
 */
interface DatabaseContract {

    /**
     * DAO для экрана стены котов
     */
    fun createCatsWallDao(): CatsWallDAO

    /**
     * DAO для экрана описания кота
     */
    fun createCatDescriptionDAO(): CatDescriptionDAO
}