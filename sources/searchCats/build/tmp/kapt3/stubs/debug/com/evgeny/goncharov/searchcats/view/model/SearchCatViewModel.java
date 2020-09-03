package com.evgeny.goncharov.searchcats.view.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/evgeny/goncharov/searchcats/view/model/SearchCatViewModel;", "", "getLiveDataCatsCathed", "Landroidx/lifecycle/LiveData;", "", "Lcom/evgeny/goncharov/searchcats/model/CatCatched;", "getUiEventsLiveData", "Lcom/evgeny/goncharov/searchcats/ui/events/SearchCatEvents;", "initInject", "", "setInputTextSearchView", "text", "", "searchCats_debug"})
public abstract interface SearchCatViewModel {
    
    public abstract void initInject();
    
    public abstract void setInputTextSearchView(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.evgeny.goncharov.searchcats.ui.events.SearchCatEvents> getUiEventsLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched>> getLiveDataCatsCathed();
}