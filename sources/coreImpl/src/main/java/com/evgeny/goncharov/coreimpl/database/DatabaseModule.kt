package com.evgeny.goncharov.coreimpl.database

import android.content.Context
import androidx.room.Room
import com.evgeny.goncharov.coreapi.consts.DATA_BASE_NAME
import com.evgeny.goncharov.coreapi.database.DatabaseContract
import com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO
import com.evgeny.goncharov.coreapi.database.dao.CatsWallDAO
import com.evgeny.goncharov.coreapi.qualifier.AppContext
import com.evgeny.goncharov.coreapi.scope.AppScope
import dagger.Module
import dagger.Provides
import dagger.Reusable

/**
 * Модуль для провайда базы данных и DAO
 */
@Module
object DatabaseModule {

    @AppScope
    @Provides
    @JvmStatic
    fun provideDatabaseContract(@AppContext context: Context): DatabaseContract =
        Room.databaseBuilder(context, AppDatabase::class.java, DATA_BASE_NAME).build()

    @Provides
    @JvmStatic
    @Reusable
    fun provideCatDescriptionDAO(appDatabase: DatabaseContract): CatDescriptionDAO =
        appDatabase.createCatDescriptionDAO()

    @Provides
    @JvmStatic
    @Reusable
    fun provideCatsWallDao(appDatabase: DatabaseContract): CatsWallDAO =
        appDatabase.createCatsWallDao()
}