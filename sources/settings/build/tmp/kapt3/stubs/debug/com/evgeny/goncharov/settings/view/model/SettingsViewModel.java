package com.evgeny.goncharov.settings.view.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u0015\u001a\u00020\u0013J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\nJ\u0006\u0010\u001a\u001a\u00020\u0011J\u0006\u0010\u001b\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0013R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/evgeny/goncharov/settings/view/model/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "interactor", "Lcom/evgeny/goncharov/settings/interactor/SettingsInteractor;", "getInteractor", "()Lcom/evgeny/goncharov/settings/interactor/SettingsInteractor;", "setInteractor", "(Lcom/evgeny/goncharov/settings/interactor/SettingsInteractor;)V", "languageLiveData", "Lcom/evgeny/goncharov/coreapi/utils/SingleLiveEvent;", "Lcom/evgeny/goncharov/coreapi/utils/Language;", "themeLiveDataModel", "Lcom/evgeny/goncharov/settings/models/ThemeModel;", "uiLiveDataEvent", "Lcom/evgeny/goncharov/settings/events/SettingUiEvents;", "chooseLanguage", "", "itemIndex", "", "getLanguageLiveData", "getSelectLanguage", "getThemeLiveData", "getThemeNow", "getThemeValue", "getUiEvents", "initInjection", "initLanguageToView", "initThemeToView", "setChooseThemeIndex", "item", "settings_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
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
    
    public final void initInjection() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.settings.models.ThemeModel> getThemeLiveData() {
        return null;
    }
    
    public final void initThemeToView() {
    }
    
    public final int getThemeValue() {
        return 0;
    }
    
    public final void setChooseThemeIndex(int item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.coreapi.utils.Language> getLanguageLiveData() {
        return null;
    }
    
    public final void initLanguageToView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.coreapi.utils.SingleLiveEvent<com.evgeny.goncharov.settings.events.SettingUiEvents> getUiEvents() {
        return null;
    }
    
    public final int getThemeNow() {
        return 0;
    }
    
    public final int getSelectLanguage() {
        return 0;
    }
    
    public final void chooseLanguage(int itemIndex) {
    }
    
    public SettingsViewModel() {
        super();
    }
}