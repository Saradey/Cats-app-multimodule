package com.evgeny.goncharov.coreapi.providers

import android.content.Context

interface ContextProvider {

    fun provideContext(): Context

    fun provideBuildVariants(): Boolean
}