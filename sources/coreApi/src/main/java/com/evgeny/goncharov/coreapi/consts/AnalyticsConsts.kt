package com.evgeny.goncharov.coreapi.consts

import android.os.Bundle

///////////эвенты
/** Событие старта приложения */
const val START_APPLICATION_EVENT = "start_app"

/** Событие загрузки стены котов */
const val LOAD_WALL_CATS_EVENT = "load_wall_cats"

/** Событие ошибки загрузки стены котов */
const val FATAL_LOAD_WALL_CATS_EVENT = "fatal_load_wall_cats"

/** Событие загрузки изображения кота */
const val LOAD_IMAGE_CAT_EVENT = "load_image_cat"

/** Событие ошибкт загрузки изображения кота */
const val FATAL_LOAD_IMAGE_CAT_EVENT = "fatal_load_image_cat"

///////////параметры
/** Параметр id кота */
const val IMAGE_CAT_ID_PARAM = "id_cat_load_image"

/** Параметр текст сообщения ошибки */
const val FATAL_LOAD_MESSAGE_PARAM = "fatal_load_message"

/**
 * Базовый класс который содержит метоинформацию об аналитике
 */
open class BaseAnalyticsEvent {
    /** Для параметров эвента */
    open lateinit var bundle: Bundle

    /** Для индификтора эвентов */
    open lateinit var event: String
}