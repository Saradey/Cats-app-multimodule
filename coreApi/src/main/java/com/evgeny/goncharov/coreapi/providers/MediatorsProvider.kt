package com.evgeny.goncharov.coreapi.providers

import com.evgeny.goncharov.coreapi.mediators.SplashScreenMediator
import com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator
import com.evgeny.goncharov.coreapi.mediators.SettingsMediator
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator

interface MediatorsProvider {

    fun provideSearchCatsMediator(): SearchCatsMediator

    fun provideSplashScreenMediator(): SplashScreenMediator

    fun provideWallCatsMediator(): WallCatsMediator

    fun provideSettingMediator(): SettingsMediator
}