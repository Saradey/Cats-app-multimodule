package com.evgeny.goncharov.settings.di.modules

import androidx.lifecycle.ViewModelProviders
import com.evgeny.goncharov.settings.ui.SettingsFragment
import com.evgeny.goncharov.settings.view.model.SettingsViewModel
import dagger.Module
import dagger.Provides

@Module
object SettingsProvidesModule {

    @Provides
    @JvmStatic
    fun provideSettingsViewModel(fragment: SettingsFragment) =
        ViewModelProviders.of(fragment).get(SettingsViewModel::class.java)
}