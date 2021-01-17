package com.evgeny.goncharov.coreapi.providers

import android.content.Context
import com.evgeny.goncharov.coreapi.qualifier.AppContext

/**
 * Контракт провайдер, провайдит конфиг и контекст
 */
interface AppContextProvider {

    /**
     * Провайдим контекст аппа
     */
    @AppContext
    fun provideContext(): Context

    /**
     * Возвращает значение: true запущена debug сборка, false запущена релиз сборка
     */
    fun provideBuildVariants(): Boolean
}