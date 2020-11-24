package com.evgeny.goncharov.coreapi.providers

import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.NotificationAppManager
import com.evgeny.goncharov.coreapi.managers.SortCatsManager
import com.evgeny.goncharov.coreapi.managers.ThemeManager

/**
 * Контракт который провайдит менеджеры
 */
interface ManagerProvider {

    /**
     * Провайдит менеджера языка приложения
     */
    fun provideLanguageManager(): LanguageManager

    /**
     * Провайдит менеджера темы
     */
    fun provideThemeManager(): ThemeManager

    /**
     * Провайдит менеджер сортировки котов
     */
    fun provideSortCatsManager() : SortCatsManager

    /**
     * Провайд менеджера отвечающего за нотификации в приложении
     */
    fun provideNotificationManager() : NotificationAppManager
}