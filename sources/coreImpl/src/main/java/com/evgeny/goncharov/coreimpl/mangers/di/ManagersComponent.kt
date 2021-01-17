package com.evgeny.goncharov.coreimpl.mangers.di

import com.evgeny.goncharov.coreapi.providers.AppContextProvider
import com.evgeny.goncharov.coreapi.providers.ManagerProvider
import com.evgeny.goncharov.coreapi.scope.AppScope
import dagger.Component

/**
 * Даггер граф менеджеров
 */
@AppScope
@Component(dependencies = [AppContextProvider::class], modules = [ManagersBindsModule::class])
interface ManagersComponent : ManagerProvider