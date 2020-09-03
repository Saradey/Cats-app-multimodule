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

@Module
interface MediatorModuleBindings {

    @Binds
    @Reusable
    fun bindSearchCatsMediator(mediator: SearchCatsMediatorImpl): SearchCatsMediator

    @Binds
    @Reusable
    fun bindSSplashScreenMediator(mediator: SplashScreenMediatorImpl): SplashScreenMediator

    @Binds
    @Reusable
    fun bindWallCatsMediator(mediator: WallCatsMediatorImpl): WallCatsMediator

    @Binds
    @Reusable
    fun bindSettingsMediator(mediator: SettingsMediatorImpl): SettingsMediator
}