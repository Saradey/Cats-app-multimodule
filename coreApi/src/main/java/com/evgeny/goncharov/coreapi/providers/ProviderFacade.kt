package com.evgeny.goncharov.coreapi.providers

interface ProviderFacade : MediatorsProvider,
    DatabaseProvider,
    NetworkProvider,
    ManagerProvider {

    companion object {
        lateinit var component: ProviderFacade
    }
}