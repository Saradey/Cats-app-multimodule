package com.evgeny.goncharov.catapp

import android.app.Application
import com.evgeny.goncharov.catapp.components.FacadeComponent
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.providers.ProviderFacade

/**
 * Стартовая точка приложения, WithFacade получить основной компонент
 */
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