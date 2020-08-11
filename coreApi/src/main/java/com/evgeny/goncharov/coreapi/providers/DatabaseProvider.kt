package com.evgeny.goncharov.coreapi.providers

import com.evgeny.goncharov.coreapi.database.DatabaseContract
import com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO
import com.evgeny.goncharov.coreapi.database.dao.CatsWallDao

interface DatabaseProvider {

    fun provideDatabase(): DatabaseContract

    fun provideCatsWallDao(): CatsWallDao

    fun provideCatDescriptionDAO(): CatDescriptionDAO
}