package com.evgeny.goncharov.catapp.modules

import IS_DEBUG
import com.evgeny.goncharov.coreapi.scope.AppScope
import dagger.Module
import dagger.Provides

@Module
object ConfigModule {

    @JvmStatic
    @Provides
    @AppScope
    fun provideBuildVariantsType(): Boolean = IS_DEBUG
}