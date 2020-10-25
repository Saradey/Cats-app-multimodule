package com.evgeny.goncharov.wallcats.di.provides

import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractor
import com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel

interface WallCatsProvider {

    fun provideInteractor(): WallCatInteractor

    fun provideWallCatsViewModel(): WallCatsViewModel

    fun provideThemeManager(): ThemeManager
}