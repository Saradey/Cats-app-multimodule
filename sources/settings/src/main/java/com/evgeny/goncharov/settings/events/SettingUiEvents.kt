package com.evgeny.goncharov.settings.events

/**
 * Ui эвенты для экрана настроек
 */
sealed class SettingUiEvents {

    /** Событие оповещающие о том что нужно пересоздать активити */
    object RecreateActivity : SettingUiEvents()
}