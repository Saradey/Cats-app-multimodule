package com.evgeny.goncharov.settings.view.model

import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.settings.di.components.SettingsComponent
import com.evgeny.goncharov.settings.events.SettingUiEvents
import com.evgeny.goncharov.settings.interactor.SettingsInteractor
import com.evgeny.goncharov.settings.interactor.SettingsInteractorImpl
import com.evgeny.goncharov.settings.models.ThemeModel
import javax.inject.Inject

class SettingsViewModel : ViewModel() {

    @Inject
    lateinit var interactor: SettingsInteractor

    private val themeLiveDataModel = SingleLiveEvent<ThemeModel>()
    private val languageLiveData = SingleLiveEvent<Language>()
    private val uiLiveDataEvent = SingleLiveEvent<SettingUiEvents>()

    fun initInjection() {
        SettingsComponent.component?.inject(this)
    }

    fun getThemeLiveData() = themeLiveDataModel

    fun initThemeToView() {
        val theme = interactor.getThemeNow()
        themeLiveDataModel.value = theme
    }

    fun getThemeValue() = interactor.getThemeValue()

    fun setChooseThemeIndex(item: Int) {
        when (item) {
            SettingsInteractorImpl.INDEX_NIGHT_DIALOG -> interactor.onNight()
            else -> interactor.onLight()
        }
    }

    fun getLanguageLiveData() = languageLiveData

    fun initLanguageToView() {
        val lan = interactor.getAppLanguage()
        languageLiveData.value = lan
    }

    fun getUiEvents() = uiLiveDataEvent

    fun getThemeNow() = interactor.getTheme()

    fun getSelectLanguage() = interactor.getSelectLanguage()

    fun chooseLanguage(itemIndex: Int) {
        if (interactor.getChooseLanguageIndex() != itemIndex) {
            interactor.chooseLanguage(itemIndex)
            uiLiveDataEvent.value = SettingUiEvents.ChooseLanguageApp
        }
    }
}