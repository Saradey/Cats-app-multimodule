package com.evgeny.goncharov.searchcats.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/evgeny/goncharov/searchcats/interactor/SearchCatInteractor;", "", "getLiveDataCatsCathed", "Landroidx/lifecycle/LiveData;", "", "Lcom/evgeny/goncharov/searchcats/model/CatCatched;", "getUiEventsLiveData", "Lcom/evgeny/goncharov/searchcats/ui/events/SearchCatEvents;", "setInputTextSearchView", "", "text", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchCats_debug"})
public abstract interface SearchCatInteractor {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setInputTextSearchView(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.evgeny.goncharov.searchcats.ui.events.SearchCatEvents> getUiEventsLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched>> getLiveDataCatsCathed();
}