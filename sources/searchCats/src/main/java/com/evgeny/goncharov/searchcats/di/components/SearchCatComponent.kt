package com.evgeny.goncharov.searchcats.di.components

import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.searchcats.di.modules.SearchCatBindsModule
import com.evgeny.goncharov.searchcats.di.modules.SearchCatProvidesModule
import com.evgeny.goncharov.searchcats.ui.SearchCatFragment
import com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel
import dagger.BindsInstance
import dagger.Component

@FragmentScope
@Component(
    dependencies = [ProviderFacade::class],
    modules = [SearchCatBindsModule::class, SearchCatProvidesModule::class]
)
interface SearchCatComponent {

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

    fun inject(fragment: SearchCatFragment)

    fun inject(viewModel: SearchCatViewModel)
}