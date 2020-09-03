package com.evgeny.goncharov.searchcats.di.modules

import androidx.lifecycle.ViewModelProviders
import com.evgeny.goncharov.searchcats.ui.SearchCatFragment
import com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel
import dagger.Module
import dagger.Provides

@Module
object SearchCatProvidesModule {

    @Provides
    @JvmStatic
    fun provideSearchCatViewModel(fragment: SearchCatFragment) =
        ViewModelProviders.of(fragment).get(SearchCatViewModel::class.java)
}