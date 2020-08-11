package com.evgeny.goncharov.wallcats.di.modules

import androidx.lifecycle.ViewModelProviders
import com.evgeny.goncharov.wallcats.ui.CatDescriptionFragment
import com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel
import com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModelImpl
import dagger.Module
import dagger.Provides

@Module
object CatDescriptionProvidesModule {

    @Provides
    @JvmStatic
    fun provideCatDescriptionViewModel(fragment: CatDescriptionFragment): CatDescriptionViewModel =
        ViewModelProviders.of(fragment).get(CatDescriptionViewModelImpl::class.java)
}