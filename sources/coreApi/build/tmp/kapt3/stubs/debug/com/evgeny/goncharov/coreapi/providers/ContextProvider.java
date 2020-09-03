package com.evgeny.goncharov.coreapi.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/evgeny/goncharov/coreapi/providers/ContextProvider;", "", "provideBuildVariants", "", "provideContext", "Landroid/content/Context;", "coreApi_debug"})
public abstract interface ContextProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context provideContext();
    
    public abstract boolean provideBuildVariants();
}