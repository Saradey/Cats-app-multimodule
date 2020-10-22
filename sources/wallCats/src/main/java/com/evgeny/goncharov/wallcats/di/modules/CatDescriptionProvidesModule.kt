package com.evgeny.goncharov.wallcats.di.modules

import androidx.lifecycle.ViewModelProviders
import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.wallcats.ui.CatDescriptionFragment
import com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel
import dagger.Module
import dagger.Provides

/**
 * Модуль который провайдит вьюмодель на экран описание кота
 */
@Module
object CatDescriptionProvidesModule {

    @Provides
    @JvmStatic
    @FragmentScope
    fun provideCatDescriptionViewModel(fragment: CatDescriptionFragment) =
        ViewModelProviders.of(fragment).get(CatDescriptionViewModel::class.java)
}