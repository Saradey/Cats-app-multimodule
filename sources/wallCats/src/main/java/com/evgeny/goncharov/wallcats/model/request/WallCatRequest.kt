package com.evgeny.goncharov.wallcats.model.request

import com.evgeny.goncharov.coreapi.GET_PARAM_LIMIT
import com.evgeny.goncharov.coreapi.GET_PARAM_PAGE

/**
 * Модель для запроса очередной порции котов
 * @property limit загружаемая страница
 * @property page номер страницы
 */
class WallCatRequest(
    private val limit: Int,
    private val page: Int
) {

    /**
     * Формируем Map запроса
     */
    fun createRequest(): Map<String, Int> = hashMapOf(
        Pair(GET_PARAM_LIMIT, limit),
        Pair(GET_PARAM_PAGE, page)
    )
}