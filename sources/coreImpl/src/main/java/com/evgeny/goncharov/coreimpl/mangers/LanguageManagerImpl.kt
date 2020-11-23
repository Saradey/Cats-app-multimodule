package com.evgeny.goncharov.coreimpl.mangers

import android.content.Context
import com.evgeny.goncharov.coreapi.RU_CODE
import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.qualifier.AppContext
import com.evgeny.goncharov.coreapi.utils.Language
import java.util.Locale
import javax.inject.Inject

/**
 * Бизнес логика менеджера отвечающего за язык в приложении
 * @property context ссылка на application
 */
class LanguageManagerImpl @Inject constructor(
    @AppContext private val context: Context
) : LanguageManager {

    companion object {

        /** Шарада которая хранит значение языка */
        private const val LANGUAGE_SHARED_PREF_CODE = "LANGUAGE_SHARED_PREF_CODE"

        /** Значение по которому мы достаем язык */
        private const val LANGUAGE_VALUE_PREF_CODE = "LANGUAGE_VALUE_PREF_CODE"
    }

    override fun getAppLanguage(): String {
        val shared = context.getSharedPreferences(LANGUAGE_SHARED_PREF_CODE, Context.MODE_PRIVATE)
        return shared.getString(LANGUAGE_VALUE_PREF_CODE, RU_CODE) ?: RU_CODE
    }

    override fun getAppLanguageEnum() = when (getAppLanguage()) {
        RU_CODE -> Language.RU
        else -> Language.EN
    }

    override fun chooseLanguage(langCode: String) {
        val shared = context.getSharedPreferences(LANGUAGE_SHARED_PREF_CODE, Context.MODE_PRIVATE)
        val editor = shared.edit()
        editor.putString(LANGUAGE_VALUE_PREF_CODE, langCode)
        editor.apply()
    }

    override fun getUserSelectedLanguageBlocking() = Locale(getAppLanguage())
}