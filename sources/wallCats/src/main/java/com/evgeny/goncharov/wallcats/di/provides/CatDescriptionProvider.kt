package com.evgeny.goncharov.wallcats.di.provides

import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor
import com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel

interface CatDescriptionProvider {

    fun provideCatDescriptionViewModel(): CatDescriptionViewModel

    fun provideDescriptionInteractor(): CatDescriptionInteractor
}