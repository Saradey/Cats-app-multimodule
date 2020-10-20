package com.evgeny.goncharov.coreapi.managers

import com.evgeny.goncharov.coreapi.utils.Language
import java.util.Locale

/**
 * Контракт отвечающий за тип языка в приложении
 */
interface LanguageManager {

    /**
     * Получить язык приложения в формате ru-en и тд
     */
    fun getAppLanguage(): String

    /**
     * Получить язык приложения в формате enum
     */
    fun getAppLanguageEnum(): Language

    /**
     * Обновить язык приложения
     */
    fun chooseLanguage(langCode: String)

    /**
     * Получить Locale с значением Language
     */
    fun getUserSelectedLanguageBlocking(): Locale
}