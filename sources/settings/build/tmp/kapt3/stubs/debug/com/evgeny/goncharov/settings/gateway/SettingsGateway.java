package com.evgeny.goncharov.settings.gateway;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH&\u00a8\u0006\r"}, d2 = {"Lcom/evgeny/goncharov/settings/gateway/SettingsGateway;", "", "chooseLanguage", "", "lang", "Lcom/evgeny/goncharov/coreapi/utils/Language;", "getAppLanguage", "getSelectLanguage", "", "getThemeModeAppNow", "Lcom/evgeny/goncharov/settings/models/ThemeModel;", "saveChooseTheme", "themeValue", "settings_debug"})
public abstract interface SettingsGateway {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.settings.models.ThemeModel getThemeModeAppNow();
    
    public abstract void saveChooseTheme(int themeValue);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.utils.Language getAppLanguage();
    
    public abstract int getSelectLanguage();
    
    public abstract void chooseLanguage(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.utils.Language lang);
}