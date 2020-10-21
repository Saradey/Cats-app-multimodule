package com.evgeny.goncharov.settings.interactor

import androidx.annotation.StyleRes
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.settings.models.ThemeModel

/**
 * Контракт use case экрана настроек
 */
interface SettingsInteractor {

    /**
     * Возвращает тему которая установлена сейчас
     */
    fun getThemeNow(): ThemeModel

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
    fun chooseLanguage(itemIndex: Int)

    /**
     *
     */
    fun getChooseLanguageIndex(): Int
}