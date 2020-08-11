package com.evgeny.goncharov.settings.interactor

import androidx.appcompat.app.AppCompatDelegate
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.settings.gateway.SettingsGateway
import com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp.Companion.INDEX_CHOOSE_EN
import com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp.Companion.INDEX_CHOOSE_RU
import javax.inject.Inject

class SettingsInteractorImpl @Inject constructor(
    private val gateway: SettingsGateway
) : SettingsInteractor {

    companion object {
        const val INDEX_LIGHT_DIALOG = 0
        const val INDEX_NIGHT_DIALOG = 1

        const val INDEX_RUSSIAN_DIALOG = 0
        const val INDEX_ENGLISH_DIALOG = 1
    }

    private var themeValue = gateway.getThemeModeAppNow().themeValue
    private var chooseLanguageIndex = initIndexLanguage()

    private fun initIndexLanguage(): Int {
        return when (gateway.getAppLanguage()) {
            Language.RU -> INDEX_RUSSIAN_DIALOG
            Language.EN -> INDEX_ENGLISH_DIALOG
        }
    }

    override fun getThemeNow() = gateway.getThemeModeAppNow()

    override fun onLight() {
        themeValue = AppCompatDelegate.MODE_NIGHT_NO
        gateway.saveChooseTheme(themeValue)
    }

    override fun onNight() {
        themeValue = AppCompatDelegate.MODE_NIGHT_YES
        gateway.saveChooseTheme(themeValue)
    }

    override fun getThemeValue() = when (themeValue) {
        AppCompatDelegate.MODE_NIGHT_YES -> INDEX_NIGHT_DIALOG
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
}