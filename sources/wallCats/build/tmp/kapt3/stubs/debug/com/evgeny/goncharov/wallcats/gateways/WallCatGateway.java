package com.evgeny.goncharov.wallcats.gateways;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/evgeny/goncharov/wallcats/gateways/WallCatGateway;", "", "loadWallCatFromDatabase", "", "Lcom/evgeny/goncharov/wallcats/model/view/CatBreedView;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWallCatFromInternet", "request", "Lcom/evgeny/goncharov/wallcats/model/request/WallCatRequest;", "(Lcom/evgeny/goncharov/wallcats/model/request/WallCatRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wallCats_debug"})
public abstract interface WallCatGateway {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadWallCatFromInternet(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.model.request.WallCatRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.wallcats.model.view.CatBreedView>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadWallCatFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.wallcats.model.view.CatBreedView>> p0);
}