package com.evgeny.goncharov.coreapi.managers

import androidx.annotation.StyleRes

/**
 * Контракт Менеджера отвечающего за тему в приложении
 */
interface ThemeManager {

    /**
     * Получить Id русурс темы которая на данный момент в приложении
     * @return
     */
    fun getThemeNow(): Int

    /**
     * Обновить тему приложения
     * @param themeId тема
     */
    fun setThemeNow(@StyleRes themeId: Int)
}