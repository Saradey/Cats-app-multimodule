package com.evgeny.goncharov.wallcats.view.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/evgeny/goncharov/wallcats/view/model/CatDescriptionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "catDescriptionLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/evgeny/goncharov/wallcats/model/view/CatDescription;", "interactor", "Lcom/evgeny/goncharov/wallcats/interactors/CatDescriptionInteractor;", "getInteractor", "()Lcom/evgeny/goncharov/wallcats/interactors/CatDescriptionInteractor;", "setInteractor", "(Lcom/evgeny/goncharov/wallcats/interactors/CatDescriptionInteractor;)V", "getCatDescriptionLiveData", "getLiveDataUiEvents", "Landroidx/lifecycle/LiveData;", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents;", "initInjection", "", "loadChooseCat", "setCatId", "catId", "", "wallCats_debug"})
public final class CatDescriptionViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.evgeny.goncharov.wallcats.model.view.CatDescription> catDescriptionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor interactor;
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor p0) {
    }
    
    public final void initInjection() {
    }
    
    public final void setCatId(@org.jetbrains.annotations.NotNull()
    java.lang.String catId) {
    }
    
    public final void loadChooseCat() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.evgeny.goncharov.wallcats.model.view.CatDescription> getCatDescriptionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents> getLiveDataUiEvents() {
        return null;
    }
    
    public CatDescriptionViewModel() {
        super();
    }
}