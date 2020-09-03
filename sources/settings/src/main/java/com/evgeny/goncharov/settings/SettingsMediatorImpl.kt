package com.evgeny.goncharov.settings

import androidx.fragment.app.FragmentManager
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.mediators.SettingsMediator
import com.evgeny.goncharov.settings.ui.SettingsFragment
import javax.inject.Inject

class SettingsMediatorImpl @Inject constructor() : SettingsMediator {

    override fun goToTheSettingsScreen(supportFragmentManager: FragmentManager) {
        val fragment = SettingsFragment.getInstance()
        supportFragmentManager.beginTransaction()
            .hide(
                supportFragmentManager.fragments.findLast {
                    it is BaseFragment
                }!!
            )
            .add(R.id.frmRootField, fragment, SettingsFragment::class.java.name)
            .addToBackStack(SettingsFragment::class.java.name)
            .commit()
    }
}