package com.evgeny.goncharov.coreapi.managers

interface MainRouter {

    /**
     * Срабатывает когда нажали бекпрессед
     */
    fun onBackPressed()

    /**
     * Для установки флага, запущен сплеш скрин или нет
     * @param isInit true сплеш скрин запущен false не запущен
     */
    fun slashScreenIsInit(isInit: Boolean)
}