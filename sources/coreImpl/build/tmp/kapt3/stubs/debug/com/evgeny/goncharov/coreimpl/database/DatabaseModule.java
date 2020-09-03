package com.evgeny.goncharov.coreimpl.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/evgeny/goncharov/coreimpl/database/DatabaseModule;", "", "()V", "provideCatDescriptionDAO", "Lcom/evgeny/goncharov/coreapi/database/dao/CatDescriptionDAO;", "appDatabase", "Lcom/evgeny/goncharov/coreapi/database/DatabaseContract;", "provideCatsWallDao", "Lcom/evgeny/goncharov/coreapi/database/dao/CatsWallDao;", "provideDatabaseContract", "context", "Landroid/content/Context;", "coreImpl_debug"})
@dagger.Module()
public final class DatabaseModule {
    public static final com.evgeny.goncharov.coreimpl.database.DatabaseModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public static final com.evgeny.goncharov.coreapi.database.DatabaseContract provideDatabaseContract(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public static final com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO provideCatDescriptionDAO(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.database.DatabaseContract appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public static final com.evgeny.goncharov.coreapi.database.dao.CatsWallDao provideCatsWallDao(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.database.DatabaseContract appDatabase) {
        return null;
    }
    
    private DatabaseModule() {
        super();
    }
}