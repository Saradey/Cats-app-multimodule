package com.evgeny.goncharov.coreapi.mediators

import androidx.fragment.app.FragmentManager

/**
 * Медиатор для экранов стена котов и описание кота
 */
interface WallCatsMediator {

    /**
     * Переход на экран стены котов
     * @param supportFragmentManager для совершения транзакции фрагментов
     */
    fun goToTheWallCatsFragment(supportFragmentManager: FragmentManager)

    /**
     * Переход на экран описание кота
     * @param id кота
     * @param supportFragmentManager для совершения транзакции фрагментов
     */
    fun goToTheScreenCatDescription(id: String, supportFragmentManager: FragmentManager)
}