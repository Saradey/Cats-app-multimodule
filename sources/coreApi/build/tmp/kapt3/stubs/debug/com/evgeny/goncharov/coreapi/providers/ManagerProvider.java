package com.evgeny.goncharov.coreapi.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/evgeny/goncharov/coreapi/providers/ManagerProvider;", "", "provideLanguageManager", "Lcom/evgeny/goncharov/coreapi/managers/LanguageManager;", "provideThemeManager", "Lcom/evgeny/goncharov/coreapi/managers/ThemeManager;", "coreApi_debug"})
public abstract interface ManagerProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.managers.LanguageManager provideLanguageManager();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.managers.ThemeManager provideThemeManager();
}