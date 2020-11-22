package com.evgeny.goncharov.settings.gateway

import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.settings.models.ThemeModel

/**
 * Контракт источника данных на экране настроек
 */
interface SettingsGateway {

    /**
     * Получить тему установленную на данный момент в приложении
     */
    fun getThemeModeAppNow(): ThemeModel

    /**
     * Сменить тему
     * @param themeValue сменяемая тема
     */
    fun saveChooseTheme(themeValue: Int)

    /**
     * Получить язык приложеняи установленный на данный момент
     */
    fun getAppLanguage(): Language

    /**
     * Получить индекс выбранного языка
     */
    fun getSelectLanguage(): Int

    /**
     * Сменить язык
     * @param lang сменяемый язык
     */
    fun chooseLanguage(lang: Language)

    /**
     * Получить тип выбранной сортировки
     */
    fun getSortType(): SortType

    /**
     * Делегируем тип выбранной сортировки менеджеру сортировок
     */
    fun setChooseSort(sortName: SortType)
}