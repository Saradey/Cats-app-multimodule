package com.evgeny.goncharov.settings.view.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0014H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/evgeny/goncharov/settings/view/model/SettingsViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Lcom/evgeny/goncharov/settings/view/model/SettingsViewModel;", "()V", "interactor", "Lcom/evgeny/goncharov/settings/interactor/SettingsInteractor;", "getInteractor", "()Lcom/evgeny/goncharov/settings/interactor/SettingsInteractor;", "setInteractor", "(Lcom/evgeny/goncharov/settings/interactor/SettingsInteractor;)V", "languageLiveData", "Lcom/evgeny/goncharov/coreapi/utils/SingleLiveEvent;", "Lcom/evgeny/goncharov/coreapi/utils/Language;", "themeLiveDataModel", "Lcom/evgeny/goncharov/settings/models/ThemeModel;", "uiLiveDataEvent", "Lcom/evgeny/goncharov/settings/events/SettingUiEvents;", "chooseLanguage", "", "itemIndex", "", "getLanguageLiveData", "getSelectLanguage", "getThemeLiveData", "getThemeNow", "getThemeValue", "getUiEvents", "initInjection", "initLanguageToView", "initThemeToView", "setChooseThemeIndex", "item", "settings_debug"})
public final class SettingsViewModelImpl extends androidx.lifecycle.ViewModel implements com.evgeny.goncharov.settings.view.model.SettingsViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.settings.interactor.SettingsInteractor interactor;
    private final com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.settings.models.ThemeModel> themeLiveDataModel = null;
    private final com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.coreapi.utils.Language> languageLiveData = null;
    private final com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.settings.events.SettingUiEvents> uiLiveDataEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.settings.interactor.SettingsInteractor getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.settings.interactor.SettingsInteractor p0) {
    }
    
    @java.lang.Override()
    public void initInjection() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.settings.models.ThemeModel> getThemeLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void initThemeToView() {
    }
    
    @java.lang.Override()
    public int getThemeValue() {
        return 0;
    }
    
    @java.lang.Override()
    public void setChooseThemeIndex(int item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.coreapi.utils.Language> getLanguageLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void initLanguageToView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.settings.events.SettingUiEvents> getUiEvents() {
        return null;
    }
    
    @java.lang.Override()
    public int getThemeNow() {
        return 0;
    }
    
    @java.lang.Override()
    public int getSelectLanguage() {
        return 0;
    }
    
    @java.lang.Override()
    public void chooseLanguage(int itemIndex) {
    }
    
    public SettingsViewModelImpl() {
        super();
    }
}