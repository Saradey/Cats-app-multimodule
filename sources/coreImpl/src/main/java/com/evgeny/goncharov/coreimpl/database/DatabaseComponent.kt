package com.evgeny.goncharov.coreimpl.database

import com.evgeny.goncharov.coreapi.providers.DatabaseProvider
import com.evgeny.goncharov.coreapi.providers.ContextProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ContextProvider::class],
    modules = [DatabaseModule::class]
)
interface DatabaseComponent : DatabaseProvider