package com.evgeny.goncharov.searchcats.gateway;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0002J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/evgeny/goncharov/searchcats/gateway/SearchCatGatewayImpl;", "Lcom/evgeny/goncharov/searchcats/gateway/SearchCatGateway;", "api", "Lcom/evgeny/goncharov/coreapi/rest/ApiCatSearch;", "dao", "Lcom/evgeny/goncharov/coreapi/database/dao/CatsWallDao;", "(Lcom/evgeny/goncharov/coreapi/rest/ApiCatSearch;Lcom/evgeny/goncharov/coreapi/database/dao/CatsWallDao;)V", "loadFromDatabase", "", "Lcom/evgeny/goncharov/searchcats/model/CatCatched;", "text", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromInternet", "request", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapModels", "list", "Lcom/evgeny/goncharov/coreapi/dto/database/ChooseCatBreed;", "mapModelsFromDatabase", "Lcom/evgeny/goncharov/coreapi/dto/database/CatBreed;", "searchCats_debug"})
public final class SearchCatGatewayImpl implements com.evgeny.goncharov.searchcats.gateway.SearchCatGateway {
    private final com.evgeny.goncharov.coreapi.rest.ApiCatSearch api = null;
    private final com.evgeny.goncharov.coreapi.database.dao.CatsWallDao dao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadFromDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched>> p1) {
        return null;
    }
    
    private final java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched> mapModelsFromDatabase(java.util.List<com.evgeny.goncharov.coreapi.dto.database.CatBreed> list) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadFromInternet(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched>> p1) {
        return null;
    }
    
    private final java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched> mapModels(java.util.List<com.evgeny.goncharov.coreapi.dto.database.ChooseCatBreed> list) {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchCatGatewayImpl(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.rest.ApiCatSearch api, @org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.database.dao.CatsWallDao dao) {
        super();
    }
}