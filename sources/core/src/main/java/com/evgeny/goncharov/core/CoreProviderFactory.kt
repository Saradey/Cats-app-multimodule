package com.evgeny.goncharov.core

import com.evgeny.goncharov.coreapi.providers.ContextProvider
import com.evgeny.goncharov.coreapi.providers.DatabaseProvider
import com.evgeny.goncharov.coreapi.providers.ManagerProvider
import com.evgeny.goncharov.coreapi.providers.NetworkProvider
import com.evgeny.goncharov.coreimpl.database.DaggerDatabaseComponent
import com.evgeny.goncharov.coreimpl.mangers.di.DaggerManagersComponent
import com.evgeny.goncharov.coreimpl.network.DaggerNetworkComponent

/**
 * Фектори для создания даггер графов
 */
object CoreProviderFactory {

    /**
     * Создаем даггер граф базы данных
     * @param contextProvider AppComponent для провайда контекста
     * @return контракт для провайда баз данных
     */
    fun createDatabaseComponent(contextProvider: ContextProvider): DatabaseProvider {
        return DaggerDatabaseComponent.builder()
            .contextProvider(contextProvider)
            .build()
    }

    /**
     * Создаем даггер граф для сетевого слоя
     * @param contextProvider AppComponent для провайда контекста
     * @return конракт для провайда api
     */
    fun createNetworkComponent(contextProvider: ContextProvider): NetworkProvider {
        return DaggerNetworkComponent.builder()
            .contextProvider(contextProvider)
            .build()
    }

    /**
     * Создаем даггер граф для провайда менеджеров
     * @param contextProvider AppComponent для провайда контекста
     * @return контракт для провайда менеджеров
     */
    fun createManagerComponent(contextProvider: ContextProvider): ManagerProvider {
        return DaggerManagersComponent.builder()
            .contextProvider(contextProvider)
            .build()
    }
}