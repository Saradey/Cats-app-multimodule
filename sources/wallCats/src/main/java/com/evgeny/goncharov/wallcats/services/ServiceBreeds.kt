package com.evgeny.goncharov.wallcats.services

import com.evgeny.goncharov.coreapi.dto.database.CatBreedDto
import com.evgeny.goncharov.wallcats.model.response.CatBreedImageDto
import kotlinx.coroutines.Deferred

/**
 * Контракт загрузки пород кошек
 */
interface ServiceBreeds {

    fun getBreedsAsync(createRequest: Map<String, Int>): Deferred<List<CatBreedDto>>

    fun getImageUrlAsync(createRequest: Map<String, String>): Deferred<List<CatBreedImageDto>>
}