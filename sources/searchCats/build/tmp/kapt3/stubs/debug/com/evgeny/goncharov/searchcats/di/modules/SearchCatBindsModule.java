package com.evgeny.goncharov.searchcats.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/evgeny/goncharov/searchcats/di/modules/SearchCatBindsModule;", "", "bindSearchCatGateway", "Lcom/evgeny/goncharov/searchcats/gateway/SearchCatGateway;", "gateway", "Lcom/evgeny/goncharov/searchcats/gateway/SearchCatGatewayImpl;", "bindSearchCatInteractor", "Lcom/evgeny/goncharov/searchcats/interactor/SearchCatInteractor;", "interactor", "Lcom/evgeny/goncharov/searchcats/interactor/SearchCatInteractorImpl;", "searchCats_debug"})
@dagger.Module()
public abstract interface SearchCatBindsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor bindSearchCatInteractor(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.searchcats.interactor.SearchCatInteractorImpl interactor);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.evgeny.goncharov.searchcats.gateway.SearchCatGateway bindSearchCatGateway(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.searchcats.gateway.SearchCatGatewayImpl gateway);
}