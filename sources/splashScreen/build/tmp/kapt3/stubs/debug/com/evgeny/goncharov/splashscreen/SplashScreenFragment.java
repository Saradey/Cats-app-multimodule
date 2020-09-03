package com.evgeny.goncharov.splashscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/evgeny/goncharov/splashscreen/SplashScreenFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "wallCatsMediator", "Lcom/evgeny/goncharov/coreapi/mediators/WallCatsMediator;", "getWallCatsMediator", "()Lcom/evgeny/goncharov/coreapi/mediators/WallCatsMediator;", "setWallCatsMediator", "(Lcom/evgeny/goncharov/coreapi/mediators/WallCatsMediator;)V", "animationView", "", "content", "Landroid/view/View;", "goToTheNextFragment", "init", "initFountSplashScreenTitle", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "startAnimation", "Companion", "splashScreen_debug"})
public final class SplashScreenFragment extends androidx.fragment.app.Fragment {
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.coreapi.mediators.WallCatsMediator wallCatsMediator;
    private static final long DELAY_SPLASH_SCREEN_MILLISECONDS = 2500L;
    public static final com.evgeny.goncharov.splashscreen.SplashScreenFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void init(android.view.View content) {
    }
    
    private final void initFountSplashScreenTitle(android.view.View content) {
    }
    
    private final void animationView(android.view.View content) {
    }
    
    private final void startAnimation(android.view.View content) {
    }
    
    private final void goToTheNextFragment() {
    }
    
    public SplashScreenFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/evgeny/goncharov/splashscreen/SplashScreenFragment$Companion;", "", "()V", "DELAY_SPLASH_SCREEN_MILLISECONDS", "", "getInstance", "Lcom/evgeny/goncharov/splashscreen/SplashScreenFragment;", "splashScreen_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.evgeny.goncharov.splashscreen.SplashScreenFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}