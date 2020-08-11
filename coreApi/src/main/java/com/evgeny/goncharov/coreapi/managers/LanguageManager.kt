package com.evgeny.goncharov.coreapi.managers

import com.evgeny.goncharov.coreapi.utils.Language
import java.util.Locale

interface LanguageManager {

    fun getAppLanguage(): String

    fun getAppLanguageEnum(): Language

    fun chooseLanguage(langCode: String)

    fun getUserSelectedLanguageBlocking(): Locale
}