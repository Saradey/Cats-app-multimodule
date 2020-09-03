package com.evgeny.goncharov.wallcats.gateways;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u001b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/evgeny/goncharov/wallcats/gateways/CatDescriptionGatewayImpl;", "Lcom/evgeny/goncharov/wallcats/gateways/CatDescriptionGateway;", "api", "Lcom/evgeny/goncharov/coreapi/rest/ApiCatSearch;", "dao", "Lcom/evgeny/goncharov/coreapi/database/dao/CatDescriptionDAO;", "daoWallCat", "Lcom/evgeny/goncharov/coreapi/database/dao/CatsWallDao;", "(Lcom/evgeny/goncharov/coreapi/rest/ApiCatSearch;Lcom/evgeny/goncharov/coreapi/database/dao/CatDescriptionDAO;Lcom/evgeny/goncharov/coreapi/database/dao/CatsWallDao;)V", "getUrlImageFromDataBase", "", "id", "loadChooseCatFromDatabase", "Lcom/evgeny/goncharov/wallcats/model/view/CatDescription;", "catId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadChooseCatFromDatabaseSpare", "loadChooseCatFromInternet", "mapModel", "model", "Lcom/evgeny/goncharov/coreapi/dto/database/CatBreed;", "Lcom/evgeny/goncharov/coreapi/dto/database/ChooseCatBreed;", "wallCats_debug"})
public final class CatDescriptionGatewayImpl implements com.evgeny.goncharov.wallcats.gateways.CatDescriptionGateway {
    private final com.evgeny.goncharov.coreapi.rest.ApiCatSearch api = null;
    private final com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO dao = null;
    private final com.evgeny.goncharov.coreapi.database.dao.CatsWallDao daoWallCat = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadChooseCatFromInternet(@org.jetbrains.annotations.NotNull()
    java.lang.String catId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.evgeny.goncharov.wallcats.model.view.CatDescription> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadChooseCatFromDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String catId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.evgeny.goncharov.wallcats.model.view.CatDescription> p1) {
        return null;
    }
    
    private final com.evgeny.goncharov.wallcats.model.view.CatDescription mapModel(com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed model) {
        return null;
    }
    
    private final java.lang.String getUrlImageFromDataBase(java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadChooseCatFromDatabaseSpare(@org.jetbrains.annotations.NotNull()
    java.lang.String catId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.evgeny.goncharov.wallcats.model.view.CatDescription> p1) {
        return null;
    }
    
    private final com.evgeny.goncharov.wallcats.model.view.CatDescription mapModel(com.evgeny.goncharov.coreapi.dto.database.CatBreed model) {
        return null;
    }
    
    @javax.inject.Inject()
    public CatDescriptionGatewayImpl(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.rest.ApiCatSearch api, @org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.database.dao.CatDescriptionDAO dao, @org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.database.dao.CatsWallDao daoWallCat) {
        super();
    }
}