package com.evgeny.goncharov.coreimpl.mangers

import com.evgeny.goncharov.coreapi.providers.ContextProvider
import com.evgeny.goncharov.coreapi.providers.ManagerProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ContextProvider::class],
    modules = [ManagersBindsModule::class]
)
interface ManagersComponent : ManagerProvider