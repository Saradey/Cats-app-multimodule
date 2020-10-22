package com.evgeny.goncharov.coreapi.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed

/**
 * DAO для модели:
 * @see ChooseCatBreed
 */
@Dao
interface CatDescriptionDAO {

    /**
     * Записываем, в случае конфликта перезаписываем
     * @param model выбранный кот
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(model: ChooseCatBreed)

    /**
     * Получить кота по его имени
     * @param name имя кота
     */
    @Query("SELECT * FROM choose_cat_breed WHERE name = :name")
    fun selectModelFromId(name: String): ChooseCatBreed
}