package com.evgeny.goncharov.coreapi.dto.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.evgeny.goncharov.coreapi.consts.CHOOSE_CAT_BREED_TABLE_NAME
import com.google.gson.annotations.SerializedName

/**
 * Модель описание конкретной породы
 * @property id породы
 * @property weight веси породы
 * @property name имя породы
 * @property temperament характер породы
 * @property origin происхождение породы
 * @property description описанеи породы
 * @property lifeSpan сколько живет в годах
 * @property wikipediaUrl ссылка на википедию
 */
@Entity(tableName = CHOOSE_CAT_BREED_TABLE_NAME)
data class ChooseCatBreedDto(
    @SerializedName("id") @PrimaryKey val id: String = "",
    @SerializedName("weight") val weight: WeightDto? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("temperament") val temperament: String? = null,
    @SerializedName("origin") val origin: String? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("life_span") val lifeSpan: String? = null,
    @SerializedName("wikipedia_url") val wikipediaUrl: String? = null
)