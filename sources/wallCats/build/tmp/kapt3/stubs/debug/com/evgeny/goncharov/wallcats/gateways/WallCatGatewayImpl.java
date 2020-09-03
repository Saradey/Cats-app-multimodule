package com.evgeny.goncharov.wallcats.gateways;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00112\u0006\u0010\u000b\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/evgeny/goncharov/wallcats/gateways/WallCatGatewayImpl;", "Lcom/evgeny/goncharov/wallcats/gateways/WallCatGateway;", "api", "Lcom/evgeny/goncharov/wallcats/rest/ApiBreeds;", "daoWallCat", "Lcom/evgeny/goncharov/coreapi/database/dao/CatsWallDao;", "(Lcom/evgeny/goncharov/wallcats/rest/ApiBreeds;Lcom/evgeny/goncharov/coreapi/database/dao/CatsWallDao;)V", "coroutineScopeIo", "Lkotlinx/coroutines/CoroutineScope;", "getUrlImage", "", "request", "Lcom/evgeny/goncharov/wallcats/model/request/GetImageRequest;", "(Lcom/evgeny/goncharov/wallcats/model/request/GetImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAllImage", "", "result", "", "Lcom/evgeny/goncharov/coreapi/dto/database/CatBreed;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWallCatFromDatabase", "Lcom/evgeny/goncharov/wallcats/model/view/CatBreedView;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWallCatFromInternet", "Lcom/evgeny/goncharov/wallcats/model/request/WallCatRequest;", "(Lcom/evgeny/goncharov/wallcats/model/request/WallCatRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapResponse", "modelResponse", "wallCats_debug"})
public final class WallCatGatewayImpl implements com.evgeny.goncharov.wallcats.gateways.WallCatGateway {
    private final kotlinx.coroutines.CoroutineScope coroutineScopeIo = null;
    private final com.evgeny.goncharov.wallcats.rest.ApiBreeds api = null;
    private final com.evgeny.goncharov.coreapi.database.dao.CatsWallDao daoWallCat = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadWallCatFromInternet(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.model.request.WallCatRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.wallcats.model.view.CatBreedView>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadWallCatFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.wallcats.model.view.CatBreedView>> p0) {
        return null;
    }
    
    private final java.util.List<com.evgeny.goncharov.wallcats.model.view.CatBreedView> mapResponse(java.util.List<com.evgeny.goncharov.coreapi.dto.database.CatBreed> modelResponse) {
        return null;
    }
    
    @javax.inject.Inject()
    public WallCatGatewayImpl(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.rest.ApiBreeds api, @org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.database.dao.CatsWallDao daoWallCat) {
        super();
    }
}