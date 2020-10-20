package com.evgeny.goncharov.coreapi.providers

import android.content.Context

/**
 * Контракт провайдер, провайдит конфиг и контекст
 */
interface ContextProvider {

    fun provideContext(): Context

    fun provideBuildVariants(): Boolean
}