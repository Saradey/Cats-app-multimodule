package com.evgeny.goncharov.wallcats.di.modules

import com.evgeny.goncharov.wallcats.gateways.CatDescriptionGateway
import com.evgeny.goncharov.wallcats.gateways.CatDescriptionGatewayImpl
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractorImpl
import dagger.Binds
import dagger.Module

@Module
interface CatDescriptionBindsModule {

    @Binds
    fun bindCatDescriptionInteractor(interactor: CatDescriptionInteractorImpl): CatDescriptionInteractor

    @Binds
    fun bindCatDescriptionGateway(gateway: CatDescriptionGatewayImpl): CatDescriptionGateway
}