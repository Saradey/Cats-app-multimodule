package com.evgeny.goncharov.coreapi.managers

interface ThemeManager {

    fun getThemeModeAppNow(): Int

    fun setThemeMode(modeNight: Int)
}