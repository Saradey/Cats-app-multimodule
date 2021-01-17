package com.evgeny.goncharov.coreimpl.network

import com.evgeny.goncharov.coreapi.providers.AppContextProvider
import com.evgeny.goncharov.coreapi.providers.NetworkProvider
import com.evgeny.goncharov.coreapi.scope.AppScope
import dagger.Component

/**
 * Даггер граф сетевого слоя
 */
@AppScope
@Component(dependencies = [AppContextProvider::class], modules = [NetworkModule::class])
interface NetworkComponent : NetworkProvider