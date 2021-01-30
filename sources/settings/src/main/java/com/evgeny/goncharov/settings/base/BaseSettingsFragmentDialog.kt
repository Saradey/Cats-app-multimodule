package com.evgeny.goncharov.settings.base

import androidx.lifecycle.ViewModelProviders
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.base.BaseFragmentDialog
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.settings.ui.SettingsFragment
import com.evgeny.goncharov.settings.view.model.SettingsViewModel

abstract class BaseSettingsFragmentDialog : BaseFragmentDialog() {

    /** Компонент фитчи настроек */
    protected val vm: SettingsViewModel by lazy {
        ViewModelProviders.of(requireParentFragment() as SettingsFragment).get(
            SettingsViewModel::class.java
        )
    }

    override val themeManager: ThemeManager by lazy {
        (requireActivity() as WithFacade).getFacade().provideThemeManager()
    }
}