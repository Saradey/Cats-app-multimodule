package com.evgeny.goncharov.coreapi.rest

import com.evgeny.goncharov.coreapi.BREEDS_SEARCH_URL
import com.evgeny.goncharov.coreapi.HEADERS_VALUE
import com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.QueryMap

interface ApiCatSearch {

    @Headers(HEADERS_VALUE)
    @GET(BREEDS_SEARCH_URL)
    fun getCatDescriptionAsync(@QueryMap request: Map<String, String>): Deferred<List<ChooseCatBreed>>
}