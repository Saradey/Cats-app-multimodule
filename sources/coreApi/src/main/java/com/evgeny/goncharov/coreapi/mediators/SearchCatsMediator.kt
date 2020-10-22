package com.evgeny.goncharov.coreapi.mediators

import androidx.fragment.app.FragmentManager

/**
 * Медиатор для экрана поиска котов
 */
interface SearchCatsMediator {

    /**
     * Переход на экран поиска котов
     * @param manager для совершения транзакции фрагментов
     */
    fun goToTheSearchScreen(supportFragmentManager: FragmentManager)
}