package com.evgeny.goncharov.coreimpl.database

import com.evgeny.goncharov.coreapi.providers.ContextProvider
import com.evgeny.goncharov.coreapi.providers.DatabaseProvider
import com.evgeny.goncharov.coreapi.scope.AppScope
import dagger.Component

@AppScope
@Component(
    dependencies = [ContextProvider::class],
    modules = [DatabaseModule::class]
)
interface DatabaseComponent : DatabaseProvider