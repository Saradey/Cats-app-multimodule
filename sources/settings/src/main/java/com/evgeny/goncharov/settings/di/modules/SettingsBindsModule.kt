package com.evgeny.goncharov.settings.di.modules

import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.settings.interactor.SettingsInteractor
import com.evgeny.goncharov.settings.interactor.SettingsInteractorImpl
import com.evgeny.goncharov.settings.repository.SettingsRepository
import com.evgeny.goncharov.settings.repository.SettingsRepositoryImpl
import dagger.Binds
import dagger.Module

/**
 * Бинд модуль для создания слоя бизнес логики и источника данных на экране настроек
 */
@Module
interface SettingsBindsModule {

    @Binds
    @FragmentScope
    fun bindSettingsInteractor(interactor: SettingsInteractorImpl): SettingsInteractor

    @Binds
    @FragmentScope
    fun bindSettingsRepository(repository: SettingsRepositoryImpl): SettingsRepository
}