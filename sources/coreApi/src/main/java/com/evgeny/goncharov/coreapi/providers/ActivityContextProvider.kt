package com.evgeny.goncharov.coreapi.providers

import android.content.Context
import com.evgeny.goncharov.coreapi.qualifier.ActivityContext

interface ActivityContextProvider {

    @ActivityContext
    fun provideActivityContext(): Context
}