package com.evgeny.goncharov.coreapi.rest

import com.evgeny.goncharov.coreapi.BREEDS_SEARCH_URL
import com.evgeny.goncharov.coreapi.HEADERS_VALUE
import com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreedDto
import com.evgeny.goncharov.coreapi.dto.request.GetChooseCatRequest
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.QueryMap

/**
 * Апи для поиска пород кошек по имени
 */
interface ApiCatSearch {

    /**
     * Запрос получить  список кошек по имени
     * @param request мапа параметров запроса
     * @see GetChooseCatRequest модель запроса которая формирует мапу
     */
    @Headers(HEADERS_VALUE)
    @GET(BREEDS_SEARCH_URL)
    fun getCatDescriptionAsync(@QueryMap request: Map<String, String>): Deferred<List<ChooseCatBreedDto>>
}