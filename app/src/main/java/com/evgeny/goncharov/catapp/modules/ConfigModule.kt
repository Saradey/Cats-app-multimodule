package com.evgeny.goncharov.catapp.modules

import IS_DEV
import android.content.Context
import com.evgeny.goncharov.coreapi.qualifier.AppContext
import com.evgeny.goncharov.coreapi.scope.AppScope
import dagger.Module
import dagger.Provides

/**
 * Для провайда зависимости из билд варианта
 */
@Module
object ConfigModule {

    @JvmStatic
    @Provides
    @AppScope
    fun provideBuildVariantsType(): Boolean = IS_DEV

    @JvmStatic
    @Provides
    @AppScope
    @AppContext
    fun provideAppContext(context: Context) = context
}