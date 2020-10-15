package com.evgeny.goncharov.coreapi.activity.contracts

import com.evgeny.goncharov.coreapi.providers.ProviderFacade

interface WithFacade {

    fun getFacade(): ProviderFacade
}