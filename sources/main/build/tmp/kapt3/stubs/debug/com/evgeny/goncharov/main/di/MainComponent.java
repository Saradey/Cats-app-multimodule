package com.evgeny.goncharov.main.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/evgeny/goncharov/main/di/MainComponent;", "Lcom/evgeny/goncharov/coreapi/providers/ProviderFacade;", "inject", "", "mainActivity", "Lcom/evgeny/goncharov/main/MainActivity;", "Companion", "main_debug"})
@dagger.Component(dependencies = {com.evgeny.goncharov.coreapi.providers.ProviderFacade.class})
@javax.inject.Singleton()
public abstract interface MainComponent extends com.evgeny.goncharov.coreapi.providers.ProviderFacade {
    public static final com.evgeny.goncharov.main.di.MainComponent.Companion Companion = null;
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.main.MainActivity mainActivity);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/evgeny/goncharov/main/di/MainComponent$Companion;", "", "()V", "component", "Lcom/evgeny/goncharov/main/di/MainComponent;", "getComponent", "()Lcom/evgeny/goncharov/main/di/MainComponent;", "setComponent", "(Lcom/evgeny/goncharov/main/di/MainComponent;)V", "init", "main_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.Nullable()
        private static com.evgeny.goncharov.main.di.MainComponent component;
        
        @org.jetbrains.annotations.Nullable()
        public final com.evgeny.goncharov.main.di.MainComponent getComponent() {
            return null;
        }
        
        public final void setComponent(@org.jetbrains.annotations.Nullable()
        com.evgeny.goncharov.main.di.MainComponent p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.evgeny.goncharov.main.di.MainComponent init() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}