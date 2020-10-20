package com.evgeny.goncharov.coreapi.mediators

import androidx.fragment.app.FragmentManager

/**
 * Медиатор для экрана сплеш скрина
 */
interface SplashScreenMediator {

    /**
     * Переход на экран сплеш скрина
     * @param supportFragmentManager для совершения транзакции фрагментов
     */
    fun showSplashScreen(supportFragmentManager: FragmentManager)
}