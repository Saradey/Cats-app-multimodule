package com.evgeny.goncharov.wallcats.model.request

import com.evgeny.goncharov.coreapi.consts.GET_PARAM_BREED_ID

/**
 * Модель для запроса получить картинку кота
 * @property breedId id кота
 */
data class GetImageRequest(
    private val breedId: String
) {

    /**
     * Формируем Map запроса
     */
    fun createRequest(): Map<String, String> {
        return hashMapOf<String, String>(Pair(GET_PARAM_BREED_ID, breedId))
    }
}