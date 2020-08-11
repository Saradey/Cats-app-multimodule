package com.evgeny.goncharov.coreapi.providers

import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.ThemeManager

interface ManagerProvider {

    fun provideLanguageManager(): LanguageManager

    fun provideThemeManager(): ThemeManager
}