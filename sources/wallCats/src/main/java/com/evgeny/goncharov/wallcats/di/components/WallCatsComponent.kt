package com.evgeny.goncharov.wallcats.di.components

import com.evgeny.goncharov.coreapi.providers.ManagerProvider
import com.evgeny.goncharov.coreapi.providers.MediatorsProvider
import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.wallcats.di.modules.WallCatsBindsModule
import com.evgeny.goncharov.wallcats.di.modules.WallCatsProvidesModule
import com.evgeny.goncharov.wallcats.di.provides.WallCatsProvider
import com.evgeny.goncharov.wallcats.ui.WallCatsFragment
import dagger.BindsInstance
import dagger.Component

/**
 * Компонент для экрана стены котов
 */
@FragmentScope
@Component(
    dependencies = [ProviderFacade::class],
    modules = [WallCatsBindsModule::class, WallCatsProvidesModule::class]
)
interface WallCatsComponent : WallCatsProvider, MediatorsProvider, ManagerProvider {

    companion object {

        var component: WallCatsComponent? = null

        fun init(provide: ProviderFacade, fragment: WallCatsFragment): WallCatsComponent {
            return DaggerWallCatsComponent.factory()
                .plus(fragment, provide)
                .apply {
                    component = this
                }
        }
    }

    @Component.Factory
    interface Factory {

        fun plus(
            @BindsInstance fragment: WallCatsFragment,
            provide: ProviderFacade
        ): WallCatsComponent
    }
}