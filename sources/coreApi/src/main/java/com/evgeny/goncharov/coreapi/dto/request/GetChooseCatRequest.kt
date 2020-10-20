package com.evgeny.goncharov.coreapi.dto.request

import com.evgeny.goncharov.coreapi.GET_PARAM_Q_SEARCH

/**
 * Запрос на получение списка котов по имени или по id
 * @property nameCat имя или id
 */
class GetChooseCatRequest(
    private val nameCat: String
) {

    /**
     * Метод реализации запроса {@link GetChooseCatRequest#createRequest}
     * @return
     */
    fun createRequest(): Map<String, String> = hashMapOf(Pair(GET_PARAM_Q_SEARCH, nameCat))
}