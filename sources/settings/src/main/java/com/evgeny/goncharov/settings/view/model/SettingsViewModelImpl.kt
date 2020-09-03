package com.evgeny.goncharov.settings.view.model

import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.settings.events.SettingUiEvents
import com.evgeny.goncharov.settings.models.ThemeModel
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.settings.di.components.SettingsComponent
import com.evgeny.goncharov.settings.interactor.SettingsInteractor
import com.evgeny.goncharov.settings.interactor.SettingsInteractorImpl
import javax.inject.Inject

class SettingsViewModelImpl : ViewModel(), SettingsViewModel {

    @Inject
    lateinit var interactor: SettingsInteractor

    private val themeLiveDataModel = SingleLiveEvent<ThemeModel>()
    private val languageLiveData = SingleLiveEvent<Language>()
    private val uiLiveDataEvent = SingleLiveEvent<SettingUiEvents>()

    override fun initInjection() {
        SettingsComponent.component?.inject(this)
    }

    override fun getThemeLiveData() = themeLiveDataModel

    override fun initThemeToView() {
        val theme = interactor.getThemeNow()
        themeLiveDataModel.value = theme
    }

    override fun getThemeValue() = interactor.getThemeValue()

    override fun setChooseThemeIndex(item: Int) {
        when (item) {
            SettingsInteractorImpl.INDEX_NIGHT_DIALOG -> interactor.onNight()
            else -> interactor.onLight()
        }
    }

    override fun getLanguageLiveData() = languageLiveData

    override fun initLanguageToView() {
        val lan = interactor.getAppLanguage()
        languageLiveData.value = lan
    }

    override fun getUiEvents() = uiLiveDataEvent

    override fun getThemeNow() = interactor.getTheme()

    override fun getSelectLanguage() = interactor.getSelectLanguage()

    override fun chooseLanguage(itemIndex: Int) {
        if (interactor.getChooseLanguageIndex() != itemIndex) {
            interactor.chooseLanguage(itemIndex)
            uiLiveDataEvent.value = SettingUiEvents.ChooseLanguageApp
        }
    }
}