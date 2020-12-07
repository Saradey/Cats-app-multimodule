package com.evgeny.goncharov.wallcats.rest

import com.evgeny.goncharov.coreapi.BREEDS_URL
import com.evgeny.goncharov.coreapi.HEADERS_VALUE
import com.evgeny.goncharov.coreapi.IMAGE_SEARCH_URL
import com.evgeny.goncharov.coreapi.dto.database.CatBreed
import com.evgeny.goncharov.wallcats.model.request.GetImageRequest
import com.evgeny.goncharov.wallcats.model.request.WallCatRequest
import com.evgeny.goncharov.wallcats.model.response.CatBreedImage
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.QueryMap

/**
 * Апи для загрузки стены котов и загрузки картинки
 */
interface ApiBreeds {

    /**
     * Запрос, получить стену котов
     * @param request параметры для запроса
     * @see WallCatRequest параметры запроса
     */
    @Headers(HEADERS_VALUE)
    @GET(BREEDS_URL)
    fun getBreedsAsync(@QueryMap request: Map<String, Int>): Deferred<List<CatBreed>>

    /**
     * Запрос, получить url изображения
     * @param request параметры для запроса
     * @see GetImageRequest параметры запроса
     */
    @Headers(HEADERS_VALUE)
    @GET(IMAGE_SEARCH_URL)
    fun getImageUrlAsync(@QueryMap request: Map<String, String>): Deferred<List<CatBreedImage>>
}