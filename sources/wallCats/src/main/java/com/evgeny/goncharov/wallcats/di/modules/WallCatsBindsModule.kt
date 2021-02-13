package com.evgeny.goncharov.wallcats.di.modules

import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractor
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractorImpl
import com.evgeny.goncharov.wallcats.managers.NavigationWallCatsManager
import com.evgeny.goncharov.wallcats.managers.NavigationWallCatsManagerImpl
import com.evgeny.goncharov.wallcats.managers.WorkScheduleManager
import com.evgeny.goncharov.wallcats.managers.WorkScheduleManagerImpl
import com.evgeny.goncharov.wallcats.repository.WallCatRepository
import com.evgeny.goncharov.wallcats.repository.WallCatRepositoryImpl
import com.evgeny.goncharov.wallcats.services.ServiceBreeds
import com.evgeny.goncharov.wallcats.services.ServiceBreedsImpl
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
    fun WallCatRepositoryImpl.bindWallCatRepository(): WallCatRepository

    @Binds
    fun WorkScheduleManagerImpl.bindWorkScheduleManager(): WorkScheduleManager

    @Binds
    @FragmentScope
    fun NavigationWallCatsManagerImpl.bindNavigationWallCatsManager(): NavigationWallCatsManager

    @Binds
    fun ServiceBreedsImpl.bindServiceBreeds(): ServiceBreeds
}