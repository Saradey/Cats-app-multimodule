package com.evgeny.goncharov.searchcats.di.provides

import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor
import com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel

interface SearchCatProvider {

    fun provideSearchCatViewModel(): SearchCatViewModel

    fun provideWallCatsMediator(): WallCatsMediator

    fun provideSearchCatInteractor(): SearchCatInteractor

    fun provideThemeManager(): ThemeManager
}