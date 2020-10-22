package com.evgeny.goncharov.coreimpl.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.evgeny.goncharov.coreapi.VERSION_DATA_BASE
import com.evgeny.goncharov.coreapi.database.DatabaseContract
import com.evgeny.goncharov.coreapi.dto.converters.WeightTypeConverter
import com.evgeny.goncharov.coreapi.dto.database.CatBreed
import com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed

/**
 * Главный класс базы данных поставляющий DAO
 */
@Database(version = VERSION_DATA_BASE, entities = [CatBreed::class, ChooseCatBreed::class])
@TypeConverters(value = [WeightTypeConverter::class])
abstract class AppDatabase : RoomDatabase(), DatabaseContract