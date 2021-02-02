package com.evgeny.goncharov.splashscreen.analytics.events

import android.os.Bundle
import com.evgeny.goncharov.coreapi.consts.BaseAnalyticsEvent
import com.evgeny.goncharov.coreapi.consts.START_APPLICATION_EVENT

/**
 * Эвент в аналитику, запуск приложения
 */
object StartAppEvent : BaseAnalyticsEvent() {
    override var bundle: Bundle = Bundle()
    override var event: String = START_APPLICATION_EVENT
}