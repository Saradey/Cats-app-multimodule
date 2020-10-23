package com.evgeny.goncharov.settings.di.provides

import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.settings.interactor.SettingsInteractor
import com.evgeny.goncharov.settings.view.model.SettingsViewModel

interface SettingsProvides {

    fun provideSettingsViewModel(): SettingsViewModel

    fun provideInteractor(): SettingsInteractor

    fun provideThemeManager(): ThemeManager
}