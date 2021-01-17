package com.evgeny.goncharov.settings.base

import android.os.Bundle
import com.evgeny.goncharov.coreapi.base.BaseFragmentDialog
import com.evgeny.goncharov.settings.di.components.SettingsComponent
import com.evgeny.goncharov.settings.view.model.SettingsViewModel

abstract class BaseSettingsFragmentDialog : BaseFragmentDialog() {

    /** Компонент фитчи настроек */
    protected lateinit var vm: SettingsViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        themeManager = SettingsComponent.component?.provideThemeManager()
    }
}