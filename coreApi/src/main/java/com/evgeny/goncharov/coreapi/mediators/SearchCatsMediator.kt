package com.evgeny.goncharov.coreapi.mediators

import androidx.fragment.app.FragmentManager

interface SearchCatsMediator {

    fun goToTheSearchScreen(manager: FragmentManager)
}