package com.evgeny.goncharov.settings.di.modules

import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.settings.gateway.SettingsGateway
import com.evgeny.goncharov.settings.gateway.SettingsGatewayImpl
import com.evgeny.goncharov.settings.interactor.SettingsInteractor
import com.evgeny.goncharov.settings.interactor.SettingsInteractorImpl
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
    fun bindSettingsGateway(gateway: SettingsGatewayImpl): SettingsGateway
}