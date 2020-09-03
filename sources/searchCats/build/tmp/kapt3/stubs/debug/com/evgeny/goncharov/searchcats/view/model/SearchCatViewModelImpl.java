package com.evgeny.goncharov.searchcats.view.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/evgeny/goncharov/searchcats/view/model/SearchCatViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Lcom/evgeny/goncharov/searchcats/view/model/SearchCatViewModel;", "()V", "interactor", "Lcom/evgeny/goncharov/searchcats/interactor/SearchCatInteractor;", "getInteractor", "()Lcom/evgeny/goncharov/searchcats/interactor/SearchCatInteractor;", "setInteractor", "(Lcom/evgeny/goncharov/searchcats/interactor/SearchCatInteractor;)V", "job", "Lkotlinx/coroutines/Job;", "getLiveDataCatsCathed", "Landroidx/lifecycle/LiveData;", "", "Lcom/evgeny/goncharov/searchcats/model/CatCatched;", "getUiEventsLiveData", "Lcom/evgeny/goncharov/searchcats/ui/events/SearchCatEvents;", "initInject", "", "setInputTextSearchView", "text", "", "searchCats_debug"})
public final class SearchCatViewModelImpl extends androidx.lifecycle.ViewModel implements com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel {
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
    
    @java.lang.Override()
    public void initInject() {
    }
    
    @java.lang.Override()
    public void setInputTextSearchView(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.evgeny.goncharov.searchcats.ui.events.SearchCatEvents> getUiEventsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched>> getLiveDataCatsCathed() {
        return null;
    }
    
    public SearchCatViewModelImpl() {
        super();
    }
}