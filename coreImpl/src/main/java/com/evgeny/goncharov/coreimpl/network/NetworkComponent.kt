package com.evgeny.goncharov.coreimpl.network

import com.evgeny.goncharov.coreapi.providers.ContextProvider
import com.evgeny.goncharov.coreapi.providers.NetworkProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ContextProvider::class],
    modules = [NetworkModule::class]
)
interface NetworkComponent : NetworkProvider