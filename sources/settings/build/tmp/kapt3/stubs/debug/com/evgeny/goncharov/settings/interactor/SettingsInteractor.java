package com.evgeny.goncharov.settings.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&\u00a8\u0006\u0010"}, d2 = {"Lcom/evgeny/goncharov/settings/interactor/SettingsInteractor;", "", "chooseLanguage", "", "itemIndex", "", "getAppLanguage", "Lcom/evgeny/goncharov/coreapi/utils/Language;", "getChooseLanguageIndex", "getSelectLanguage", "getTheme", "getThemeNow", "Lcom/evgeny/goncharov/settings/models/ThemeModel;", "getThemeValue", "onLight", "onNight", "settings_debug"})
public abstract interface SettingsInteractor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.settings.models.ThemeModel getThemeNow();
    
    public abstract void onLight();
    
    public abstract void onNight();
    
    public abstract int getThemeValue();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.utils.Language getAppLanguage();
    
    public abstract int getTheme();
    
    public abstract int getSelectLanguage();
    
    public abstract void chooseLanguage(int itemIndex);
    
    public abstract int getChooseLanguageIndex();
}