package com.evgeny.goncharov.main.di

import androidx.fragment.app.FragmentManager
import com.evgeny.goncharov.coreapi.scope.ActivityScope
import com.evgeny.goncharov.main.MainActivity
import dagger.Module
import dagger.Provides

@Module
object MainActivityProvideModule {

    @JvmStatic
    @ActivityScope
    @Provides
    fun provideFragmentManager(mainActivity: MainActivity): FragmentManager = mainActivity.supportFragmentManager
}