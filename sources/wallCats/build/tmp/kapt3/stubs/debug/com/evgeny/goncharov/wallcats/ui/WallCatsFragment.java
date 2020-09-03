package com.evgeny.goncharov.wallcats.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010(H\u0016J\b\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020&H\u0002J\b\u0010.\u001a\u00020&H\u0002J\b\u0010/\u001a\u00020&H\u0002J\b\u00100\u001a\u00020&H\u0002J\b\u00101\u001a\u00020&H\u0002J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0002J\b\u00104\u001a\u00020&H\u0002J\b\u00105\u001a\u00020&H\u0002J\b\u00106\u001a\u00020&H\u0002J\u0012\u00107\u001a\u00020&2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020&H\u0016J\u001a\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020=2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010>\u001a\u00020&H\u0002J\b\u0010?\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006A"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/WallCatsFragment;", "Lcom/evgeny/goncharov/coreapi/base/BaseFragment;", "Lcom/evgeny/goncharov/wallcats/ui/holders/CatBreedViewHolder$CatBreedViewHolderListener;", "()V", "adapter", "Lcom/evgeny/goncharov/wallcats/ui/adapters/CatBreedsPagedAdapter;", "dataSource", "Lcom/evgeny/goncharov/wallcats/ui/adapters/PageKeyedDataSourceCatBreeds;", "mainThreadExecutor", "Lcom/evgeny/goncharov/coreapi/utils/MainThreadExecutor;", "searchMediator", "Lcom/evgeny/goncharov/coreapi/mediators/SearchCatsMediator;", "getSearchMediator", "()Lcom/evgeny/goncharov/coreapi/mediators/SearchCatsMediator;", "setSearchMediator", "(Lcom/evgeny/goncharov/coreapi/mediators/SearchCatsMediator;)V", "settingsMediator", "Lcom/evgeny/goncharov/coreapi/mediators/SettingsMediator;", "getSettingsMediator", "()Lcom/evgeny/goncharov/coreapi/mediators/SettingsMediator;", "setSettingsMediator", "(Lcom/evgeny/goncharov/coreapi/mediators/SettingsMediator;)V", "uiLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/evgeny/goncharov/wallcats/ui/events/WallCatsEvents;", "viewModel", "Lcom/evgeny/goncharov/wallcats/view/model/WallCatsViewModel;", "getViewModel", "()Lcom/evgeny/goncharov/wallcats/view/model/WallCatsViewModel;", "setViewModel", "(Lcom/evgeny/goncharov/wallcats/view/model/WallCatsViewModel;)V", "wallCatsMediator", "Lcom/evgeny/goncharov/coreapi/mediators/WallCatsMediator;", "getWallCatsMediator", "()Lcom/evgeny/goncharov/coreapi/mediators/WallCatsMediator;", "setWallCatsMediator", "(Lcom/evgeny/goncharov/coreapi/mediators/WallCatsMediator;)V", "clickCatBreed", "", "id", "", "clickCatUrlBreed", "urlImage", "getLayoutId", "", "hideProgress", "hideStubSomethingWrong", "init", "initDaggerGraph", "initFirstSwipeRefreshLayout", "initLiveData", "initPagedAdapterAndRecycle", "initSwipeRefreshLayout", "initToolbar", "initUi", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "showProgress", "showStubSomethingWrong", "Companion", "wallCats_debug"})
public final class WallCatsFragment extends com.evgeny.goncharov.coreapi.base.BaseFragment implements com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder.CatBreedViewHolderListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.coreapi.mediators.WallCatsMediator wallCatsMediator;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator searchMediator;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.coreapi.mediators.SettingsMediator settingsMediator;
    private androidx.lifecycle.LiveData<com.evgeny.goncharov.wallcats.ui.events.WallCatsEvents> uiLiveData;
    private com.evgeny.goncharov.wallcats.ui.adapters.PageKeyedDataSourceCatBreeds dataSource;
    private com.evgeny.goncharov.coreapi.utils.MainThreadExecutor mainThreadExecutor;
    private com.evgeny.goncharov.wallcats.ui.adapters.CatBreedsPagedAdapter adapter;
    public static final com.evgeny.goncharov.wallcats.ui.WallCatsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.coreapi.mediators.WallCatsMediator getWallCatsMediator() {
        return null;
    }
    
    public final void setWallCatsMediator(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.mediators.WallCatsMediator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator getSearchMediator() {
        return null;
    }
    
    public final void setSearchMediator(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.coreapi.mediators.SettingsMediator getSettingsMediator() {
        return null;
    }
    
    public final void setSettingsMediator(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.mediators.SettingsMediator p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    private final void init() {
    }
    
    private final void initUi() {
    }
    
    private final void initLiveData() {
    }
    
    private final void showProgress() {
    }
    
    private final void hideStubSomethingWrong() {
    }
    
    private final void showStubSomethingWrong() {
    }
    
    private final void hideProgress() {
    }
    
    @java.lang.Override()
    public void clickCatUrlBreed(@org.jetbrains.annotations.Nullable()
    java.lang.String urlImage) {
    }
    
    @java.lang.Override()
    public void clickCatBreed(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
    }
    
    private final void initFirstSwipeRefreshLayout() {
    }
    
    private final void initSwipeRefreshLayout() {
    }
    
    private final void initPagedAdapterAndRecycle() {
    }
    
    private final void initToolbar() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public WallCatsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/WallCatsFragment$Companion;", "", "()V", "getInstance", "Lcom/evgeny/goncharov/wallcats/ui/WallCatsFragment;", "wallCats_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.evgeny.goncharov.wallcats.ui.WallCatsFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}