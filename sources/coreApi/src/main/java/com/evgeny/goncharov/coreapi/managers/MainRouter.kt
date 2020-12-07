package com.evgeny.goncharov.coreapi.managers

/**
 * Контракт отвечающий за нажатие бекпрессед
 */
interface MainRouter {

    /**
     * Срабатывает когда нажали бекпрессед
     */
    fun onBackPressed()

    /**
     * Для установки флага, запущен сплеш скрин или нет
     * @param isInit true сплеш скрин запущен false не запущен
     */
    fun splashScreenIsInit(isInit: Boolean)
}