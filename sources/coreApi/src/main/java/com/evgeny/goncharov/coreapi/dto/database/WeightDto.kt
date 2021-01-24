package com.evgeny.goncharov.coreapi.dto.database

import com.google.gson.annotations.SerializedName

/**
 * Вес
 * @property imperial
 * @property metric
 */
data class WeightDto(
    @SerializedName("imperial") val imperial: String? = null,
    @SerializedName("metric") val metric: String? = null
)