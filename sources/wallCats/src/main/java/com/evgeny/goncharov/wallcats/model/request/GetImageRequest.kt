package com.evgeny.goncharov.wallcats.model.request

import com.evgeny.goncharov.coreapi.GET_PARAM_BREED_ID

class GetImageRequest(
    private val breedId: String
) {

    fun createRequest(): Map<String, String> {
        return hashMapOf<String, String>(Pair(GET_PARAM_BREED_ID, breedId))
    }
}