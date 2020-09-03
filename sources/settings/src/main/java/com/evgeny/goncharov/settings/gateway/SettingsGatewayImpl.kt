package com.evgeny.goncharov.settings.gateway

import com.evgeny.goncharov.coreapi.RU_CODE
import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.settings.models.ThemeModel
import com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp.Companion.INDEX_CHOOSE_EN
import com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp.Companion.INDEX_CHOOSE_RU
import javax.inject.Inject

class SettingsGatewayImpl @Inject constructor(
    private val themeManager: ThemeManager,
    private val languageManager: LanguageManager
) : SettingsGateway {


    override fun getThemeModeAppNow() = ThemeModel(themeManager.getThemeModeAppNow())

    override fun saveChooseTheme(themeValue: Int) {
        themeManager.setThemeMode(themeValue)
    }

    override fun getAppLanguage() = when (languageManager.getAppLanguage()) {
        RU_CODE -> Language.RU
        else -> Language.EN
    }

    override fun getSelectLanguage() = when (languageManager.getAppLanguageEnum()) {
        Language.RU -> INDEX_CHOOSE_RU
        Language.EN -> INDEX_CHOOSE_EN
    }

    override fun chooseLanguage(lang: Language) {
        languageManager.chooseLanguage(lang.code)
    }
}