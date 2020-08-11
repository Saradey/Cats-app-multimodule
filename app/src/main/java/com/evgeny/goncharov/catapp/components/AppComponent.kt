package com.evgeny.goncharov.catapp.components

import android.app.Application
import android.content.Context
import com.evgeny.goncharov.catapp.modules.ConfigModule
import com.evgeny.goncharov.coreapi.providers.ContextProvider
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ConfigModule::class])
interface AppComponent : ContextProvider {

    companion object {
        private var appComponent: AppComponent? = null

        fun getLazy(app: Application? = null): AppComponent {
            return appComponent
                ?: DaggerAppComponent.factory()
                    .plus(app?.applicationContext!!)
                    .apply {
                        appComponent = this
                    }
        }
    }

    @Component.Factory
    interface Factory {

        fun plus(
            @BindsInstance appContext: Context
        ): AppComponent
    }
}