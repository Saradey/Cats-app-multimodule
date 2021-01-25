package com.evgeny.goncharov.wallcats.model.response

import com.google.gson.annotations.SerializedName

/**
 * Модель ответа в которо содержится урл картинки кота
 * @property url урл картинки кота для Glide
 */
data class CatBreedImageDto(
    @SerializedName("url") val url: String
)