package com.evgeny.goncharov.settings.interactor

import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.settings.R
import com.evgeny.goncharov.settings.gateway.SettingsGateway
import com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp.Companion.INDEX_CHOOSE_EN
import com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp.Companion.INDEX_CHOOSE_RU
import javax.inject.Inject

/**
 * Реализация бизнес логики экрана настроек
 * @property gateway источник данных для экрана настроек
 */
class SettingsInteractorImpl @Inject constructor(
    private val gateway: SettingsGateway
) : SettingsInteractor {

    companion object {

        /** Индекс светлой темы в окне */
        const val INDEX_LIGHT_DIALOG = 0

        /** Индекс темной темы в окне */
        const val INDEX_NIGHT_DIALOG = 1

        /** Индекс русского языка в окне */
        const val INDEX_RUSSIAN_DIALOG = 0

        /** Индекс английского языка в окне */
        const val INDEX_ENGLISH_DIALOG = 1
    }

    /** Ресурс темы установленной на данный момент в приложении */
    private var themeValue = gateway.getThemeModeAppNow().themeValue

    /** Индекс выбранного языка */
    private var chooseLanguageIndex = initIndexLanguage()

    private fun initIndexLanguage(): Int {
        return when (gateway.getAppLanguage()) {
            Language.RU -> INDEX_RUSSIAN_DIALOG
            Language.EN -> INDEX_ENGLISH_DIALOG
        }
    }

    override fun getThemeNow() = gateway.getThemeModeAppNow()

    override fun onLight() {
        themeValue = R.style.AppThemeDay
        gateway.saveChooseTheme(themeValue)
    }

    override fun onNight() {
        themeValue = R.style.AppThemeNight
        gateway.saveChooseTheme(themeValue)
    }

    override fun getThemeValue() = when (themeValue) {
        R.style.AppThemeNight -> INDEX_NIGHT_DIALOG
        else -> INDEX_LIGHT_DIALOG
    }

    override fun getAppLanguage() = gateway.getAppLanguage()

    override fun getTheme() = themeValue

    override fun getSelectLanguage() = gateway.getSelectLanguage()

    override fun chooseLanguage(itemIndex: Int) {
        chooseLanguageIndex = itemIndex
        when (itemIndex) {
            INDEX_CHOOSE_RU -> gateway.chooseLanguage(Language.RU)
            INDEX_CHOOSE_EN -> gateway.chooseLanguage(Language.EN)
        }
    }

    override fun getChooseLanguageIndex() = chooseLanguageIndex

    override fun getSortType() = gateway.getSortType()

    override fun setChooseSort(sortName: SortType) = gateway.setChooseSort(sortName)
}