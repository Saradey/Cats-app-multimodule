package com.evgeny.goncharov.wallcats.di.modules

import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.wallcats.gateways.WallCatGateway
import com.evgeny.goncharov.wallcats.gateways.WallCatGatewayImpl
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractor
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractorImpl
import dagger.Binds
import dagger.Module

/**
 * Бинд модуль который создает слой бизнес логики и слой источника данных для экрана стены котов
 */
@Module
interface WallCatsBindsModule {

    @Binds
    @FragmentScope
    fun bindWallCatInteractor(interactor: WallCatInteractorImpl): WallCatInteractor

    @Binds
    @FragmentScope
    fun bindWallCatGateway(gateway: WallCatGatewayImpl): WallCatGateway
}