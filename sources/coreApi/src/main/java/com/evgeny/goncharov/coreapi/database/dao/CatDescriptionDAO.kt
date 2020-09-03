package com.evgeny.goncharov.coreapi.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed

@Dao
interface CatDescriptionDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(model: ChooseCatBreed)

    @Query("SELECT * FROM choose_cat_breed WHERE name = :name")
    fun selectModelFromId(name: String): ChooseCatBreed
}