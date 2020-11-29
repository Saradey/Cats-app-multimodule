package com.evgeny.goncharov.wallcats.di.provides

import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor

interface CatDescriptionProvider {

    fun provideDescriptionInteractor(): CatDescriptionInteractor
}