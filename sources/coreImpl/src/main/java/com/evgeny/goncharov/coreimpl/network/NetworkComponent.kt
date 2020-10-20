package com.evgeny.goncharov.coreimpl.network

import com.evgeny.goncharov.coreapi.providers.ContextProvider
import com.evgeny.goncharov.coreapi.providers.NetworkProvider
import com.evgeny.goncharov.coreapi.scope.AppScope
import dagger.Component

/**
 * Даггер граф сетевого слоя
 */
@AppScope
@Component(dependencies = [ContextProvider::class], modules = [NetworkModule::class])
interface NetworkComponent : NetworkProvider