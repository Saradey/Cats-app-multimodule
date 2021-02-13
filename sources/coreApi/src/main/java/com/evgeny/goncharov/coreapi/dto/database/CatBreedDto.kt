package com.evgeny.goncharov.coreapi.dto.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.evgeny.goncharov.coreapi.consts.CAT_BREED_TABLE_NAME
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Порода кота
 * @property description описание породы
 * @property name имя породы
 * @property lifeSpan сколько живет в годах
 * @property id породы
 * @property origin происхождение породы
 * @property temperament характер породы
 * @property wikipediaUrl ссылка на википедию
 * @property weight вес породы
 * @property urlImageCat ссылка на картинку как выглядит кошак
 */
@Entity(tableName = CAT_BREED_TABLE_NAME)
data class CatBreedDto(
    @SerializedName("description") val description: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("life_span") val lifeSpan: String? = null,
    @SerializedName("id") @PrimaryKey val id: String = "",
    @SerializedName("origin") val origin: String? = null,
    @SerializedName("temperament") val temperament: String? = null,
    @SerializedName("wikipedia_url") val wikipediaUrl: String? = null,
    @SerializedName("weight") val weight: WeightDto? = null,
    @Expose(serialize = false) var urlImageCat: String? = null
)