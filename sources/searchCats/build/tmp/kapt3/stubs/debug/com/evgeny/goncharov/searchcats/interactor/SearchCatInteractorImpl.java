package com.evgeny.goncharov.searchcats.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/evgeny/goncharov/searchcats/interactor/SearchCatInteractorImpl;", "Lcom/evgeny/goncharov/searchcats/interactor/SearchCatInteractor;", "repository", "Lcom/evgeny/goncharov/searchcats/gateway/SearchCatGateway;", "(Lcom/evgeny/goncharov/searchcats/gateway/SearchCatGateway;)V", "liveDataCatsCathed", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/evgeny/goncharov/searchcats/model/CatCatched;", "liveDataUiEvents", "Lcom/evgeny/goncharov/coreapi/utils/SingleLiveEvent;", "Lcom/evgeny/goncharov/searchcats/ui/events/SearchCatEvents;", "getLiveDataCatsCathed", "getUiEventsLiveData", "setInputTextSearchView", "", "text", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateData", "models", "searchCats_debug"})
public final class SearchCatInteractorImpl implements com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor {
    private final com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.searchcats.ui.events.SearchCatEvents> liveDataUiEvents = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched>> liveDataCatsCathed = null;
    private final com.evgeny.goncharov.searchcats.gateway.SearchCatGateway repository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object setInputTextSearchView(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    private final void validateData(java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched> models) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.searchcats.ui.events.SearchCatEvents> getUiEventsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched>> getLiveDataCatsCathed() {
        return null;
    }
    
    @javax.inject.Inject()
    public SearchCatInteractorImpl(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.searchcats.gateway.SearchCatGateway repository) {
        super();
    }
}