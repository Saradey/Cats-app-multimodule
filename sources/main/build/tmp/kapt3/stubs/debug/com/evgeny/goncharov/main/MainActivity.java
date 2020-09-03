package com.evgeny.goncharov.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\""}, d2 = {"Lcom/evgeny/goncharov/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/evgeny/goncharov/coreapi/WithFacade;", "()V", "languageManager", "Lcom/evgeny/goncharov/coreapi/managers/LanguageManager;", "getLanguageManager", "()Lcom/evgeny/goncharov/coreapi/managers/LanguageManager;", "setLanguageManager", "(Lcom/evgeny/goncharov/coreapi/managers/LanguageManager;)V", "splashScreenMediator", "Lcom/evgeny/goncharov/coreapi/mediators/SplashScreenMediator;", "getSplashScreenMediator", "()Lcom/evgeny/goncharov/coreapi/mediators/SplashScreenMediator;", "setSplashScreenMediator", "(Lcom/evgeny/goncharov/coreapi/mediators/SplashScreenMediator;)V", "themeManager", "Lcom/evgeny/goncharov/coreapi/managers/ThemeManager;", "getThemeManager", "()Lcom/evgeny/goncharov/coreapi/managers/ThemeManager;", "setThemeManager", "(Lcom/evgeny/goncharov/coreapi/managers/ThemeManager;)V", "applySelectedAppLanguage", "Landroid/content/Context;", "context", "attachBaseContext", "", "base", "getFacade", "Lcom/evgeny/goncharov/coreapi/providers/ProviderFacade;", "initDaggerGraph", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "main_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.evgeny.goncharov.coreapi.WithFacade {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.coreapi.managers.ThemeManager themeManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.coreapi.managers.LanguageManager languageManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.coreapi.mediators.SplashScreenMediator splashScreenMediator;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.coreapi.managers.ThemeManager getThemeManager() {
        return null;
    }
    
    public final void setThemeManager(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.managers.ThemeManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.coreapi.managers.LanguageManager getLanguageManager() {
        return null;
    }
    
    public final void setLanguageManager(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.managers.LanguageManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.coreapi.mediators.SplashScreenMediator getSplashScreenMediator() {
        return null;
    }
    
    public final void setSplashScreenMediator(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.mediators.SplashScreenMediator p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initDaggerGraph() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.coreapi.providers.ProviderFacade getFacade() {
        return null;
    }
    
    private final android.content.Context applySelectedAppLanguage(android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    public MainActivity() {
        super();
    }
}