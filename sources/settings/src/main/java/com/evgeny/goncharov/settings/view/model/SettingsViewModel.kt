package com.evgeny.goncharov.settings.view.model

import androidx.annotation.StyleRes
import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.settings.di.components.SettingsComponent
import com.evgeny.goncharov.settings.events.SettingUiEvents
import com.evgeny.goncharov.settings.interactor.SettingsInteractor
import com.evgeny.goncharov.settings.interactor.SettingsInteractorImpl
import com.evgeny.goncharov.settings.models.ThemeModel

/**
 * ВьюМодель экрана настроек
 */
class SettingsViewModel : ViewModel() {

    /** Интерактор экрана настроек */
    private lateinit var interactor: SettingsInteractor

    /** Отдает какая тема установлена */
    val themeLiveDataModel = SingleLiveEvent<ThemeModel?>()

    /** Отдает какой язык установлен */
    val languageLiveData = SingleLiveEvent<Language?>()

    /** Отдает ui эвенты */
    val uiLiveDataEvent = SingleLiveEvent<SettingUiEvents?>()

    /**
     * Иницилизация зависимостей
     */
    fun initInjection() {
        SettingsComponent.component?.apply {
            interactor = provideInteractor()
        }
    }

    /**
     * Проиницилизировать тему во View
     */
    fun initThemeToView() {
        val theme = interactor.getThemeNow()
        themeLiveDataModel.value = theme
    }

    /**
     * Возвращает ресурс темы
     */
    @StyleRes
    fun getThemeValue() = interactor.getThemeValue()

    /**
     * Если выбрали тему
     * @param item индекс темы
     */
    fun setChooseThemeIndex(item: Int) {
        when (item) {
            SettingsInteractorImpl.INDEX_NIGHT_DIALOG -> interactor.onNight()
            else -> interactor.onLight()
        }
        uiLiveDataEvent.value = SettingUiEvents.ChooseThemeApp
    }

    /**
     * Проиницилизировать язык в вью
     */
    fun initLanguageToView() {
        val lan = interactor.getAppLanguage()
        languageLiveData.value = lan
    }

    fun getThemeNow() = interactor.getTheme()

    fun getSelectLanguage() = interactor.getSelectLanguage()

    /**
     * Выбрали язык
     * @param itemIndex индек выбранного поля
     */
    fun chooseLanguage(itemIndex: Int) {
        if (interactor.getChooseLanguageIndex() != itemIndex) {
            interactor.chooseLanguage(itemIndex)
            uiLiveDataEvent.value = SettingUiEvents.ChooseLanguageApp
        }
    }
}