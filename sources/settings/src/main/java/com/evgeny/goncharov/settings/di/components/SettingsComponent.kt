package com.evgeny.goncharov.settings.di.components

import com.evgeny.goncharov.coreapi.providers.ManagerProvider
import com.evgeny.goncharov.settings.di.modules.SettingsBindsModule
import com.evgeny.goncharov.settings.di.modules.SettingsProvidesModule
import com.evgeny.goncharov.settings.ui.DialogChooseLanguageApp
import com.evgeny.goncharov.settings.ui.DialogChooseThemeApp
import com.evgeny.goncharov.settings.ui.SettingsFragment
import com.evgeny.goncharov.settings.view.model.SettingsViewModelImpl
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ManagerProvider::class],
    modules = [SettingsBindsModule::class, SettingsProvidesModule::class]
)
interface SettingsComponent {

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

    fun inject(fragment: SettingsFragment)

    fun inject(viewModel: SettingsViewModelImpl)

    fun inject(viewModel: DialogChooseThemeApp)

    fun inject(viewModel: DialogChooseLanguageApp)
}