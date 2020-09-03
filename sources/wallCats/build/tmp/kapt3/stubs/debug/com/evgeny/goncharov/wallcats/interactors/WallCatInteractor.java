package com.evgeny.goncharov.wallcats.interactors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/evgeny/goncharov/wallcats/interactors/WallCatInteractor;", "", "getUiEventsLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/evgeny/goncharov/wallcats/ui/events/WallCatsEvents;", "loadNexPage", "", "Lcom/evgeny/goncharov/wallcats/model/view/CatBreedView;", "key", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWallCat", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wallCats_debug"})
public abstract interface WallCatInteractor {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadWallCat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.wallcats.model.view.CatBreedView>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadNexPage(int key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.evgeny.goncharov.wallcats.model.view.CatBreedView>> p1);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.evgeny.goncharov.wallcats.ui.events.WallCatsEvents> getUiEventsLiveData();
}