package com.evgeny.goncharov.wallcats.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0016J*\u0010\u0010\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0016J*\u0010\u0011\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0013H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/adapters/PageKeyedDataSourceCatBreeds;", "Landroidx/paging/PageKeyedDataSource;", "", "Lcom/evgeny/goncharov/wallcats/model/view/CatBreedView;", "viewModel", "Lcom/evgeny/goncharov/wallcats/view/model/WallCatsViewModel;", "(Lcom/evgeny/goncharov/wallcats/view/model/WallCatsViewModel;)V", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "page", "loadAfter", "", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "wallCats_debug"})
public final class PageKeyedDataSourceCatBreeds extends androidx.paging.PageKeyedDataSource<java.lang.Integer, com.evgeny.goncharov.wallcats.model.view.CatBreedView> {
    private kotlinx.coroutines.CoroutineScope mainScope;
    private int page = 0;
    private final com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel viewModel = null;
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, com.evgeny.goncharov.wallcats.model.view.CatBreedView> callback) {
    }
    
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.evgeny.goncharov.wallcats.model.view.CatBreedView> callback) {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.evgeny.goncharov.wallcats.model.view.CatBreedView> callback) {
    }
    
    public PageKeyedDataSourceCatBreeds(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel viewModel) {
        super();
    }
}