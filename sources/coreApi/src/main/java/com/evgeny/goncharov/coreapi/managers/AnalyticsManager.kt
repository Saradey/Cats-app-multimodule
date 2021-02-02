package com.evgeny.goncharov.coreapi.managers

import com.evgeny.goncharov.coreapi.consts.BaseAnalyticsEvent

/**
 * Контракт менеджера аналитики
 */
interface AnalyticsManager {

    /**
     * Дергается когда происходит событие в приложении
     * @param event наш эвент
     */
    fun toEvent(event: BaseAnalyticsEvent)
}