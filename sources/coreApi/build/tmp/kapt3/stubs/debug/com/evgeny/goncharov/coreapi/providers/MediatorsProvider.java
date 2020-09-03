package com.evgeny.goncharov.coreapi.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/evgeny/goncharov/coreapi/providers/MediatorsProvider;", "", "provideSearchCatsMediator", "Lcom/evgeny/goncharov/coreapi/mediators/SearchCatsMediator;", "provideSettingMediator", "Lcom/evgeny/goncharov/coreapi/mediators/SettingsMediator;", "provideSplashScreenMediator", "Lcom/evgeny/goncharov/coreapi/mediators/SplashScreenMediator;", "provideWallCatsMediator", "Lcom/evgeny/goncharov/coreapi/mediators/WallCatsMediator;", "coreApi_debug"})
public abstract interface MediatorsProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator provideSearchCatsMediator();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.mediators.SplashScreenMediator provideSplashScreenMediator();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.mediators.WallCatsMediator provideWallCatsMediator();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.mediators.SettingsMediator provideSettingMediator();
}