package com.evgeny.goncharov.catapp.modules

import com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator
import com.evgeny.goncharov.coreapi.mediators.SettingsMediator
import com.evgeny.goncharov.coreapi.mediators.SplashScreenMediator
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import com.evgeny.goncharov.searchcats.SearchCatsMediatorImpl
import com.evgeny.goncharov.settings.SettingsMediatorImpl
import com.evgeny.goncharov.splashscreen.SplashScreenMediatorImpl
import com.evgeny.goncharov.wallcats.WallCatsMediatorImpl
import dagger.Binds
import dagger.Module
import dagger.Reusable

/**
 * Модуль для биндинга медиатров, медиатры нужны для переходов между экранами
 */
@Module
interface MediatorModuleBindings {

    @Binds
    @Reusable
    fun SearchCatsMediatorImpl.bindSearchCatsMediator(): SearchCatsMediator

    @Binds
    @Reusable
    fun SplashScreenMediatorImpl.bindSSplashScreenMediator(): SplashScreenMediator

    @Binds
    @Reusable
    fun WallCatsMediatorImpl.bindWallCatsMediator(): WallCatsMediator

    @Binds
    @Reusable
    fun SettingsMediatorImpl.bindSettingsMediator(): SettingsMediator
}