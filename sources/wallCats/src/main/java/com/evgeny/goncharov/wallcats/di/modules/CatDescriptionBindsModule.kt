package com.evgeny.goncharov.wallcats.di.modules

import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.wallcats.gateways.CatDescriptionGateway
import com.evgeny.goncharov.wallcats.gateways.CatDescriptionGatewayImpl
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractorImpl
import dagger.Binds
import dagger.Module

@Module
interface CatDescriptionBindsModule {

    @Binds
    @FragmentScope
    fun bindCatDescriptionInteractor(interactor: CatDescriptionInteractorImpl): CatDescriptionInteractor

    @Binds
    @FragmentScope
    fun bindCatDescriptionGateway(gateway: CatDescriptionGatewayImpl): CatDescriptionGateway
}