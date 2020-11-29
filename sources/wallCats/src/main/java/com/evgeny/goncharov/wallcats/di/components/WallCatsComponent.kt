package com.evgeny.goncharov.wallcats.di.components

import com.evgeny.goncharov.coreapi.providers.ActivityContextProvider
import com.evgeny.goncharov.coreapi.providers.MediatorsProvider
import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.wallcats.di.modules.CatDescriptionBindsModule
import com.evgeny.goncharov.wallcats.di.modules.WallCatsBindsModule
import com.evgeny.goncharov.wallcats.di.modules.WallCatsProvidesModule
import com.evgeny.goncharov.wallcats.di.provides.CatDescriptionProvider
import com.evgeny.goncharov.wallcats.di.provides.WallCatsProvider
import dagger.Component

/**
 * Компонент для экрана стены котов
 */
@FragmentScope
@Component(
    dependencies = [ProviderFacade::class, ActivityContextProvider::class],
    modules = [
        WallCatsBindsModule::class,
        WallCatsProvidesModule::class,
        CatDescriptionBindsModule::class
    ]
)
interface WallCatsComponent : CatDescriptionProvider,
    WallCatsProvider,
    MediatorsProvider {

    companion object {

        var component: WallCatsComponent? = null

        fun getByLazy(
            provide: ProviderFacade,
            provideAndroidComponent: ActivityContextProvider
        ): WallCatsComponent {
            return component ?: DaggerWallCatsComponent.factory()
                .plus(provide, provideAndroidComponent)
                .apply {
                    component = this
                }
        }
    }

    @Component.Factory
    interface Factory {

        fun plus(
            provide: ProviderFacade,
            provideAndroidComponent: ActivityContextProvider
        ): WallCatsComponent
    }
}