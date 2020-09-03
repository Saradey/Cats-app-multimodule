package com.evgeny.goncharov.coreimpl.mangers.di

import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreapi.scope.AppScope
import com.evgeny.goncharov.coreimpl.mangers.LanguageManagerImpl
import com.evgeny.goncharov.coreimpl.mangers.ThemeManagerImpl
import dagger.Binds
import dagger.Module

@Module
interface ManagersBindsModule {

    @Binds
    @AppScope
    fun bindLanguageManager(manager: LanguageManagerImpl): LanguageManager

    @Binds
    @AppScope
    fun bindThemeManager(manager: ThemeManagerImpl): ThemeManager
}