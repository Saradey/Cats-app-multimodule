package com.evgeny.goncharov.coreapi.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.evgeny.goncharov.coreapi.dto.database.CatBreed

/**
 * DAO для модели:
 * @see CatBreed
 */
@Dao
interface CatsWallDao {

    /**
     * Записываем в базу данных, если конфликт то перезаписываес
     * @param models список котов
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertWallCat(models: List<CatBreed>)

    /**
     * Получить всех котов
     */
    @Query("SELECT * FROM cat_breed")
    fun getCatBreed(): List<CatBreed>

    /**
     * Получить кота по его id
     * @param id породы
     */
    @Query("SELECT * FROM cat_breed WHERE id = :id")
    fun getCatFromId(id: String): CatBreed?

    /**
     * Получить котов у которых совпадает:
     * @see CatBreed.name
     * @see CatBreed.id
     */
    @Query("SELECT * FROM cat_breed WHERE name OR id LIKE :value")
    fun getCatLike(value: String): List<CatBreed>?
}