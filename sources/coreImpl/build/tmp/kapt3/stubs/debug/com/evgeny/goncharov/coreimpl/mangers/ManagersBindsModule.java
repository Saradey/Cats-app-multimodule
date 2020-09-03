package com.evgeny.goncharov.coreimpl.mangers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/evgeny/goncharov/coreimpl/mangers/ManagersBindsModule;", "", "bindLanguageManager", "Lcom/evgeny/goncharov/coreapi/managers/LanguageManager;", "manager", "Lcom/evgeny/goncharov/coreimpl/mangers/LanguageManagerImpl;", "bindThemeManager", "Lcom/evgeny/goncharov/coreapi/managers/ThemeManager;", "Lcom/evgeny/goncharov/coreimpl/mangers/ThemeManagerImpl;", "coreImpl_debug"})
@dagger.Module()
public abstract interface ManagersBindsModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.evgeny.goncharov.coreapi.managers.LanguageManager bindLanguageManager(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreimpl.mangers.LanguageManagerImpl manager);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.evgeny.goncharov.coreapi.managers.ThemeManager bindThemeManager(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreimpl.mangers.ThemeManagerImpl manager);
}