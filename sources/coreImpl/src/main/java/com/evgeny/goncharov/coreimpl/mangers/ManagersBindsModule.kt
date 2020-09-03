package com.evgeny.goncharov.coreimpl.mangers

import com.evgeny.goncharov.coreapi.managers.LanguageManager
import com.evgeny.goncharov.coreapi.managers.ThemeManager
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