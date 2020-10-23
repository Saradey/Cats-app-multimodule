package com.evgeny.goncharov.wallcats.di.modules

import androidx.fragment.app.FragmentManager
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
    fun provideCatDescriptionViewModel(fragmentManager: FragmentManager) =
        ViewModelProviders.of(
            fragmentManager.fragments.find {
                it is CatDescriptionFragment
            }!!
        ).get(CatDescriptionViewModel::class.java)
}