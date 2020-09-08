package com.evgeny.goncharov.coreapi.base

import androidx.fragment.app.DialogFragment
import com.evgeny.goncharov.coreapi.R
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import javax.inject.Inject

abstract class BaseFragmentDialog : DialogFragment() {

    @Inject
    lateinit var themeManager: ThemeManager

    fun getDialogTheme() = when (themeManager.getThemeNow()) {
        R.style.AppThemeNight -> R.style.Costume_ThemeMaterialAlertDialog_Dark
        else -> R.style.Costume_ThemeMaterialAlertDialog_Light
    }
}