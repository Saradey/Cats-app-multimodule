package com.evgeny.goncharov.settings.di.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&\u00a8\u0006\f"}, d2 = {"Lcom/evgeny/goncharov/settings/di/components/SettingsComponent;", "", "inject", "", "viewModel", "Lcom/evgeny/goncharov/settings/ui/DialogChooseLanguageApp;", "Lcom/evgeny/goncharov/settings/ui/DialogChooseThemeApp;", "fragment", "Lcom/evgeny/goncharov/settings/ui/SettingsFragment;", "Lcom/evgeny/goncharov/settings/view/model/SettingsViewModel;", "Companion", "Factory", "settings_debug"})
@dagger.Component(dependencies = {com.evgeny.goncharov.coreapi.providers.ManagerProvider.class}, modules = {com.evgeny.goncharov.settings.di.modules.SettingsBindsModule.class, com.evgeny.goncharov.settings.di.modules.SettingsProvidesModule.class})
@javax.inject.Singleton()
public abstract interface SettingsComponent {
    public static final com.evgeny.goncharov.settings.di.components.SettingsComponent.Companion Companion = null;
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.settings.ui.SettingsFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.settings.view.model.SettingsViewModel viewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.settings.ui.DialogChooseThemeApp viewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp viewModel);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/evgeny/goncharov/settings/di/components/SettingsComponent$Factory;", "", "plus", "Lcom/evgeny/goncharov/settings/di/components/SettingsComponent;", "fragment", "Lcom/evgeny/goncharov/settings/ui/SettingsFragment;", "provider", "Lcom/evgeny/goncharov/coreapi/providers/ManagerProvider;", "settings_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.evgeny.goncharov.settings.di.components.SettingsComponent plus(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        com.evgeny.goncharov.settings.ui.SettingsFragment fragment, @org.jetbrains.annotations.NotNull()
        com.evgeny.goncharov.coreapi.providers.ManagerProvider provider);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/evgeny/goncharov/settings/di/components/SettingsComponent$Companion;", "", "()V", "component", "Lcom/evgeny/goncharov/settings/di/components/SettingsComponent;", "getComponent", "()Lcom/evgeny/goncharov/settings/di/components/SettingsComponent;", "setComponent", "(Lcom/evgeny/goncharov/settings/di/components/SettingsComponent;)V", "init", "fragment", "Lcom/evgeny/goncharov/settings/ui/SettingsFragment;", "provider", "Lcom/evgeny/goncharov/coreapi/providers/ManagerProvider;", "settings_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.Nullable()
        private static com.evgeny.goncharov.settings.di.components.SettingsComponent component;
        
        @org.jetbrains.annotations.Nullable()
        public final com.evgeny.goncharov.settings.di.components.SettingsComponent getComponent() {
            return null;
        }
        
        public final void setComponent(@org.jetbrains.annotations.Nullable()
        com.evgeny.goncharov.settings.di.components.SettingsComponent p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.evgeny.goncharov.settings.di.components.SettingsComponent init(@org.jetbrains.annotations.NotNull()
        com.evgeny.goncharov.settings.ui.SettingsFragment fragment, @org.jetbrains.annotations.NotNull()
        com.evgeny.goncharov.coreapi.providers.ManagerProvider provider) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}