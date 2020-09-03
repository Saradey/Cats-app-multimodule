package com.evgeny.goncharov.coreapi.mediators

import androidx.fragment.app.FragmentManager

interface WallCatsMediator {

    fun goToTheWallCatsFragment(supportFragmentManager: FragmentManager)

    fun goToTheScreenCatDescription(id: String, supportFragmentManager: FragmentManager)
}