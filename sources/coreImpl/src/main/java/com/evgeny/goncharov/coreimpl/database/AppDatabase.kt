package com.evgeny.goncharov.coreimpl.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.evgeny.goncharov.coreapi.consts.VERSION_DATA_BASE
import com.evgeny.goncharov.coreapi.database.DatabaseContract
import com.evgeny.goncharov.coreapi.dto.converters.WeightTypeConverter
import com.evgeny.goncharov.coreapi.dto.database.CatBreedDto
import com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreedDto

/**
 * Главный класс базы данных поставляющий DAO
 */
@Database(version = VERSION_DATA_BASE, entities = [CatBreedDto::class, ChooseCatBreedDto::class])
@TypeConverters(value = [WeightTypeConverter::class])
abstract class AppDatabase : RoomDatabase(), DatabaseContract