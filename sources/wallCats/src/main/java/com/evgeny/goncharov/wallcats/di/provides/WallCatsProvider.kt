package com.evgeny.goncharov.wallcats.di.provides

import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.domain.SortTypeViewModel
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractor
import com.evgeny.goncharov.wallcats.managers.WorkScheduleManager

interface WallCatsProvider {

    fun provideInteractor(): WallCatInteractor

    fun provideThemeManager(): ThemeManager

    fun provideSortViewModel(): SortTypeViewModel

    fun provideWorkScheduleManager(): WorkScheduleManager
}