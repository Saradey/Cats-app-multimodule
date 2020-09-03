package com.evgeny.goncharov.coreapi.dto.request

import com.evgeny.goncharov.coreapi.GET_PARAM_Q_SEARCH

class GetChooseCatRequest(
    private val nameCat: String
) {

    fun createRequest(): Map<String, String> = hashMapOf(Pair(GET_PARAM_Q_SEARCH, nameCat))
}