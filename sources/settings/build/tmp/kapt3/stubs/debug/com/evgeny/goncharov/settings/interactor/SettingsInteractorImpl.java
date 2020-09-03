package com.evgeny.goncharov.settings.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/evgeny/goncharov/settings/interactor/SettingsInteractorImpl;", "Lcom/evgeny/goncharov/settings/interactor/SettingsInteractor;", "gateway", "Lcom/evgeny/goncharov/settings/gateway/SettingsGateway;", "(Lcom/evgeny/goncharov/settings/gateway/SettingsGateway;)V", "chooseLanguageIndex", "", "themeValue", "chooseLanguage", "", "itemIndex", "getAppLanguage", "Lcom/evgeny/goncharov/coreapi/utils/Language;", "getChooseLanguageIndex", "getSelectLanguage", "getTheme", "getThemeNow", "Lcom/evgeny/goncharov/settings/models/ThemeModel;", "getThemeValue", "initIndexLanguage", "onLight", "onNight", "Companion", "settings_debug"})
public final class SettingsInteractorImpl implements com.evgeny.goncharov.settings.interactor.SettingsInteractor {
    private int themeValue;
    private int chooseLanguageIndex;
    private final com.evgeny.goncharov.settings.gateway.SettingsGateway gateway = null;
    public static final int INDEX_LIGHT_DIALOG = 0;
    public static final int INDEX_NIGHT_DIALOG = 1;
    public static final int INDEX_RUSSIAN_DIALOG = 0;
    public static final int INDEX_ENGLISH_DIALOG = 1;
    public static final com.evgeny.goncharov.settings.interactor.SettingsInteractorImpl.Companion Companion = null;
    
    private final int initIndexLanguage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.settings.models.ThemeModel getThemeNow() {
        return null;
    }
    
    @java.lang.Override()
    public void onLight() {
    }
    
    @java.lang.Override()
    public void onNight() {
    }
    
    @java.lang.Override()
    public int getThemeValue() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.coreapi.utils.Language getAppLanguage() {
        return null;
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    @java.lang.Override()
    public int getSelectLanguage() {
        return 0;
    }
    
    @java.lang.Override()
    public void chooseLanguage(int itemIndex) {
    }
    
    @java.lang.Override()
    public int getChooseLanguageIndex() {
        return 0;
    }
    
    @javax.inject.Inject()
    public SettingsInteractorImpl(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.settings.gateway.SettingsGateway gateway) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/evgeny/goncharov/settings/interactor/SettingsInteractorImpl$Companion;", "", "()V", "INDEX_ENGLISH_DIALOG", "", "INDEX_LIGHT_DIALOG", "INDEX_NIGHT_DIALOG", "INDEX_RUSSIAN_DIALOG", "settings_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}