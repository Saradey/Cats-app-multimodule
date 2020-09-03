package com.evgeny.goncharov.searchcats.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010\'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\u0012\u0010)\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u0015H\u0016J\u001a\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020/2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0018\u00100\u001a\u00020\u00152\u000e\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102H\u0002J\b\u00104\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u00066"}, d2 = {"Lcom/evgeny/goncharov/searchcats/ui/SearchCatFragment;", "Lcom/evgeny/goncharov/coreapi/base/BaseFragment;", "()V", "adapter", "Lcom/evgeny/goncharov/searchcats/ui/adapter/CatsCathedAdapter;", "uiLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/evgeny/goncharov/searchcats/ui/events/SearchCatEvents;", "viewModel", "Lcom/evgeny/goncharov/searchcats/view/model/SearchCatViewModel;", "getViewModel", "()Lcom/evgeny/goncharov/searchcats/view/model/SearchCatViewModel;", "setViewModel", "(Lcom/evgeny/goncharov/searchcats/view/model/SearchCatViewModel;)V", "wallCatsMediator", "Lcom/evgeny/goncharov/coreapi/mediators/WallCatsMediator;", "getWallCatsMediator", "()Lcom/evgeny/goncharov/coreapi/mediators/WallCatsMediator;", "setWallCatsMediator", "(Lcom/evgeny/goncharov/coreapi/mediators/WallCatsMediator;)V", "chooseCat", "", "id", "", "getLayoutId", "", "hideProgress", "hideProgressAndShowModels", "hideProgressAndShowStub", "hideStubAndListAndShowProgress", "initAdapterAndRecycle", "initCatsCathed", "initDaggerGraph", "initEditTextSearchView", "searchView", "Landroidx/appcompat/widget/SearchView;", "initLiveData", "initSearchView", "initToolbar", "initUi", "initUiEvents", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "setCatsCatched", "models", "", "Lcom/evgeny/goncharov/searchcats/model/CatCatched;", "showProgress", "Companion", "searchCats_debug"})
public final class SearchCatFragment extends com.evgeny.goncharov.coreapi.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.coreapi.mediators.WallCatsMediator wallCatsMediator;
    private androidx.lifecycle.LiveData<com.evgeny.goncharov.searchcats.ui.events.SearchCatEvents> uiLiveData;
    private com.evgeny.goncharov.searchcats.ui.adapter.CatsCathedAdapter adapter;
    public static final com.evgeny.goncharov.searchcats.ui.SearchCatFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.coreapi.mediators.WallCatsMediator getWallCatsMediator() {
        return null;
    }
    
    public final void setWallCatsMediator(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.mediators.WallCatsMediator p0) {
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
    
    private final void initUi() {
    }
    
    private final void initLiveData() {
    }
    
    private final void initCatsCathed() {
    }
    
    private final void initUiEvents() {
    }
    
    private final void chooseCat(java.lang.String id) {
    }
    
    private final void initAdapterAndRecycle() {
    }
    
    private final void initToolbar() {
    }
    
    private final void initSearchView() {
    }
    
    private final void initEditTextSearchView(androidx.appcompat.widget.SearchView searchView) {
    }
    
    private final void hideStubAndListAndShowProgress() {
    }
    
    private final void hideProgressAndShowStub() {
    }
    
    private final void hideProgressAndShowModels() {
    }
    
    private final void setCatsCatched(java.util.List<com.evgeny.goncharov.searchcats.model.CatCatched> models) {
    }
    
    private final void showProgress() {
    }
    
    private final void hideProgress() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public SearchCatFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/evgeny/goncharov/searchcats/ui/SearchCatFragment$Companion;", "", "()V", "getInstance", "Lcom/evgeny/goncharov/searchcats/ui/SearchCatFragment;", "searchCats_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.evgeny.goncharov.searchcats.ui.SearchCatFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}