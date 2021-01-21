package com.evgeny.goncharov.wallcats.managers

import androidx.fragment.app.FragmentManager

/**
 * Контракт менеджера отвечающего за навигацию на экране стены котов
 */
interface NavigationWallCatsManager {

    /**
     * Перейти на стену описания кота
     * @param id айдишник кота
     * @param requireFragmentManager для проброски в медиатор
     */
    fun goToTheScreenCatDescription(id: String, requireFragmentManager: FragmentManager)

    /**
     * Перейти на стену поиска котов
     * @param requireFragmentManager для проброски в медиатор
     */
    fun goToTheSearchScreen(requireFragmentManager: FragmentManager)

    /**
     * Перейти на экран настроек
     * @param requireFragmentManager для проброски в медиатор
     */
    fun goToTheSettingsScreen(requireFragmentManager: FragmentManager)
}