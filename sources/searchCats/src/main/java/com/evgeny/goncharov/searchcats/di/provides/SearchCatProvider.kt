package com.evgeny.goncharov.searchcats.di.provides

import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor

/**
 * Контракт провайдер для фитча поиска котов
 */
interface SearchCatProvider {

    fun provideWallCatsMediator(): WallCatsMediator

    fun provideSearchCatInteractor(): SearchCatInteractor

    fun provideThemeManager(): ThemeManager
}