package com.evgeny.goncharov.wallcats.services

import com.evgeny.goncharov.coreapi.dto.database.CatBreedDto
import com.evgeny.goncharov.wallcats.model.request.GetImageRequest
import com.evgeny.goncharov.wallcats.model.request.WallCatRequest
import com.evgeny.goncharov.wallcats.model.response.CatBreedImageDto
import kotlinx.coroutines.Deferred

/**
 * Контракт загрузки пород кошек
 */
interface ServiceBreeds {

    /**
     * Запрос, получить стену котов и отобразить это в аналитике
     * @param request параметры для запроса
     * @see WallCatRequest параметры запроса
     */
    fun getBreedsAsync(request: Map<String, Int>): Deferred<List<CatBreedDto>>

    /**
     * Запрос, получить стену котов и отобразить это в аналитике
     * @param request параметры для запроса
     * @see GetImageRequest параметры запроса
     */
    fun getImageUrlAsync(request: Map<String, String>): Deferred<List<CatBreedImageDto>>
}