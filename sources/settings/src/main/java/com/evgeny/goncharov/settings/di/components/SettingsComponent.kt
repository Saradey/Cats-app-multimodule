package com.evgeny.goncharov.settings.di.components

import com.evgeny.goncharov.coreapi.providers.ActivityContextProvider
import com.evgeny.goncharov.coreapi.providers.ManagerProvider
import com.evgeny.goncharov.coreapi.scope.FragmentScope
import com.evgeny.goncharov.settings.di.modules.SettingsBindsModule
import com.evgeny.goncharov.settings.di.modules.SettingsProvidesModule
import com.evgeny.goncharov.settings.di.provides.SettingsProvides
import com.evgeny.goncharov.settings.ui.SettingsFragment
import dagger.BindsInstance
import dagger.Component

/**
 * Компонент для экрана настроек
 */
@FragmentScope
@Component(
    dependencies = [ManagerProvider::class, ActivityContextProvider::class],
    modules = [SettingsBindsModule::class, SettingsProvidesModule::class]
)
interface SettingsComponent : SettingsProvides {

    companion object {

        var component: SettingsComponent? = null

        fun init(
            fragment: SettingsFragment,
            managerProvider: ManagerProvider,
            androidComponentProvider: ActivityContextProvider
        ): SettingsComponent {
            return DaggerSettingsComponent.factory()
                .plus(fragment, managerProvider, androidComponentProvider)
                .apply {
                    component = this
                }
        }
    }

    @Component.Factory
    interface Factory {

        fun plus(
            @BindsInstance fragment: SettingsFragment,
            provider: ManagerProvider,
            providerAndroidComponent: ActivityContextProvider
        ): SettingsComponent
    }
}