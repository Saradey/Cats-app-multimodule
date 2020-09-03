package com.evgeny.goncharov.wallcats.view.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\f\u001a\u00020\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/evgeny/goncharov/wallcats/view/model/WallCatsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "interactor", "Lcom/evgeny/goncharov/wallcats/interactors/WallCatInteractor;", "getInteractor", "()Lcom/evgeny/goncharov/wallcats/interactors/WallCatInteractor;", "setInteractor", "(Lcom/evgeny/goncharov/wallcats/interactors/WallCatInteractor;)V", "getUiEventsLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/evgeny/goncharov/wallcats/ui/events/WallCatsEvents;", "initInjection", "", "initWallCat", "", "Lcom/evgeny/goncharov/wallcats/model/view/CatBreedView;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadNextCats", "key", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wallCats_debug"})
public final class WallCatsViewModel extends androidx.lifecycle.ViewModel {
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
    
    public final void initInjection() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object initWallCat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.wallcats.model.view.CatBreedView>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadNextCats(int key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.wallcats.model.view.CatBreedView>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.evgeny.goncharov.wallcats.ui.events.WallCatsEvents> getUiEventsLiveData() {
        return null;
    }
    
    public WallCatsViewModel() {
        super();
    }
}