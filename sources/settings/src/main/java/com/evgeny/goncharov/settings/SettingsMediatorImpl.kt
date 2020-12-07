package com.evgeny.goncharov.settings

import androidx.fragment.app.FragmentManager
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.mediators.SettingsMediator
import com.evgeny.goncharov.settings.ui.SettingsFragment
import javax.inject.Inject

/**
 * Реализауия логики перехода на экран настроек
 */
class SettingsMediatorImpl @Inject constructor() : SettingsMediator {

    override fun goToTheSettingsScreen(supportFragmentManager: FragmentManager) {
        val fragment = SettingsFragment.getInstance()
        supportFragmentManager.fragments.findLast {
            it is BaseFragment
        }?.let {
            supportFragmentManager.beginTransaction()
                .hide(it)
                .add(R.id.frmRootField, fragment, SettingsFragment::class.java.name)
                .addToBackStack(SettingsFragment::class.java.name)
                .commit()
        }
    }
}