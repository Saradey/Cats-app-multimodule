package com.evgeny.goncharov.settings.view.model

import androidx.annotation.StyleRes
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.settings.di.components.SettingsComponent
import com.evgeny.goncharov.settings.events.SettingUiEvents
import com.evgeny.goncharov.settings.interactor.SettingsInteractor
import com.evgeny.goncharov.settings.interactor.SettingsInteractorImpl
import com.evgeny.goncharov.settings.models.ThemeModel
import com.evgeny.goncharov.settings.ui.DialogChooseSortType.Companion.INDEX_SORT_LIFE_SPAN
import com.evgeny.goncharov.settings.ui.DialogChooseSortType.Companion.INDEX_SORT_NAME
import com.evgeny.goncharov.settings.ui.DialogChooseSortType.Companion.INDEX_SORT_WIGHT

/**
 * ВьюМодель экрана настроек
 */
class SettingsViewModel : ViewModel() {

    /** Интерактор экрана настроек */
    private lateinit var interactor: SettingsInteractor

    /** Отдает какая тема установлена */
    val themeLiveDataModel = MutableLiveData<ThemeModel?>()

    /** Отдает какой язык установлен */
    val languageLiveData = MutableLiveData<Language?>()

    /** Отдает ui эвенты */
    val uiLiveDataEvent = SingleLiveEvent<SettingUiEvents?>()

    /** Отдает какая сортировка установлена */
    val sortTypeLiveData = MutableLiveData<SortType>()

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

    /**
     * Иницилизировать тип сортировки во вью
     */
    fun initSortType() {
        val sortType = interactor.getSortType()
        sortTypeLiveData.value = sortType
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

    /**
     * Получить индекс сортировки котов для диалогового окна
     */
    fun getSortValue(): Int = when (sortTypeLiveData.value) {
        SortType.SortName -> INDEX_SORT_NAME
        SortType.SortLifeSpan -> INDEX_SORT_LIFE_SPAN
        else -> INDEX_SORT_WIGHT
    }

    /**
     * Сетнуть значения выбранной сортировки в слой бизнес логики
     * @param item выбранный индекс
     */
    fun setChooseSort(item: Int) {
        when (item) {
            INDEX_SORT_NAME -> interactor.setChooseSort(SortType.SortName)
            INDEX_SORT_LIFE_SPAN -> interactor.setChooseSort(SortType.SortLifeSpan)
            INDEX_SORT_WIGHT -> interactor.setChooseSort(SortType.SortWeight)
        }
        initSortType()
    }
}