package com.evgeny.goncharov.wallcats.view.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/evgeny/goncharov/wallcats/view/model/WallCatsViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Lcom/evgeny/goncharov/wallcats/view/model/WallCatsViewModel;", "()V", "interactor", "Lcom/evgeny/goncharov/wallcats/interactors/WallCatInteractor;", "getInteractor", "()Lcom/evgeny/goncharov/wallcats/interactors/WallCatInteractor;", "setInteractor", "(Lcom/evgeny/goncharov/wallcats/interactors/WallCatInteractor;)V", "getUiEventsLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/evgeny/goncharov/wallcats/ui/events/WallCatsEvents;", "initInjection", "", "initWallCat", "", "Lcom/evgeny/goncharov/wallcats/model/view/CatBreedView;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadNextCats", "key", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wallCats_debug"})
public final class WallCatsViewModelImpl extends androidx.lifecycle.ViewModel implements com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.wallcats.interactors.WallCatInteractor interactor;
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.wallcats.interactors.WallCatInteractor getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.interactors.WallCatInteractor p0) {
    }
    
    @java.lang.Override()
    public void initInjection() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object initWallCat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.wallcats.model.view.CatBreedView>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadNextCats(int key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.wallcats.model.view.CatBreedView>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.evgeny.goncharov.wallcats.ui.events.WallCatsEvents> getUiEventsLiveData() {
        return null;
    }
    
    public WallCatsViewModelImpl() {
        super();
    }
}