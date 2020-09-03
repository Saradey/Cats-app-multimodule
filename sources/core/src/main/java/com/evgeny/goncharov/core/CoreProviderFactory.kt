package com.evgeny.goncharov.core

import com.evgeny.goncharov.coreapi.providers.ContextProvider
import com.evgeny.goncharov.coreapi.providers.DatabaseProvider
import com.evgeny.goncharov.coreapi.providers.ManagerProvider
import com.evgeny.goncharov.coreapi.providers.NetworkProvider
import com.evgeny.goncharov.coreimpl.database.DaggerDatabaseComponent
import com.evgeny.goncharov.coreimpl.mangers.DaggerManagersComponent
import com.evgeny.goncharov.coreimpl.network.DaggerNetworkComponent

object CoreProviderFactory {

    fun createDatabaseComponent(contextProvider: ContextProvider): DatabaseProvider {
        return DaggerDatabaseComponent.builder()
            .contextProvider(contextProvider)
            .build()
    }

    fun createNetworkComponent(contextProvider: ContextProvider): NetworkProvider {
        return DaggerNetworkComponent.builder()
            .contextProvider(contextProvider)
            .build()
    }

    fun createManagerComponent(contextProvider: ContextProvider): ManagerProvider {
        return DaggerManagersComponent.builder()
            .contextProvider(contextProvider)
            .build()
    }
}