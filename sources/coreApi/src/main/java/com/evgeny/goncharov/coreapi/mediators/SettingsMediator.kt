package com.evgeny.goncharov.coreapi.mediators

import androidx.fragment.app.FragmentManager

/**
 * Медиатор для экрана настроек
 */
interface SettingsMediator {

    /**
     * Переход на экран настроек
     * @param supportFragmentManager для совершения транзакции фрагментов
     */
    fun goToTheSettingsScreen(supportFragmentManager: FragmentManager)
}