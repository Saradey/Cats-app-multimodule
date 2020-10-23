package com.evgeny.goncharov.coreapi.providers

import androidx.fragment.app.FragmentManager

interface AndroidComponentsProvider {

    fun provideFragmentManager(): FragmentManager
}