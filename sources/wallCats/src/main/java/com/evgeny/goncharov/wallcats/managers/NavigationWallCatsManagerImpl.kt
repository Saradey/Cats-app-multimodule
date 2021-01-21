package com.evgeny.goncharov.wallcats.managers

import androidx.fragment.app.FragmentManager
import com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator
import com.evgeny.goncharov.coreapi.mediators.SettingsMediator
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import javax.inject.Inject

/**
 * Реализация контракта менеджера отвечающего за навигацию на экране стены котов
 * @param wallCatsMediator медиатор для перехода на экран описания кота
 * @param searchMediator Для перехода на экран поиска котов
 * @param settingsMediator Для перехода на экран настроек
 */
class NavigationWallCatsManagerImpl @Inject constructor(
    private val wallCatsMediator: WallCatsMediator,
    private val searchMediator: SearchCatsMediator,
    private val settingsMediator: SettingsMediator
) : NavigationWallCatsManager {

    override fun goToTheScreenCatDescription(id: String, requireFragmentManager: FragmentManager) {
        wallCatsMediator.goToTheScreenCatDescription(id, requireFragmentManager)
    }

    override fun goToTheSearchScreen(requireFragmentManager: FragmentManager) {
        searchMediator.goToTheSearchScreen(requireFragmentManager)
    }

    override fun goToTheSettingsScreen(requireFragmentManager: FragmentManager) {
        settingsMediator.goToTheSettingsScreen(requireFragmentManager)
    }
}