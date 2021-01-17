package com.evgeny.goncharov.settings.di.provides

import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.domain.SortTypeViewModel
import com.evgeny.goncharov.settings.interactor.SettingsInteractor
import com.evgeny.goncharov.settings.view.model.SettingsViewModel

interface SettingsProvides {

    fun provideInteractor(): SettingsInteractor

    fun provideThemeManager(): ThemeManager

    fun provideSortViewModel(): SortTypeViewModel

    fun provideSettingsViewModel(): SettingsViewModel
}