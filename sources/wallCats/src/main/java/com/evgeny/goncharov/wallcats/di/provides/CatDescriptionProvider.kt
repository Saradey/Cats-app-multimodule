package com.evgeny.goncharov.wallcats.di.provides

import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor
import com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel

interface CatDescriptionProvider {

    fun provideCatDescriptionViewModel(): CatDescriptionViewModel

    fun provideInteractor() : CatDescriptionInteractor

    fun provideThemeManager() : ThemeManager
}