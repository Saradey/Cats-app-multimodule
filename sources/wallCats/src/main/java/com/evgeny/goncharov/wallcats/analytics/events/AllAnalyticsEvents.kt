package com.evgeny.goncharov.wallcats.analytics.events

import android.os.Bundle
import com.evgeny.goncharov.coreapi.consts.*

/**
 * Событие загрузки стены котов
 */
object LoadWallCatsEvents : BaseAnalyticsEvent() {

    override var bundle: Bundle = Bundle()

    override var event: String = LOAD_WALL_CATS_EVENT
}

/**
 * Событие ошибки загрузки стены котов
 */
object FatalLoadWallCatsEvents : BaseAnalyticsEvent() {

    override var event: String = FATAL_LOAD_WALL_CATS_EVENT
}

/**
 * Событие загрузки изображения кота
 */
object LoadImageCat : BaseAnalyticsEvent() {

    override var event: String = LOAD_IMAGE_CAT_EVENT
}

/**
 * Событие ошибки загрузки картинки кота
 */
object FatalLoadImageCat : BaseAnalyticsEvent() {

    override var event: String = FATAL_LOAD_IMAGE_CAT_EVENT
}