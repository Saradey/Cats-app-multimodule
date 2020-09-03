package com.evgeny.goncharov.coreimpl.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/evgeny/goncharov/coreimpl/network/NetworkComponent;", "Lcom/evgeny/goncharov/coreapi/providers/NetworkProvider;", "coreImpl_debug"})
@dagger.Component(dependencies = {com.evgeny.goncharov.coreapi.providers.ContextProvider.class}, modules = {com.evgeny.goncharov.coreimpl.network.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface NetworkComponent extends com.evgeny.goncharov.coreapi.providers.NetworkProvider {
}