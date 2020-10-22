package com.evgeny.goncharov.wallcats.di.modules

import androidx.lifecycle.ViewModelProviders
import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.wallcats.rest.ApiBreeds
import com.evgeny.goncharov.wallcats.ui.WallCatsFragment
import com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Провайд модуль который провайдит вьюмодель и rest api для экрана стены котов
 */
@Module
object WallCatsProvidesModule {

    @Provides
    @JvmStatic
    @FragmentScope
    fun provideWallCatsViewModel(fragment: WallCatsFragment) =
        ViewModelProviders.of(fragment).get(WallCatsViewModel::class.java)

    @Provides
    @JvmStatic
    @FragmentScope
    fun provideApiBreeds(retrofit: Retrofit):
            ApiBreeds = retrofit.create(ApiBreeds::class.java)
}