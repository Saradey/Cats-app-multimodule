package com.evgeny.goncharov.coreapi.providers

import android.content.Context
import com.evgeny.goncharov.coreapi.qualifier.AppContext

/**
 * Контракт провайдер, провайдит конфиг и контекст
 */
interface ContextProvider {

    @AppContext
    fun provideContext(): Context

    fun provideBuildVariants(): Boolean
}