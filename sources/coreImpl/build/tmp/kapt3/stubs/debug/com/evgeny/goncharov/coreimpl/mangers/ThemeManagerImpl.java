package com.evgeny.goncharov.coreimpl.mangers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/evgeny/goncharov/coreimpl/mangers/ThemeManagerImpl;", "Lcom/evgeny/goncharov/coreapi/managers/ThemeManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getThemeModeAppNow", "", "setThemeMode", "", "modeNight", "Companion", "coreImpl_debug"})
public final class ThemeManagerImpl implements com.evgeny.goncharov.coreapi.managers.ThemeManager {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_THEME_PREFERENCES_NAME = "SHARED_THEME_PREFERENCES_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MODE_NIGHT_NAME = "MODE_NIGHT_NAME";
    public static final com.evgeny.goncharov.coreimpl.mangers.ThemeManagerImpl.Companion Companion = null;
    
    @java.lang.Override()
    public int getThemeModeAppNow() {
        return 0;
    }
    
    @java.lang.Override()
    public void setThemeMode(int modeNight) {
    }
    
    @javax.inject.Inject()
    public ThemeManagerImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/evgeny/goncharov/coreimpl/mangers/ThemeManagerImpl$Companion;", "", "()V", "MODE_NIGHT_NAME", "", "SHARED_THEME_PREFERENCES_NAME", "coreImpl_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}