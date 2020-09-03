package com.evgeny.goncharov.searchcats.view.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/evgeny/goncharov/searchcats/view/model/SearchCatViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "interactor", "Lcom/evgeny/goncharov/searchcats/interactor/SearchCatInteractor;", "getInteractor", "()Lcom/evgeny/goncharov/searchcats/interactor/SearchCatInteractor;", "setInteractor", "(Lcom/evgeny/goncharov/searchcats/interactor/SearchCatInteractor;)V", "job", "Lkotlinx/coroutines/Job;", "getLiveDataCatsCathed", "Landroidx/lifecycle/LiveData;", "", "Lcom/evgeny/goncharov/searchcats/model/CatCatched;", "getUiEventsLiveData", "Lcom/evgeny/goncharov/searchcats/ui/events/SearchCatEvents;", "initInject", "", "setInputTextSearchView", "text", "", "searchCats_debug"})
public final class SearchCatViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor interactor;
    private kotlinx.coroutines.Job job;
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor p0) {
    }
    
    public final void initInject() {
    }
    
    public final void setInputTextSearchView(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.evgeny.goncharov.searchcats.ui.events.SearchCatEvents> getUiEventsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched>> getLiveDataCatsCathed() {
        return null;
    }
    
    public SearchCatViewModel() {
        super();
    }
}