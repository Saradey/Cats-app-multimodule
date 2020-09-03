package com.evgeny.goncharov.settings.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J8\u0010\u001f\u001a\u00020\u00162\b\b\u0001\u0010 \u001a\u00020\u00122\b\b\u0001\u0010!\u001a\u00020\u00122\b\b\u0003\u0010\"\u001a\u00020\u00122\b\b\u0003\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010\'\u001a\u00020\u0016H\u0002J\u0012\u0010(\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u0016H\u0016J\u001a\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0004H\u0002J\u0010\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u00064"}, d2 = {"Lcom/evgeny/goncharov/settings/ui/SettingsFragment;", "Lcom/evgeny/goncharov/coreapi/base/BaseFragment;", "()V", "lang", "Lcom/evgeny/goncharov/coreapi/utils/Language;", "languageLiveData", "Landroidx/lifecycle/LiveData;", "themeLiveData", "Lcom/evgeny/goncharov/settings/models/ThemeModel;", "uiEventLiveData", "Lcom/evgeny/goncharov/settings/events/SettingUiEvents;", "viewModel", "Lcom/evgeny/goncharov/settings/view/model/SettingsViewModel;", "getViewModel", "()Lcom/evgeny/goncharov/settings/view/model/SettingsViewModel;", "setViewModel", "(Lcom/evgeny/goncharov/settings/view/model/SettingsViewModel;)V", "getColorSubtitle", "", "getColorTitle", "getLayoutId", "init", "", "initClickLanguageChoose", "initClickThemeApp", "initDaggerGraph", "initEnLanguageTitle", "initLightTheme", "initLiveData", "initNightTheme", "initRuLanguageTitle", "initSpannableTextView", "title", "subTitle", "colorTitle", "colorSubTitle", "textView", "Landroid/widget/TextView;", "initToolbar", "initUi", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "setLanguageApp", "language", "setThemeModel", "value", "Companion", "settings_debug"})
public final class SettingsFragment extends com.evgeny.goncharov.coreapi.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.settings.view.model.SettingsViewModel viewModel;
    private com.evgeny.goncharov.coreapi.utils.Language lang = com.evgeny.goncharov.coreapi.utils.Language.RU;
    private androidx.lifecycle.LiveData<com.evgeny.goncharov.settings.models.ThemeModel> themeLiveData;
    private androidx.lifecycle.LiveData<com.evgeny.goncharov.coreapi.utils.Language> languageLiveData;
    private androidx.lifecycle.LiveData<com.evgeny.goncharov.settings.events.SettingUiEvents> uiEventLiveData;
    public static final com.evgeny.goncharov.settings.ui.SettingsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.settings.view.model.SettingsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.settings.view.model.SettingsViewModel p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initDaggerGraph() {
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi() {
    }
    
    private final void init() {
    }
    
    private final void initLiveData() {
    }
    
    private final void setThemeModel(com.evgeny.goncharov.settings.models.ThemeModel value) {
    }
    
    private final void initNightTheme() {
    }
    
    private final void initLightTheme() {
    }
    
    private final void initSpannableTextView(@androidx.annotation.StringRes()
    int title, @androidx.annotation.StringRes()
    int subTitle, @androidx.annotation.ColorRes()
    int colorTitle, @androidx.annotation.ColorRes()
    int colorSubTitle, android.widget.TextView textView) {
    }
    
    private final void initClickThemeApp() {
    }
    
    private final void initToolbar() {
    }
    
    private final void setLanguageApp(com.evgeny.goncharov.coreapi.utils.Language language) {
    }
    
    private final void initRuLanguageTitle() {
    }
    
    private final void initEnLanguageTitle() {
    }
    
    private final int getColorTitle() {
        return 0;
    }
    
    private final int getColorSubtitle() {
        return 0;
    }
    
    private final void initClickLanguageChoose() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public SettingsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/evgeny/goncharov/settings/ui/SettingsFragment$Companion;", "", "()V", "getInstance", "Lcom/evgeny/goncharov/settings/ui/SettingsFragment;", "settings_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.evgeny.goncharov.settings.ui.SettingsFragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}