package com.evgeny.goncharov.wallcats.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u000e\u0010#\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010$\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\u0011H\u0002J\b\u0010&\u001a\u00020\u0011H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006("}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/CatDescriptionFragment;", "Lcom/evgeny/goncharov/coreapi/base/BaseFragment;", "()V", "catId", "", "uiLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/evgeny/goncharov/wallcats/ui/events/CatDescriptionEvents;", "viewModel", "Lcom/evgeny/goncharov/wallcats/view/model/CatDescriptionViewModel;", "getViewModel", "()Lcom/evgeny/goncharov/wallcats/view/model/CatDescriptionViewModel;", "setViewModel", "(Lcom/evgeny/goncharov/wallcats/view/model/CatDescriptionViewModel;)V", "getLayoutId", "", "hideProgress", "", "initCatDescriptionLiveData", "initDaggerGraph", "initLiveData", "initToolbar", "initUi", "initUiEventsLiveData", "loadOrInit", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "setCatDescription", "model", "Lcom/evgeny/goncharov/wallcats/model/view/CatDescription;", "setCatId", "showAllContent", "showProgress", "showStubSomethingWrong", "Companion", "wallCats_debug"})
public final class CatDescriptionFragment extends com.evgeny.goncharov.coreapi.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel viewModel;
    private java.lang.String catId;
    private androidx.lifecycle.LiveData<com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents> uiLiveData;
    public static final com.evgeny.goncharov.wallcats.ui.CatDescriptionFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadOrInit(android.os.Bundle savedInstanceState) {
    }
    
    private final void initDaggerGraph() {
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi() {
    }
    
    private final void initLiveData() {
    }
    
    private final void initCatDescriptionLiveData() {
    }
    
    private final void initUiEventsLiveData() {
    }
    
    public final void setCatId(@org.jetbrains.annotations.NotNull()
    java.lang.String catId) {
    }
    
    private final void initToolbar() {
    }
    
    private final void setCatDescription(com.evgeny.goncharov.wallcats.model.view.CatDescription model) {
    }
    
    private final void showAllContent() {
    }
    
    private final void hideProgress() {
    }
    
    private final void showProgress() {
    }
    
    private final void showStubSomethingWrong() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public CatDescriptionFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/CatDescriptionFragment$Companion;", "", "()V", "getInstance", "Lcom/evgeny/goncharov/wallcats/ui/CatDescriptionFragment;", "idCat", "", "wallCats_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.evgeny.goncharov.wallcats.ui.CatDescriptionFragment getInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String idCat) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}