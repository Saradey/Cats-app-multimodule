package com.evgeny.goncharov.catapp.modules

import IS_DEBUG
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object ConfigModule {

    @JvmStatic
    @Provides
    @Singleton
    fun provideBuildVariantsType(): Boolean = IS_DEBUG
}