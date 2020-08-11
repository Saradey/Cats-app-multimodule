package com.evgeny.goncharov.catapp

import android.app.Application
import com.evgeny.goncharov.catapp.components.FacadeComponent
import com.evgeny.goncharov.coreapi.WithFacade
import com.evgeny.goncharov.coreapi.providers.ProviderFacade

class App : Application(), WithFacade {

    companion object {
        private var facadeComponent: FacadeComponent? = null
    }

    override fun onCreate() {
        super.onCreate()
        getFacade()
    }

    override fun getFacade(): ProviderFacade {
        return facadeComponent ?: FacadeComponent.init(this)
    }
}