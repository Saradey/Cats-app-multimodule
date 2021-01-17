package com.evgeny.goncharov.wallcats.di.modules

import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.wallcats.repository.CatDescriptionRepository
import com.evgeny.goncharov.wallcats.repository.CatDescriptionRepositoryImpl
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractorImpl
import dagger.Binds
import dagger.Module

/**
 * Бинд модуль для создания слоя бизнес логики и слоя источника данных на экране описание кота
 */
@Module
interface CatDescriptionBindsModule {

    @Binds
    @FragmentScope
    fun bindCatDescriptionInteractor(interactor: CatDescriptionInteractorImpl): CatDescriptionInteractor

    @Binds
    @FragmentScope
    fun bindCatDescriptionGateway(gateway: CatDescriptionRepositoryImpl): CatDescriptionRepository
}