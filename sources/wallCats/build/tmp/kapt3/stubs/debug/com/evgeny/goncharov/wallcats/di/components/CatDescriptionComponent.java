package com.evgeny.goncharov.wallcats.di.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \b2\u00020\u0001:\u0002\b\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/evgeny/goncharov/wallcats/di/components/CatDescriptionComponent;", "", "inject", "", "fragment", "Lcom/evgeny/goncharov/wallcats/ui/CatDescriptionFragment;", "viewModel", "Lcom/evgeny/goncharov/wallcats/view/model/CatDescriptionViewModel;", "Companion", "Factory", "wallCats_debug"})
@dagger.Component(dependencies = {com.evgeny.goncharov.coreapi.providers.ProviderFacade.class}, modules = {com.evgeny.goncharov.wallcats.di.modules.CatDescriptionBindsModule.class, com.evgeny.goncharov.wallcats.di.modules.CatDescriptionProvidesModule.class})
@javax.inject.Singleton()
public abstract interface CatDescriptionComponent {
    public static final com.evgeny.goncharov.wallcats.di.components.CatDescriptionComponent.Companion Companion = null;
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.ui.CatDescriptionFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel viewModel);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/evgeny/goncharov/wallcats/di/components/CatDescriptionComponent$Factory;", "", "plus", "Lcom/evgeny/goncharov/wallcats/di/components/CatDescriptionComponent;", "fragment", "Lcom/evgeny/goncharov/wallcats/ui/CatDescriptionFragment;", "provide", "Lcom/evgeny/goncharov/coreapi/providers/ProviderFacade;", "wallCats_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.evgeny.goncharov.wallcats.di.components.CatDescriptionComponent plus(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        com.evgeny.goncharov.wallcats.ui.CatDescriptionFragment fragment, @org.jetbrains.annotations.NotNull()
        com.evgeny.goncharov.coreapi.providers.ProviderFacade provide);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/evgeny/goncharov/wallcats/di/components/CatDescriptionComponent$Companion;", "", "()V", "component", "Lcom/evgeny/goncharov/wallcats/di/components/CatDescriptionComponent;", "getComponent", "()Lcom/evgeny/goncharov/wallcats/di/components/CatDescriptionComponent;", "setComponent", "(Lcom/evgeny/goncharov/wallcats/di/components/CatDescriptionComponent;)V", "init", "provide", "Lcom/evgeny/goncharov/coreapi/providers/ProviderFacade;", "fragment", "Lcom/evgeny/goncharov/wallcats/ui/CatDescriptionFragment;", "wallCats_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.Nullable()
        private static com.evgeny.goncharov.wallcats.di.components.CatDescriptionComponent component;
        
        @org.jetbrains.annotations.Nullable()
        public final com.evgeny.goncharov.wallcats.di.components.CatDescriptionComponent getComponent() {
            return null;
        }
        
        public final void setComponent(@org.jetbrains.annotations.Nullable()
        com.evgeny.goncharov.wallcats.di.components.CatDescriptionComponent p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.evgeny.goncharov.wallcats.di.components.CatDescriptionComponent init(@org.jetbrains.annotations.NotNull()
        com.evgeny.goncharov.coreapi.providers.ProviderFacade provide, @org.jetbrains.annotations.NotNull()
        com.evgeny.goncharov.wallcats.ui.CatDescriptionFragment fragment) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}