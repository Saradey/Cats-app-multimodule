package com.evgeny.goncharov.wallcats.di.components

import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.wallcats.di.modules.CatDescriptionBindsModule
import com.evgeny.goncharov.wallcats.di.modules.CatDescriptionProvidesModule
import com.evgeny.goncharov.wallcats.ui.CatDescriptionFragment
import com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ProviderFacade::class],
    modules = [CatDescriptionBindsModule::class, CatDescriptionProvidesModule::class]
)
interface CatDescriptionComponent {

    companion object {

        var component: CatDescriptionComponent? = null

        fun init(provide: ProviderFacade, fragment: CatDescriptionFragment): CatDescriptionComponent {
            return DaggerCatDescriptionComponent.factory()
                .plus(fragment, provide)
                .apply {
                    component = this
                }
        }
    }

    @Component.Factory
    interface Factory {

        fun plus(
            @BindsInstance fragment: CatDescriptionFragment,
            provide: ProviderFacade
        ): CatDescriptionComponent
    }

    fun inject(fragment: CatDescriptionFragment)

    fun inject(viewModel: CatDescriptionViewModel)
}