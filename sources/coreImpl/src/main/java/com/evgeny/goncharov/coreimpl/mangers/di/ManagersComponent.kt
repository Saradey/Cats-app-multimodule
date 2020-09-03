package com.evgeny.goncharov.coreimpl.mangers.di

import com.evgeny.goncharov.coreapi.providers.ContextProvider
import com.evgeny.goncharov.coreapi.providers.ManagerProvider
import com.evgeny.goncharov.coreapi.scope.AppScope
import dagger.Component

@AppScope
@Component(
    dependencies = [ContextProvider::class],
    modules = [ManagersBindsModule::class]
)
interface ManagersComponent : ManagerProvider