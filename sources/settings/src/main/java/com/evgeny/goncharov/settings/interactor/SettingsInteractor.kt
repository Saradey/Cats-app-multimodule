package com.evgeny.goncharov.settings.interactor

import androidx.annotation.StyleRes
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.settings.models.ThemeEntity

/**
 * Контракт use case экрана настроек
 */
interface SettingsInteractor {

    /**
     * Возвращает тему которая установлена сейчас
     */
    fun getThemeNow(): ThemeEntity

    /**
     * Включить светлую тему
     */
    fun onLight()

    /**
     * Включить темную тему
     */
    fun onNight()

    /**
     * Получить индекс темы выбранной в окне тем
     */
    fun getThemeValue(): Int

    /**
     * Получить язык приложения в виде enum
     */
    fun getAppLanguage(): Language

    /**
     * Получить ресурс темы установленно в данны момент
     */
    @StyleRes
    fun getTheme(): Int

    /**
     * Получить индекс выбранного языка
     */
    fun getSelectLanguage(): Int

    /**
     * Выбрали язык
     * @param itemIndex индекс выбранного языка
     */
    fun chosenLanguage(itemIndex: Int)

    /**
     * Получить индекс выбранного языка
     */
    fun getChooseLanguageIndex(): Int

    /**
     * Получить тип выбранной сортировки
     */
    fun getSortType(): SortType

    /**
     * Передаем выбранное значение сортировки котов в репозиторий
     * @param sortName выбранный тип сортировки
     */
    fun setChooseSort(sortName: SortType)

    /**
     * Получить значение нотификации приложения включено/выключено
     */
    fun initNotification(): Boolean

    /**
     * Сетнуть значение нотификации приложения включено/выключено
     * @param item индекс выбранного значения
     */
    fun chosenNotification(item: Int)
}