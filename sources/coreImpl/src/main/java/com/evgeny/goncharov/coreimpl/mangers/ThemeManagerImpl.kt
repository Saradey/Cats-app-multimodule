package com.evgeny.goncharov.coreimpl.mangers

import android.content.Context
import androidx.annotation.StyleRes
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreimpl.R
import javax.inject.Inject

class ThemeManagerImpl @Inject constructor(
    private val context: Context
) : ThemeManager {

    companion object {
        const val SHARED_THEME_PREFERENCES_NAME = "SHARED_THEME_PREFERENCES_NAME"
        const val MODE_NIGHT_NAME = "MODE_NIGHT_NAME"
        const val THEME_VALUE_DAY = "THEME_VALUE_DAY"
        const val THEME_VALUE_NIGHT = "THEME_VALUE_NIGHT"
    }

    override fun getThemeNow(): Int {
        val shared =
            context.getSharedPreferences(SHARED_THEME_PREFERENCES_NAME, Context.MODE_PRIVATE)
        return when (shared.getString(MODE_NIGHT_NAME, THEME_VALUE_DAY)) {
            THEME_VALUE_DAY -> R.style.AppThemeDay
            else -> R.style.AppThemeNight
        }
    }

    override fun setThemeNow(@StyleRes themeId: Int) {
        val shared =
            context.getSharedPreferences(SHARED_THEME_PREFERENCES_NAME, Context.MODE_PRIVATE)
        val themeValue = when (themeId) {
            R.style.AppThemeDay -> THEME_VALUE_DAY
            R.style.AppThemeNight -> THEME_VALUE_NIGHT
            else -> THEME_VALUE_DAY
        }
        val edit = shared.edit()
        edit.putString(MODE_NIGHT_NAME, themeValue)
        edit.apply()
    }
}