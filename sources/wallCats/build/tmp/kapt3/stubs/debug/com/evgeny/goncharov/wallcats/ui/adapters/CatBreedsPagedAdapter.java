package com.evgeny.goncharov.wallcats.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/adapters/CatBreedsPagedAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/evgeny/goncharov/wallcats/model/view/CatBreedView;", "Lcom/evgeny/goncharov/wallcats/ui/holders/CatBreedViewHolder;", "diffUtils", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "listener", "Lcom/evgeny/goncharov/wallcats/ui/holders/CatBreedViewHolder$CatBreedViewHolderListener;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lcom/evgeny/goncharov/wallcats/ui/holders/CatBreedViewHolder$CatBreedViewHolderListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "wallCats_debug"})
public final class CatBreedsPagedAdapter extends androidx.paging.PagedListAdapter<com.evgeny.goncharov.wallcats.model.view.CatBreedView, com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder> {
    private final com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder.CatBreedViewHolderListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder holder, int position) {
    }
    
    public CatBreedsPagedAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<com.evgeny.goncharov.wallcats.model.view.CatBreedView> diffUtils, @org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder.CatBreedViewHolderListener listener) {
        super(null);
    }
}