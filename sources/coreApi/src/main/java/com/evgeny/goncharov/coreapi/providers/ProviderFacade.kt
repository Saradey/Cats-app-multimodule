package com.evgeny.goncharov.coreapi.providers

/**
 * Главный контракт провайдер приложения
 */
interface ProviderFacade : MediatorsProvider,
    DatabaseProvider,
    NetworkProvider,
    ManagerProvider {

    companion object {

        lateinit var component: ProviderFacade
    }
}