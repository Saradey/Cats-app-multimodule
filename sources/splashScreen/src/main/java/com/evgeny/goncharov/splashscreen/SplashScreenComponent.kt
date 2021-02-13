package com.evgeny.goncharov.splashscreen

import com.evgeny.goncharov.coreapi.managers.AnalyticsManager
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import com.evgeny.goncharov.coreapi.providers.MainRouterProvider
import com.evgeny.goncharov.coreapi.providers.ManagerProvider
import com.evgeny.goncharov.coreapi.providers.MediatorsProvider
import dagger.Component

/**
 * Компонент для экрана сплеш скрина
 */
@Component(
    dependencies = [MediatorsProvider::class,
        MainRouterProvider::class,
        ManagerProvider::class
    ]
)
interface SplashScreenComponent : MainRouterProvider {

    fun provideWallCatsMediator(): WallCatsMediator

    fun provideAnalyticsManager(): AnalyticsManager
}