package com.evgeny.goncharov.coreapi.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/evgeny/goncharov/coreapi/providers/DatabaseProvider;", "", "provideCatDescriptionDAO", "Lcom/evgeny/goncharov/coreapi/database/dao/CatDescriptionDAO;", "provideCatsWallDao", "Lcom/evgeny/goncharov/coreapi/database/dao/CatsWallDao;", "provideDatabase", "Lcom/evgeny/goncharov/coreapi/database/DatabaseContract;", "coreApi_debug"})
public abstract interface DatabaseProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.database.DatabaseContract provideDatabase();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.database.dao.CatsWallDao provideCatsWallDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO provideCatDescriptionDAO();
}