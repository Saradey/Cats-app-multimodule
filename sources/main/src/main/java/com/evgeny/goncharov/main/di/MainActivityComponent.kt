package com.evgeny.goncharov.main.di

import com.evgeny.goncharov.coreapi.providers.ActivityContextProvider
import com.evgeny.goncharov.coreapi.providers.MainRouterProvider
import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.coreapi.scope.ActivityScope
import com.evgeny.goncharov.main.MainActivity
import dagger.BindsInstance
import dagger.Component

/**
 * Даггер граф уровня активити
 */
@ActivityScope
@Component(dependencies = [ProviderFacade::class], modules = [MainActivityProvideModule::class])
interface MainActivityComponent : ProviderFacade, ActivityContextProvider, MainRouterProvider {

    companion object {

        var component: MainActivityComponent? = null

        fun init(mainActivity: MainActivity, provider: ProviderFacade): MainActivityComponent {
            return DaggerMainActivityComponent
                .factory()
                .plus(mainActivity, provider)
                .apply {
                    component = this
                }
        }
    }

    @Component.Factory
    interface Factory {

        fun plus(
            @BindsInstance mainActivity: MainActivity,
            provider: ProviderFacade
        ): MainActivityComponent
    }
}