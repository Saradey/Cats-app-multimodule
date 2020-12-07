package com.evgeny.goncharov.coreapi.providers

import android.content.Context
import com.evgeny.goncharov.coreapi.qualifier.ActivityContext

/**
 * Контракт провайда контекста activity
 */
interface ActivityContextProvider {

    /**
     * Провайдим контекст активити
     */
    @ActivityContext
    fun provideActivityContext(): Context
}