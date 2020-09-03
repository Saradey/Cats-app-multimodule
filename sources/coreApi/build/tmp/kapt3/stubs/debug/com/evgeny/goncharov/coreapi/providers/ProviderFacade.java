package com.evgeny.goncharov.coreapi.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/evgeny/goncharov/coreapi/providers/ProviderFacade;", "Lcom/evgeny/goncharov/coreapi/providers/MediatorsProvider;", "Lcom/evgeny/goncharov/coreapi/providers/DatabaseProvider;", "Lcom/evgeny/goncharov/coreapi/providers/NetworkProvider;", "Lcom/evgeny/goncharov/coreapi/providers/ManagerProvider;", "Companion", "coreApi_debug"})
public abstract interface ProviderFacade extends com.evgeny.goncharov.coreapi.providers.MediatorsProvider, com.evgeny.goncharov.coreapi.providers.DatabaseProvider, com.evgeny.goncharov.coreapi.providers.NetworkProvider, com.evgeny.goncharov.coreapi.providers.ManagerProvider {
    public static final com.evgeny.goncharov.coreapi.providers.ProviderFacade.Companion Companion = null;
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/evgeny/goncharov/coreapi/providers/ProviderFacade$Companion;", "", "()V", "component", "Lcom/evgeny/goncharov/coreapi/providers/ProviderFacade;", "getComponent", "()Lcom/evgeny/goncharov/coreapi/providers/ProviderFacade;", "setComponent", "(Lcom/evgeny/goncharov/coreapi/providers/ProviderFacade;)V", "coreApi_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static com.evgeny.goncharov.coreapi.providers.ProviderFacade component;
        
        @org.jetbrains.annotations.NotNull()
        public final com.evgeny.goncharov.coreapi.providers.ProviderFacade getComponent() {
            return null;
        }
        
        public final void setComponent(@org.jetbrains.annotations.NotNull()
        com.evgeny.goncharov.coreapi.providers.ProviderFacade p0) {
        }
        
        private Companion() {
            super();
        }
    }
}