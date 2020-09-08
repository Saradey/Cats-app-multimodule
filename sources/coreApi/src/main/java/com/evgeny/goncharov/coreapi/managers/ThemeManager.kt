package com.evgeny.goncharov.coreapi.managers

import androidx.annotation.StyleRes

interface ThemeManager {

    fun getThemeNow(): Int

    fun setThemeNow(@StyleRes themeId: Int)
}