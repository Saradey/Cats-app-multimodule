package com.evgeny.goncharov.settings.events

sealed class SettingUiEvents {

    object ChooseLanguageApp : SettingUiEvents()

    object ChooseThemeApp : SettingUiEvents()
}