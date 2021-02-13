package com.evgeny.goncharov.searchcats.di.modules

import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractorImpl
import com.evgeny.goncharov.searchcats.repository.SearchCatRepository
import com.evgeny.goncharov.searchcats.repository.SearchCatRepositoryImpl
import dagger.Binds
import dagger.Module

/**
 * Биндинг интерактора и источника данных на экран поиска котов
 */
@Module
interface SearchCatBindsModule {

    @Binds
    @FragmentScope
    fun bindSearchCatInteractor(interactor: SearchCatInteractorImpl): SearchCatInteractor

    @Binds
    @FragmentScope
    fun bindSearchCatRepository(repository: SearchCatRepositoryImpl): SearchCatRepository
}