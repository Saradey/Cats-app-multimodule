package com.evgeny.goncharov.searchcats.di.components

import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.searchcats.di.modules.SearchCatBindsModule
import com.evgeny.goncharov.searchcats.di.modules.SearchCatProvidesModule
import com.evgeny.goncharov.searchcats.di.provides.SearchCatProvider
import com.evgeny.goncharov.searchcats.ui.SearchCatFragment
import dagger.BindsInstance
import dagger.Component

/**
 * Компонент для провайда зависимостей на экран стены котов
 */
@FragmentScope
@Component(
    dependencies = [ProviderFacade::class],
    modules = [SearchCatBindsModule::class, SearchCatProvidesModule::class]
)
interface SearchCatComponent : SearchCatProvider {

    companion object {

        var component: SearchCatComponent? = null

        fun init(fragment: SearchCatFragment, provide: ProviderFacade): SearchCatComponent {
            return DaggerSearchCatComponent.factory()
                .plus(fragment, provide)
                .apply {
                    component = this
                }
        }
    }

    @Component.Factory
    interface Factory {

        fun plus(@BindsInstance fragment: SearchCatFragment, provide: ProviderFacade): SearchCatComponent
    }
}