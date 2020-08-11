package com.evgeny.goncharov.coreapi.database

import com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO
import com.evgeny.goncharov.coreapi.database.dao.CatsWallDao

interface DatabaseContract {

    fun createCatsWallDao(): CatsWallDao

    fun createCatDescriptionDAO(): CatDescriptionDAO
}