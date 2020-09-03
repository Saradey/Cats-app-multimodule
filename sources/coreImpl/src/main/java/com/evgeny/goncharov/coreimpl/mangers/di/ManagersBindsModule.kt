package com.evgeny.goncharov.coreimpl.mangers.di

import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreimpl.mangers.LanguageManagerImpl
import com.evgeny.goncharov.coreimpl.mangers.ThemeManagerImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface ManagersBindsModule {

    @Binds
    @Singleton
    fun bindLanguageManager(manager: LanguageManagerImpl): LanguageManager

    @Binds
    @Singleton
    fun bindThemeManager(manager: ThemeManagerImpl): ThemeManager
}