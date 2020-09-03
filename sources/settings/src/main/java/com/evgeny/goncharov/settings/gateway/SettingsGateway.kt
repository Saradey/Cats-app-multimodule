package com.evgeny.goncharov.settings.gateway

import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.settings.models.ThemeModel

interface SettingsGateway {

    fun getThemeModeAppNow(): ThemeModel

    fun saveChooseTheme(themeValue: Int)

    fun getAppLanguage(): Language

    fun getSelectLanguage(): Int

    fun chooseLanguage(lang: Language)
}