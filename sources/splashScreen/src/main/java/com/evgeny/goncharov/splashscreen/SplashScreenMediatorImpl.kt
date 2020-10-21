package com.evgeny.goncharov.splashscreen

import androidx.fragment.app.FragmentManager
import com.evgeny.goncharov.coreapi.mediators.SplashScreenMediator
import javax.inject.Inject

/**
 * Реализация логики перехода на сплеш скрин
 */
class SplashScreenMediatorImpl @Inject constructor() : SplashScreenMediator {

    override fun showSplashScreen(supportFragmentManager: FragmentManager) {
        val fragment = SplashScreenFragment.getInstance()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frmRootField, fragment)
            .commit()
    }
}