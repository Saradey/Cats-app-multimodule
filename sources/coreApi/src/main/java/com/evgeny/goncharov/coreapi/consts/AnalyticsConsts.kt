package com.evgeny.goncharov.coreapi.consts

import android.os.Bundle

/** Событие старта приложения */
const val START_APPLICATION_EVENT = "start_app"

/** Событие загрузки стены котов */
const val LOAD_WALL_CATS_EVENT = "load_wall_cats"

/** Событие выбора кота */
const val CHOOSE_CAT_EVENT = "choose_cat"

/**
 * Базовый класс который содержит метоинформацию об аналитике
 */
open class BaseAnalyticsEvent {
    /** Для параметров эвента */
    open lateinit var bundle: Bundle

    /** Для индификтора эвентов */
    open lateinit var event: String
}