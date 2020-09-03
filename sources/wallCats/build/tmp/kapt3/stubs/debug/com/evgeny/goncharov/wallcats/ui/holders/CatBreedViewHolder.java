package com.evgeny.goncharov.wallcats.ui.holders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/holders/CatBreedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "listener", "Lcom/evgeny/goncharov/wallcats/ui/holders/CatBreedViewHolder$CatBreedViewHolderListener;", "(Landroid/view/View;Lcom/evgeny/goncharov/wallcats/ui/holders/CatBreedViewHolder$CatBreedViewHolderListener;)V", "bind", "", "item", "Lcom/evgeny/goncharov/wallcats/model/view/CatBreedView;", "CatBreedViewHolderListener", "Companion", "wallCats_debug"})
public final class CatBreedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder.CatBreedViewHolderListener listener = null;
    private static final int SIZE_BITMAP_CATS = 100;
    public static final com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder.Companion Companion = null;
    
    public final void bind(@org.jetbrains.annotations.Nullable()
    com.evgeny.goncharov.wallcats.model.view.CatBreedView item) {
    }
    
    public CatBreedViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder.CatBreedViewHolderListener listener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/holders/CatBreedViewHolder$CatBreedViewHolderListener;", "", "clickCatBreed", "", "id", "", "clickCatUrlBreed", "urlImage", "wallCats_debug"})
    public static abstract interface CatBreedViewHolderListener {
        
        public abstract void clickCatBreed(@org.jetbrains.annotations.Nullable()
        java.lang.String id);
        
        public abstract void clickCatUrlBreed(@org.jetbrains.annotations.Nullable()
        java.lang.String urlImage);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/evgeny/goncharov/wallcats/ui/holders/CatBreedViewHolder$Companion;", "", "()V", "SIZE_BITMAP_CATS", "", "wallCats_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}