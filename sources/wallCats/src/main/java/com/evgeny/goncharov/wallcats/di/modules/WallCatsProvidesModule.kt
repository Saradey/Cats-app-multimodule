package com.evgeny.goncharov.wallcats.di.modules

import android.content.Context
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import com.evgeny.goncharov.coreapi.qualifier.ActivityContext
import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.domain.SortTypeViewModel
import com.evgeny.goncharov.wallcats.rest.ApiBreeds
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
    fun provideApiBreeds(retrofit: Retrofit):
            ApiBreeds = retrofit.create(ApiBreeds::class.java)

    @Provides
    @JvmStatic
    fun provideSortViewModel(@ActivityContext contextActivity: Context) =
        ViewModelProviders.of(contextActivity as FragmentActivity).get(SortTypeViewModel::class.java)
}