package com.evgeny.goncharov.settings.events

/**
 * Ui эвенты для экрана настроек
 */
sealed class SettingUiEvents {

    /** Событие, мы сменили язык */
    object ChooseLanguageApp : SettingUiEvents()

    /** Событие, мы сменили тему */
    object ChooseThemeApp : SettingUiEvents()
}