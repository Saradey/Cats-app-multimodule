package com.evgeny.goncharov.main.di

import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.coreapi.scope.ActivityScope
import dagger.Component

/**
 * Даггер граф уровня активити
 */
@ActivityScope
@Component(dependencies = [ProviderFacade::class])
interface MainActivityComponent : ProviderFacade {

    companion object {

        var component: MainActivityComponent? = null

        fun init(): MainActivityComponent {
            return DaggerMainActivityComponent
                .builder()
                .providerFacade(ProviderFacade.component)
                .build().apply {
                    component = this
                }
        }
    }
}