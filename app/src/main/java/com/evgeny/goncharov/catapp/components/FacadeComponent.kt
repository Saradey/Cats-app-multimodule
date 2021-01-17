package com.evgeny.goncharov.catapp.components

import android.app.Application
import com.evgeny.goncharov.catapp.modules.MediatorModuleBindings
import com.evgeny.goncharov.core.CoreProviderFactory
import com.evgeny.goncharov.coreapi.providers.AppContextProvider
import com.evgeny.goncharov.coreapi.providers.DatabaseProvider
import com.evgeny.goncharov.coreapi.providers.ManagerProvider
import com.evgeny.goncharov.coreapi.providers.NetworkProvider
import com.evgeny.goncharov.coreapi.providers.ProviderFacade
import com.evgeny.goncharov.coreapi.scope.AppScope
import dagger.Component

/**
 * Главный фасад компонент который содержит в себе множество других даггер графов которые
 * провайдят свои зависимости
 */
@AppScope
@Component(
    dependencies = [
        AppContextProvider::class,
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
            contextProvider: AppContextProvider,
            databaseProvider: DatabaseProvider,
            networkProvider: NetworkProvider,
            managersProvider: ManagerProvider
        ): FacadeComponent
    }
}