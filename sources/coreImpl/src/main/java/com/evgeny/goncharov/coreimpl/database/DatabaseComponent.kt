package com.evgeny.goncharov.coreimpl.database

import com.evgeny.goncharov.coreapi.providers.AppContextProvider
import com.evgeny.goncharov.coreapi.providers.DatabaseProvider
import com.evgeny.goncharov.coreapi.scope.AppScope
import dagger.Component

/**
 * Даггер граф базы данных
 */
@AppScope
@Component(dependencies = [AppContextProvider::class], modules = [DatabaseModule::class])
interface DatabaseComponent : DatabaseProvider