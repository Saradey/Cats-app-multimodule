package com.evgeny.goncharov.settings.gateway;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/evgeny/goncharov/settings/gateway/SettingsGatewayImpl;", "Lcom/evgeny/goncharov/settings/gateway/SettingsGateway;", "themeManager", "Lcom/evgeny/goncharov/coreapi/managers/ThemeManager;", "languageManager", "Lcom/evgeny/goncharov/coreapi/managers/LanguageManager;", "(Lcom/evgeny/goncharov/coreapi/managers/ThemeManager;Lcom/evgeny/goncharov/coreapi/managers/LanguageManager;)V", "chooseLanguage", "", "lang", "Lcom/evgeny/goncharov/coreapi/utils/Language;", "getAppLanguage", "getSelectLanguage", "", "getThemeModeAppNow", "Lcom/evgeny/goncharov/settings/models/ThemeModel;", "saveChooseTheme", "themeValue", "settings_debug"})
public final class SettingsGatewayImpl implements com.evgeny.goncharov.settings.gateway.SettingsGateway {
    private final com.evgeny.goncharov.coreapi.managers.ThemeManager themeManager = null;
    private final com.evgeny.goncharov.coreapi.managers.LanguageManager languageManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.settings.models.ThemeModel getThemeModeAppNow() {
        return null;
    }
    
    @java.lang.Override()
    public void saveChooseTheme(int themeValue) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.coreapi.utils.Language getAppLanguage() {
        return null;
    }
    
    @java.lang.Override()
    public int getSelectLanguage() {
        return 0;
    }
    
    @java.lang.Override()
    public void chooseLanguage(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.utils.Language lang) {
    }
    
    @javax.inject.Inject()
    public SettingsGatewayImpl(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.managers.ThemeManager themeManager, @org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.coreapi.managers.LanguageManager languageManager) {
        super();
    }
}