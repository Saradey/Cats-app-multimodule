package com.evgeny.goncharov.main.di

import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ProviderFacade::class]
)
interface MainComponent : ProviderFacade {

    companion object {
        var component: MainComponent? = null

        fun init(): MainComponent {
            return DaggerMainComponent
                .builder()
                .providerFacade(ProviderFacade.component)
                .build().apply {
                    component = this
                }
        }
    }

    fun inject(mainActivity: MainActivity)
}