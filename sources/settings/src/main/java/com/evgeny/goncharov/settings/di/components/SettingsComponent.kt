package com.evgeny.goncharov.settings.di.components

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
    dependencies = [ManagerProvider::class],
    modules = [SettingsBindsModule::class, SettingsProvidesModule::class]
)
interface SettingsComponent : SettingsProvides {

    companion object {

        var component: SettingsComponent? = null

        fun init(fragment: SettingsFragment, provider: ManagerProvider): SettingsComponent {
            return DaggerSettingsComponent.factory()
                .plus(fragment, provider)
                .apply {
                    component = this
                }
        }
    }

    @Component.Factory
    interface Factory {

        fun plus(
            @BindsInstance fragment: SettingsFragment,
            provider: ManagerProvider
        ): SettingsComponent
    }
}