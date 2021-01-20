package com.evgeny.goncharov.wallcats.managers

import androidx.fragment.app.FragmentManager

/**
 * Контракт менеджера отвечающего за навигацию на экране стены котов
 */
interface NavigationWallCatsManager {

    fun goToTheScreenCatDescription(id: String, requireFragmentManager: FragmentManager)

    fun goToTheSearchScreen(requireFragmentManager: FragmentManager)

    fun goToTheSettingsScreen(requireFragmentManager: FragmentManager)
}