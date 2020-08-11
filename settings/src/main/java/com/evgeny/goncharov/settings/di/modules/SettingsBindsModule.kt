package com.evgeny.goncharov.settings.di.modules

import com.evgeny.goncharov.settings.gateway.SettingsGateway
import com.evgeny.goncharov.settings.gateway.SettingsGatewayImpl
import com.evgeny.goncharov.settings.interactor.SettingsInteractor
import com.evgeny.goncharov.settings.interactor.SettingsInteractorImpl
import dagger.Binds
import dagger.Module

@Module
interface SettingsBindsModule {

    @Binds
    fun bindSettingsInteractor(interactor: SettingsInteractorImpl): SettingsInteractor

    @Binds
    fun bindSettingsGateway(gateway: SettingsGatewayImpl): SettingsGateway
}