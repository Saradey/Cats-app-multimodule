package com.evgeny.goncharov.coreimpl.mangers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/evgeny/goncharov/coreimpl/mangers/LanguageManagerImpl;", "Lcom/evgeny/goncharov/coreapi/managers/LanguageManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "chooseLanguage", "", "langCode", "", "getAppLanguage", "getAppLanguageEnum", "Lcom/evgeny/goncharov/coreapi/utils/Language;", "getUserSelectedLanguageBlocking", "Ljava/util/Locale;", "Companion", "coreImpl_debug"})
public final class LanguageManagerImpl implements com.evgeny.goncharov.coreapi.managers.LanguageManager {
    private final android.content.Context context = null;
    private static final java.lang.String LANGUAGE_SHARED_PREF_CODE = "LANGUAGE_SHARED_PREF_CODE";
    private static final java.lang.String LANGUAGE_VALUE_PREF_CODE = "LANGUAGE_VALUE_PREF_CODE";
    public static final com.evgeny.goncharov.coreimpl.mangers.LanguageManagerImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAppLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evgeny.goncharov.coreapi.utils.Language getAppLanguageEnum() {
        return null;
    }
    
    @java.lang.Override()
    public void chooseLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Locale getUserSelectedLanguageBlocking() {
        return null;
    }
    
    @javax.inject.Inject()
    public LanguageManagerImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/evgeny/goncharov/coreimpl/mangers/LanguageManagerImpl$Companion;", "", "()V", "LANGUAGE_SHARED_PREF_CODE", "", "LANGUAGE_VALUE_PREF_CODE", "coreImpl_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}