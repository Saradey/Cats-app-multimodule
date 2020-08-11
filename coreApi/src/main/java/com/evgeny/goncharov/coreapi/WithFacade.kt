package com.evgeny.goncharov.coreapi

import com.evgeny.goncharov.coreapi.providers.ProviderFacade

interface WithFacade {

    fun getFacade(): ProviderFacade
}