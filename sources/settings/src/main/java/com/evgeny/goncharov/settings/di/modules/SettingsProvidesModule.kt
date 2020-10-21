package com.evgeny.goncharov.settings.di.modules

import androidx.lifecycle.ViewModelProviders
import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.settings.ui.SettingsFragment
import com.evgeny.goncharov.settings.view.model.SettingsViewModel
import dagger.Module
import dagger.Provides

/**
 * Провайд модуль для создания вьюмодели экрана настрок
 */
@Module
object SettingsProvidesModule {

    @Provides
    @JvmStatic
    @FragmentScope
    fun provideSettingsViewModel(fragment: SettingsFragment) =
        ViewModelProviders.of(fragment).get(SettingsViewModel::class.java)
}