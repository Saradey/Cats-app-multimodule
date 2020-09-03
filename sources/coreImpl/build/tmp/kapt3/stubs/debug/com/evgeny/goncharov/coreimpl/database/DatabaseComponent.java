package com.evgeny.goncharov.coreimpl.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/evgeny/goncharov/coreimpl/database/DatabaseComponent;", "Lcom/evgeny/goncharov/coreapi/providers/DatabaseProvider;", "coreImpl_debug"})
@dagger.Component(dependencies = {com.evgeny.goncharov.coreapi.providers.ContextProvider.class}, modules = {com.evgeny.goncharov.coreimpl.database.DatabaseModule.class})
@javax.inject.Singleton()
public abstract interface DatabaseComponent extends com.evgeny.goncharov.coreapi.providers.DatabaseProvider {
}