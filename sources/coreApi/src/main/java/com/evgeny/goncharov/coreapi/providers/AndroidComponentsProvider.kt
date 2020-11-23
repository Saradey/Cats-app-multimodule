package com.evgeny.goncharov.coreapi.providers

import android.content.Context
import androidx.fragment.app.FragmentManager
import com.evgeny.goncharov.coreapi.qualifier.ActivityContext

interface AndroidComponentsProvider {

    fun provideFragmentManager(): FragmentManager

    @ActivityContext
    fun provideActivityContext(): Context
}