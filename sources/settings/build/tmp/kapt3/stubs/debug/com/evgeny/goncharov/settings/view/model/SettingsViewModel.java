package com.evgeny.goncharov.settings.view.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\u0005H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0005H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0005H&\u00a8\u0006\u0015"}, d2 = {"Lcom/evgeny/goncharov/settings/view/model/SettingsViewModel;", "", "chooseLanguage", "", "itemIndex", "", "getLanguageLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/evgeny/goncharov/coreapi/utils/Language;", "getSelectLanguage", "getThemeLiveData", "Lcom/evgeny/goncharov/settings/models/ThemeModel;", "getThemeNow", "getThemeValue", "getUiEvents", "Lcom/evgeny/goncharov/settings/events/SettingUiEvents;", "initInjection", "initLanguageToView", "initThemeToView", "setChooseThemeIndex", "item", "settings_debug"})
public abstract interface SettingsViewModel {
    
    public abstract void initInjection();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.evgeny.goncharov.settings.models.ThemeModel> getThemeLiveData();
    
    public abstract void initThemeToView();
    
    public abstract int getThemeValue();
    
    public abstract void setChooseThemeIndex(int item);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.evgeny.goncharov.coreapi.utils.Language> getLanguageLiveData();
    
    public abstract void initLanguageToView();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.evgeny.goncharov.settings.events.SettingUiEvents> getUiEvents();
    
    public abstract int getThemeNow();
    
    public abstract int getSelectLanguage();
    
    public abstract void chooseLanguage(int itemIndex);
}