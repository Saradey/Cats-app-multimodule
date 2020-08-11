package com.evgeny.goncharov.wallcats.model.response

import com.google.gson.annotations.SerializedName

data class CatBreedImage(
    @SerializedName("url") val url: String
)