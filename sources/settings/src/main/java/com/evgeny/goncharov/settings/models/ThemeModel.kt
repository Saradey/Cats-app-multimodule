package com.evgeny.goncharov.settings.models

import androidx.annotation.StyleRes

/**
 * Модель которая содержит ресурс темы
 * @property themeValue
 */
data class ThemeModel(
    @StyleRes val themeValue: Int
)