package com.evgeny.goncharov.searchcats.di.modules

import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.searchcats.gateway.SearchCatGateway
import com.evgeny.goncharov.searchcats.gateway.SearchCatGatewayImpl
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractorImpl
import dagger.Binds
import dagger.Module

@Module
interface SearchCatBindsModule {

    @Binds
    @FragmentScope
    fun bindSearchCatInteractor(interactor: SearchCatInteractorImpl): SearchCatInteractor

    @Binds
    @FragmentScope
    fun bindSearchCatGateway(gateway: SearchCatGatewayImpl): SearchCatGateway
}