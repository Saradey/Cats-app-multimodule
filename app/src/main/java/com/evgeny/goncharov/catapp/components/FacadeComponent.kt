package com.evgeny.goncharov.catapp.components

import android.app.Application
import com.evgeny.goncharov.catapp.modules.MediatorModuleBindings
import com.evgeny.goncharov.core.CoreProviderFactory
import com.evgeny.goncharov.coreapi.providers.ContextProvider
import com.evgeny.goncharov.coreapi.providers.DatabaseProvider
import com.evgeny.goncharov.coreapi.providers.ManagerProvider
import com.evgeny.goncharov.coreapi.providers.NetworkProvider
import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [
        ContextProvider::class,
        DatabaseProvider::class,
        NetworkProvider::class,
        ManagerProvider::class
    ],
    modules = [MediatorModuleBindings::class]
)
interface FacadeComponent : ProviderFacade {

    companion object {
        fun init(app: Application): FacadeComponent {
            return DaggerFacadeComponent.factory()
                .plus(
                    AppComponent.getLazy(app),
                    CoreProviderFactory.createDatabaseComponent(AppComponent.getLazy()),
                    CoreProviderFactory.createNetworkComponent(AppComponent.getLazy()),
                    CoreProviderFactory.createManagerComponent(AppComponent.getLazy())
                ).apply {
                    ProviderFacade.component = this
                }
        }
    }

    @Component.Factory
    interface Factory {

        fun plus(
            contextProvider: ContextProvider,
            databaseProvider: DatabaseProvider,
            networkProvider: NetworkProvider,
            managersProvider: ManagerProvider
        ): FacadeComponent
    }
}