package com.evgeny.goncharov.wallcats.di.modules

import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.wallcats.repository.WallCatRepository
import com.evgeny.goncharov.wallcats.repository.WallCatRepositoryImpl
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
    fun WallCatRepositoryImpl.bindWallCatGateway(): WallCatRepository

    @Binds
    fun WorkScheduleManagerImpl.bindWorkScheduleManager(): WorkScheduleManager
}