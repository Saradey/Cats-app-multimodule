package com.evgeny.goncharov.settings.interactor

import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.settings.R
import com.evgeny.goncharov.settings.repository.SettingsRepository
import com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp.Companion.INDEX_CHOOSE_EN
import com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp.Companion.INDEX_CHOOSE_RU
import javax.inject.Inject

/**
 * Реализация бизнес логики экрана настроек
 * @property repository источник данных для экрана настроек
 */
class SettingsInteractorImpl @Inject constructor(
    private val repository: SettingsRepository
) : SettingsInteractor {

    /** Ресурс темы установленной на данный момент в приложении */
    private var themeValue = repository.getThemeModeAppNow().themeValue

    /** Индекс выбранного языка */
    private var chooseLanguageIndex = initIndexLanguage()

    private fun initIndexLanguage(): Int {
        return when (repository.getAppLanguage()) {
            Language.RU -> INDEX_RUSSIAN_DIALOG
            Language.EN -> INDEX_ENGLISH_DIALOG
        }
    }

    override fun getThemeNow() = repository.getThemeModeAppNow()

    override fun onLight() {
        themeValue = R.style.AppThemeDay
        repository.saveChooseTheme(themeValue)
    }

    override fun onNight() {
        themeValue = R.style.AppThemeNight
        repository.saveChooseTheme(themeValue)
    }

    override fun getThemeValue() = when (themeValue) {
        R.style.AppThemeNight -> INDEX_NIGHT_DIALOG
        else -> INDEX_LIGHT_DIALOG
    }

    override fun getAppLanguage() = repository.getAppLanguage()

    override fun getTheme() = themeValue

    override fun getSelectLanguage() = repository.getSelectLanguage()

    override fun chosenLanguage(itemIndex: Int) {
        chooseLanguageIndex = itemIndex
        when (itemIndex) {
            INDEX_CHOOSE_RU -> repository.chooseLanguage(Language.RU)
            INDEX_CHOOSE_EN -> repository.chooseLanguage(Language.EN)
        }
    }

    override fun getChooseLanguageIndex() = chooseLanguageIndex

    override fun getSortType() = repository.getSortType()

    override fun setChooseSort(sortName: SortType) = repository.setChooseSort(sortName)

    override fun initNotification() = repository.getStatusNotification()

    override fun chosenNotification(item: Int) {
        when (item) {
            INDEX_NOTIFICATION_ON -> repository.chosenNotification(true)
            INDEX_NOTIFICATION_OFF -> repository.chosenNotification(false)
        }
    }

    companion object {

        /** Индекс светлой темы в окне */
        const val INDEX_LIGHT_DIALOG = 0

        /** Индекс темной темы в окне */
        const val INDEX_NIGHT_DIALOG = 1

        /** Индекс русского языка в окне */
        const val INDEX_RUSSIAN_DIALOG = 0

        /** Индекс английского языка в окне */
        const val INDEX_ENGLISH_DIALOG = 1

        /** Индекс нотифкации: включено */
        const val INDEX_NOTIFICATION_ON = 0

        /** Индекс нотифкации: выключено */
        const val INDEX_NOTIFICATION_OFF = 1
    }
}