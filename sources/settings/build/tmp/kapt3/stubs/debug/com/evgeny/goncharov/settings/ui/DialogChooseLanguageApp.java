package com.evgeny.goncharov.settings.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/evgeny/goncharov/settings/ui/DialogChooseLanguageApp;", "Landroidx/fragment/app/DialogFragment;", "()V", "vm", "Lcom/evgeny/goncharov/settings/view/model/SettingsViewModel;", "getVm", "()Lcom/evgeny/goncharov/settings/view/model/SettingsViewModel;", "setVm", "(Lcom/evgeny/goncharov/settings/view/model/SettingsViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "Companion", "settings_debug"})
public final class DialogChooseLanguageApp extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.evgeny.goncharov.settings.view.model.SettingsViewModel vm;
    public static final int INDEX_CHOOSE_RU = 0;
    public static final int INDEX_CHOOSE_EN = 1;
    public static final com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.evgeny.goncharov.settings.view.model.SettingsViewModel getVm() {
        return null;
    }
    
    public final void setVm(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.settings.view.model.SettingsViewModel p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public DialogChooseLanguageApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/evgeny/goncharov/settings/ui/DialogChooseLanguageApp$Companion;", "", "()V", "INDEX_CHOOSE_EN", "", "INDEX_CHOOSE_RU", "settings_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}