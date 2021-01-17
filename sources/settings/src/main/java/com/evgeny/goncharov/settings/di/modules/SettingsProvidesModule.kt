package com.evgeny.goncharov.settings.di.modules

import android.content.Context
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import com.evgeny.goncharov.coreapi.qualifier.ActivityContext
import com.evgeny.goncharov.domain.SortTypeViewModel
import com.evgeny.goncharov.settings.ui.SettingsFragment
import com.evgeny.goncharov.settings.view.model.SettingsViewModel
import dagger.Module
import dagger.Provides

/**
 * Провайд модуль для создания вьюмодели экрана настроек
 */
@Module
object SettingsProvidesModule {

    @Provides
    @JvmStatic
    fun provideSortViewModel(@ActivityContext contextActivity: Context) =
        ViewModelProviders.of(contextActivity as FragmentActivity)
            .get(SortTypeViewModel::class.java)

    @Provides
    @JvmStatic
    fun provideSettingsViewModel(fragment: SettingsFragment) = ViewModelProviders.of(fragment)
        .get(SettingsViewModel::class.java)
}