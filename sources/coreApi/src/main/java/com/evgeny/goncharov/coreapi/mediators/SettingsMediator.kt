package com.evgeny.goncharov.coreapi.mediators

import androidx.fragment.app.FragmentManager

interface SettingsMediator {

    fun goToTheSettingsScreen(supportFragmentManager: FragmentManager)
}