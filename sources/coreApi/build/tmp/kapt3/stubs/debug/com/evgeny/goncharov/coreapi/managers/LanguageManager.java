package com.evgeny.goncharov.coreapi.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/evgeny/goncharov/coreapi/managers/LanguageManager;", "", "chooseLanguage", "", "langCode", "", "getAppLanguage", "getAppLanguageEnum", "Lcom/evgeny/goncharov/coreapi/utils/Language;", "getUserSelectedLanguageBlocking", "Ljava/util/Locale;", "coreApi_debug"})
public abstract interface LanguageManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAppLanguage();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.evgeny.goncharov.coreapi.utils.Language getAppLanguageEnum();
    
    public abstract void chooseLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Locale getUserSelectedLanguageBlocking();
}