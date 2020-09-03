package com.evgeny.goncharov.wallcats.view.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/evgeny/goncharov/wallcats/view/model/CatDescriptionViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Lcom/evgeny/goncharov/wallcats/view/model/CatDescriptionViewModel;", "()V", "catDescriptionLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/evgeny/goncharov/wallcats/model/view/CatDescription;", "interactor", "Lcom/evgeny/goncharov/wallcats/interactors/CatDescriptionInteractor;", "getInteractor", "()Lcom/evgeny/goncharov/wallcats/interactors/CatDescriptionInteractor;", "setInteractor", "(Lcom/evgeny/goncharov/wallcats/interactors/CatDescriptionInteractor;)V", "getCatDescriptionLiveData", "getLiveDataUiEvents", "Landroidx/lifecycle/LiveData;", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents;", "initInjection", "", "loadChooseCat", "setCatId", "catId", "", "wallCats_debug"})
public final class CatDescriptionViewModelImpl extends androidx.lifecycle.ViewModel implements com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel {
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
    
    @java.lang.Override()
    public void initInjection() {
    }
    
    @java.lang.Override()
    public void setCatId(@org.jetbrains.annotations.NotNull()
    java.lang.String catId) {
    }
    
    @java.lang.Override()
    public void loadChooseCat() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<com.evgeny.goncharov.wallcats.model.view.CatDescription> getCatDescriptionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents> getLiveDataUiEvents() {
        return null;
    }
    
    public CatDescriptionViewModelImpl() {
        super();
    }
}