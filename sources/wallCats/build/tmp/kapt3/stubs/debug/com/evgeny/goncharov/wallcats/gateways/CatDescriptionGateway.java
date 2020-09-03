package com.evgeny.goncharov.wallcats.gateways;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/evgeny/goncharov/wallcats/gateways/CatDescriptionGateway;", "", "loadChooseCatFromDatabase", "Lcom/evgeny/goncharov/wallcats/model/view/CatDescription;", "catId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadChooseCatFromDatabaseSpare", "loadChooseCatFromInternet", "wallCats_debug"})
public abstract interface CatDescriptionGateway {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadChooseCatFromInternet(@org.jetbrains.annotations.NotNull()
    java.lang.String catId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.evgeny.goncharov.wallcats.model.view.CatDescription> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadChooseCatFromDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String catId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.evgeny.goncharov.wallcats.model.view.CatDescription> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadChooseCatFromDatabaseSpare(@org.jetbrains.annotations.NotNull()
    java.lang.String catId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.evgeny.goncharov.wallcats.model.view.CatDescription> p1);
}