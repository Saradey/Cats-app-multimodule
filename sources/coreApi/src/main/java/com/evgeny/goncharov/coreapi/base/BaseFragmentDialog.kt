package com.evgeny.goncharov.coreapi.base

import androidx.fragment.app.DialogFragment
import com.evgeny.goncharov.coreapi.R
import com.evgeny.goncharov.coreapi.managers.ThemeManager

/**
 * Базовая реализация диалоговых окон, должен наследовать каждый диалоговый фрагмент
 */
abstract class BaseFragmentDialog : DialogFragment() {

    /** Менеджер тем */
    protected lateinit var themeManager: ThemeManager

    /**
     * Получить текущую тему
     */
    fun getDialogTheme() = when (themeManager.getThemeNow()) {
        R.style.AppThemeNight -> R.style.Costume_ThemeMaterialAlertDialog_Dark
        else -> R.style.Costume_ThemeMaterialAlertDialog_Light
    }
}