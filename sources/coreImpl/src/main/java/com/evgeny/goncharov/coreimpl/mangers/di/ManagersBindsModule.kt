package com.evgeny.goncharov.coreimpl.mangers.di

import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.NotificationAppManager
import com.evgeny.goncharov.coreapi.managers.SortCatsManager
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreapi.scope.AppScope
import com.evgeny.goncharov.coreimpl.mangers.LanguageManagerImpl
import com.evgeny.goncharov.coreimpl.mangers.NotificationAppManagerImpl
import com.evgeny.goncharov.coreimpl.mangers.SortCatsTypeManagerImpl
import com.evgeny.goncharov.coreimpl.mangers.ThemeManagerImpl
import dagger.Binds
import dagger.Module

/**
 * Модуль для бинда менеджеров в проекте
 */
@Module
interface ManagersBindsModule {

    @Binds
    @AppScope
    fun LanguageManagerImpl.bindLanguageManager(): LanguageManager

    @Binds
    @AppScope
    fun ThemeManagerImpl.bindThemeManager(): ThemeManager

    @Binds
    @AppScope
    fun SortCatsTypeManagerImpl.bindSortCatsManager(): SortCatsManager

    @Binds
    @AppScope
    fun NotificationAppManagerImpl.bindNotificationManager(): NotificationAppManager
}