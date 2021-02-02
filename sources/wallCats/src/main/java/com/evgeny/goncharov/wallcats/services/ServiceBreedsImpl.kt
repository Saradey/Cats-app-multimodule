package com.evgeny.goncharov.wallcats.services

import androidx.core.os.bundleOf
import com.evgeny.goncharov.coreapi.consts.GET_PARAM_BREED_ID
import com.evgeny.goncharov.coreapi.consts.IMAGE_CAT_ID_PARAM
import com.evgeny.goncharov.coreapi.dto.database.CatBreedDto
import com.evgeny.goncharov.coreapi.managers.AnalyticsManager
import com.evgeny.goncharov.wallcats.analytics.events.LoadImageCat
import com.evgeny.goncharov.wallcats.analytics.events.LoadWallCatsEvents
import com.evgeny.goncharov.wallcats.model.response.CatBreedImageDto
import com.evgeny.goncharov.wallcats.rest.ApiBreeds
import kotlinx.coroutines.Deferred
import javax.inject.Inject

/**
 * Реализация загрузки пород кошек
 * @property api для загрузки котов из сети
 * @property analyticsManager менеджер для аналитики в данном случае трекание загрузок из сети
 */
class ServiceBreedsImpl @Inject constructor(
    private val api: ApiBreeds,
    private val analyticsManager: AnalyticsManager
) : ServiceBreeds {

    override fun getBreedsAsync(createRequest: Map<String, Int>): Deferred<List<CatBreedDto>> {
        analyticsManager.toEvent(LoadWallCatsEvents)
        return api.getBreedsAsync(createRequest)
    }

    override fun getImageUrlAsync(createRequest: Map<String, String>): Deferred<List<CatBreedImageDto>> {
        analyticsManager.toEvent(LoadImageCat.apply {
            bundle = bundleOf(Pair(IMAGE_CAT_ID_PARAM, createRequest[GET_PARAM_BREED_ID]))
        })
        return api.getImageUrlAsync(createRequest)
    }
}