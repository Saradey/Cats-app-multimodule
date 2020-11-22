package com.evgeny.goncharov.settings.gateway

import com.evgeny.goncharov.coreapi.RU_CODE
import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.SortCatsManager
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.settings.models.ThemeModel
import com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp.Companion.INDEX_CHOOSE_EN
import com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp.Companion.INDEX_CHOOSE_RU
import javax.inject.Inject

/**
 * Реализация источника данных для экрана настрое
 * @property themeManager менеджер отвечающий за смену и хранения темы приложения
 * @property languageManager менеджер отвечающий за хранения языка приложения
 * @property sortCatsManager менеджер предоставляющий тип сортировки стены котов
 */
class SettingsGatewayImpl @Inject constructor(
    private val themeManager: ThemeManager,
    private val languageManager: LanguageManager,
    private val sortCatsManager: SortCatsManager
) : SettingsGateway {

    override fun getThemeModeAppNow() = ThemeModel(themeManager.getThemeNow())

    override fun saveChooseTheme(themeValue: Int) {
        themeManager.setThemeNow(themeValue)
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

    override fun getSortType(): SortType = sortCatsManager.getSortedType()

    override fun setChooseSort(sortName: SortType) = sortCatsManager.setSortedType(sortName)
}