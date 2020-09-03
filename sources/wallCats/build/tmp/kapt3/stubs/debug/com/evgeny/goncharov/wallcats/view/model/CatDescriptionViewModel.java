package com.evgeny.goncharov.wallcats.view.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/evgeny/goncharov/wallcats/view/model/CatDescriptionViewModel;", "", "getCatDescriptionLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/evgeny/goncharov/wallcats/model/view/CatDescription;", "getLiveDataUiEvents", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents;", "initInjection", "", "loadChooseCat", "setCatId", "catId", "", "wallCats_debug"})
public abstract interface CatDescriptionViewModel {
    
    public abstract void setCatId(@org.jetbrains.annotations.NotNull()
    java.lang.String catId);
    
    public abstract void loadChooseCat();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.evgeny.goncharov.wallcats.model.view.CatDescription> getCatDescriptionLiveData();
    
    public abstract void initInjection();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents> getLiveDataUiEvents();
}