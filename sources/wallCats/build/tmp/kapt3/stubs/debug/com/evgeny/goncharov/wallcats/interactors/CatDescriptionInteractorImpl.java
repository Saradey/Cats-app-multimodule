package com.evgeny.goncharov.wallcats.interactors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0013\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/evgeny/goncharov/wallcats/interactors/CatDescriptionInteractorImpl;", "Lcom/evgeny/goncharov/wallcats/interactors/CatDescriptionInteractor;", "repository", "Lcom/evgeny/goncharov/wallcats/gateways/CatDescriptionGateway;", "(Lcom/evgeny/goncharov/wallcats/gateways/CatDescriptionGateway;)V", "catId", "", "liveDataUiEvents", "Lcom/evgeny/goncharov/coreapi/utils/SingleLiveEvent;", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents;", "getLiveDataUiEvents", "loadChooseCat", "Lcom/evgeny/goncharov/wallcats/model/view/CatDescription;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadChooseCatFromDatabase", "setCatId", "", "validateData", "model", "wallCats_debug"})
public final class CatDescriptionInteractorImpl implements com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor {
    private java.lang.String catId = "";
    private com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents> liveDataUiEvents;
    private final com.evgeny.goncharov.wallcats.gateways.CatDescriptionGateway repository = null;
    
    @java.lang.Override()
    public void setCatId(@org.jetbrains.annotations.NotNull()
    java.lang.String catId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadChooseCat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.evgeny.goncharov.wallcats.model.view.CatDescription> p0) {
        return null;
    }
    
    private final void validateData(com.evgeny.goncharov.wallcats.model.view.CatDescription model) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents> getLiveDataUiEvents() {
        return null;
    }
    
    @javax.inject.Inject()
    public CatDescriptionInteractorImpl(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.gateways.CatDescriptionGateway repository) {
        super();
    }
}