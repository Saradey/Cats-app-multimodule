package com.evgeny.goncharov.coreapi.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.evgeny.goncharov.coreapi.dto.database.CatBreedDto

/**
 * DAO для модели:
 * @see CatBreedDto
 */
@Dao
interface CatsWallDAO {

    /**
     * Записываем в базу данных, если конфликт то перезаписываес
     * @param models список котов
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertWallCat(models: List<CatBreedDto>)

    /**
     * Получить всех котов
     */
    @Query("SELECT * FROM cat_breed")
    fun getCatBreed(): List<CatBreedDto>

    /**
     * Получить кота по его id
     * @param id породы
     */
    @Query("SELECT * FROM cat_breed WHERE id = :id")
    fun getCatFromId(id: String): CatBreedDto?

    /**
     * Получить котов у которых совпадает:
     * @see CatBreedDto.name
     * @see CatBreedDto.id
     */
    @Query("SELECT * FROM cat_breed WHERE name LIKE :value")
    fun getCatLike(value: String): List<CatBreedDto>?
}