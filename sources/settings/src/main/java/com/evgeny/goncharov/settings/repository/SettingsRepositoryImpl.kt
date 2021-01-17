package com.evgeny.goncharov.settings.repository

import com.evgeny.goncharov.coreapi.RU_CODE
import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.NotificationAppManager
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
 * @property notificationManager менедджер который отвечает за нотификации в проекте
 */
class SettingsRepositoryImpl @Inject constructor(
    private val themeManager: ThemeManager,
    private val languageManager: LanguageManager,
    private val sortCatsManager: SortCatsManager,
    private val notificationManager: NotificationAppManager
) : SettingsRepository {

    override fun getThemeModeAppNow() = ThemeModel(themeManager.getThemeNow())

    override fun saveChooseTheme(themeValue: Int) = themeManager.setThemeNow(themeValue)

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

    override fun getSortType() = sortCatsManager.getSortedType()

    override fun setChooseSort(sortName: SortType) = sortCatsManager.setSortedType(sortName)

    override fun getStatusNotification() = notificationManager.onOrOffNotification()

    override fun chosenNotification(isOn: Boolean) = notificationManager.setOnOrOfNotification(isOn)
}