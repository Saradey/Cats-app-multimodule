package com.evgeny.goncharov.main.di

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.evgeny.goncharov.coreapi.managers.MainRouter
import com.evgeny.goncharov.coreapi.qualifier.ActivityContext
import com.evgeny.goncharov.coreapi.scope.ActivityScope
import com.evgeny.goncharov.main.MainActivity
import com.evgeny.goncharov.main.managers.MainRouterImpl
import dagger.Module
import dagger.Provides

@Module
object MainActivityProvideModule {

    @JvmStatic
    @ActivityScope
    @Provides
    fun provideFragmentManager(mainActivity: MainActivity): FragmentManager = mainActivity.supportFragmentManager

    @JvmStatic
    @ActivityScope
    @Provides
    @ActivityContext
    fun provideActivityContext(mainActivity: MainActivity): Context = mainActivity

    @JvmStatic
    @ActivityScope
    @Provides
    fun provideMainRouter(@ActivityContext context: Context): MainRouter = MainRouterImpl(
        context as AppCompatActivity
    )
}