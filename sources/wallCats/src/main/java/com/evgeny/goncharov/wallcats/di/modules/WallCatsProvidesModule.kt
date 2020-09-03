package com.evgeny.goncharov.wallcats.di.modules

import androidx.lifecycle.ViewModelProviders
import com.evgeny.goncharov.wallcats.rest.ApiBreeds
import com.evgeny.goncharov.wallcats.ui.WallCatsFragment
import com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
object WallCatsProvidesModule {

    @Provides
    @JvmStatic
    fun provideWallCatsViewModel(fragment: WallCatsFragment) =
        ViewModelProviders.of(fragment).get(WallCatsViewModel::class.java)

    @Provides
    @JvmStatic
    fun provideApiBreeds(retrofit: Retrofit):
            ApiBreeds = retrofit.create(ApiBreeds::class.java)
}