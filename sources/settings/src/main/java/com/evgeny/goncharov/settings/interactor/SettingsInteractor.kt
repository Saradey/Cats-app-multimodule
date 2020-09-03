package com.evgeny.goncharov.settings.interactor

import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.settings.models.ThemeModel

interface SettingsInteractor {

    fun getThemeNow(): ThemeModel

    fun onLight()

    fun onNight()

    fun getThemeValue(): Int

    fun getAppLanguage(): Language

    fun getTheme(): Int

    fun getSelectLanguage(): Int

    fun chooseLanguage(itemIndex: Int)

    fun getChooseLanguageIndex(): Int
}