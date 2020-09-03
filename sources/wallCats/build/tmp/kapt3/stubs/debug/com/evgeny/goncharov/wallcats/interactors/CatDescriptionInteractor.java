package com.evgeny.goncharov.wallcats.interactors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/evgeny/goncharov/wallcats/interactors/CatDescriptionInteractor;", "", "getLiveDataUiEvents", "Landroidx/lifecycle/LiveData;", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents;", "loadChooseCat", "Lcom/evgeny/goncharov/wallcats/model/view/CatDescription;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCatId", "", "catId", "", "wallCats_debug"})
public abstract interface CatDescriptionInteractor {
    
    public abstract void setCatId(@org.jetbrains.annotations.NotNull()
    java.lang.String catId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadChooseCat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.evgeny.goncharov.wallcats.model.view.CatDescription> p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents> getLiveDataUiEvents();
}