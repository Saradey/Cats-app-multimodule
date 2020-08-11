package com.evgeny.goncharov.settings.di.modules

import androidx.lifecycle.ViewModelProviders
import com.evgeny.goncharov.settings.ui.SettingsFragment
import com.evgeny.goncharov.settings.view.model.SettingsViewModel
import com.evgeny.goncharov.settings.view.model.SettingsViewModelImpl
import dagger.Module
import dagger.Provides

@Module
object SettingsProvidesModule {

    @Provides
    @JvmStatic
    fun provideSettingsViewModel(fragment: SettingsFragment): SettingsViewModel =
        ViewModelProviders.of(fragment).get(SettingsViewModelImpl::class.java)
}