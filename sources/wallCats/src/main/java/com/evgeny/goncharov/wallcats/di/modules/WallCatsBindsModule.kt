package com.evgeny.goncharov.wallcats.di.modules

import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.wallcats.gateways.WallCatGateway
import com.evgeny.goncharov.wallcats.gateways.WallCatGatewayImpl
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractor
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractorImpl
import com.evgeny.goncharov.wallcats.managers.WorkScheduleManager
import com.evgeny.goncharov.wallcats.managers.WorkScheduleManagerImpl
import dagger.Binds
import dagger.Module

/**
 * Бинд модуль который создает слой бизнес логики и слой источника данных для экрана стены котов
 */
@Module
interface WallCatsBindsModule {

    @Binds
    @FragmentScope
    fun WallCatInteractorImpl.bindWallCatInteractor(): WallCatInteractor

    @Binds
    @FragmentScope
    fun WallCatGatewayImpl.bindWallCatGateway(): WallCatGateway

    @Binds
    fun WorkScheduleManagerImpl.bindWorkScheduleManager(): WorkScheduleManager
}