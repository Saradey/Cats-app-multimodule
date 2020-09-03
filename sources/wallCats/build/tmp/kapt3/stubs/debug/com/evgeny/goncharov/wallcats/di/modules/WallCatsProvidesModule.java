package com.evgeny.goncharov.wallcats.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/evgeny/goncharov/wallcats/di/modules/WallCatsProvidesModule;", "", "()V", "provideApiBreeds", "Lcom/evgeny/goncharov/wallcats/rest/ApiBreeds;", "retrofit", "Lretrofit2/Retrofit;", "provideWallCatsViewModel", "Lcom/evgeny/goncharov/wallcats/view/model/WallCatsViewModel;", "fragment", "Lcom/evgeny/goncharov/wallcats/ui/WallCatsFragment;", "wallCats_debug"})
@dagger.Module()
public final class WallCatsProvidesModule {
    public static final com.evgeny.goncharov.wallcats.di.modules.WallCatsProvidesModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public static final com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel provideWallCatsViewModel(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.ui.WallCatsFragment fragment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public static final com.evgeny.goncharov.wallcats.rest.ApiBreeds provideApiBreeds(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    private WallCatsProvidesModule() {
        super();
    }
}