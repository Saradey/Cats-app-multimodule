package com.evgeny.goncharov.coreimpl.mangers.di

import com.evgeny.goncharov.coreapi.managers.*
import com.evgeny.goncharov.coreapi.scope.AppScope
import com.evgeny.goncharov.coreimpl.mangers.*
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

    @Binds
    @AppScope
    fun NetworkManagerImpl.bindNetworkManager() : NetworkManager

    @Binds
    @AppScope
    fun AnalyticsManagerImpl.bindAnalyticsManager() : AnalyticsManager
}