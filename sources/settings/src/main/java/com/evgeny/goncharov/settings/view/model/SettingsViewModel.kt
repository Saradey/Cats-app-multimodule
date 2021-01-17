package com.evgeny.goncharov.settings.view.model

import androidx.annotation.StyleRes
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.settings.events.SettingUiEvents
import com.evgeny.goncharov.settings.interactor.SettingsInteractor
import com.evgeny.goncharov.settings.interactor.SettingsInteractorImpl
import com.evgeny.goncharov.settings.models.ThemeModel
import com.evgeny.goncharov.settings.ui.DialogChooseOnOrOfNotification.Companion.INDEX_CHOOSE_OFF
import com.evgeny.goncharov.settings.ui.DialogChooseOnOrOfNotification.Companion.INDEX_CHOOSE_ON
import com.evgeny.goncharov.settings.ui.DialogChooseSortType.Companion.INDEX_SORT_LIFE_SPAN
import com.evgeny.goncharov.settings.ui.DialogChooseSortType.Companion.INDEX_SORT_NAME
import com.evgeny.goncharov.settings.ui.DialogChooseSortType.Companion.INDEX_SORT_WIGHT

/**
 * Вьюмодель экрана настроек
 * @param interactor Интерактор экрана настроек
 */
class SettingsViewModel(
    private val interactor: SettingsInteractor
) : ViewModel() {

    /** Отдает какая тема установлена */
    val themeLiveDataModel = MutableLiveData<ThemeModel?>()

    /** Отдает какой язык установлен */
    val languageLiveData = MutableLiveData<Language?>()

    /** Отдает ui эвенты */
    val uiLiveDataEvent = SingleLiveEvent<SettingUiEvents?>()

    /** Отдает какая сортировка установлена */
    val sortTypeLiveData = MutableLiveData<SortType>()

    /** Отдает, включено уведомление или нет */
    val notificationLiveData = MutableLiveData<Boolean>()

    fun initModelToView() {
        initThemeToView()
        initLanguageToView()
        initSortType()
        initNotificationToView()
    }

    /**
     * Проиницилизировать тему во View
     */
    private fun initThemeToView() {
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
    fun chosenThemeIndex(item: Int) {
        when (item) {
            SettingsInteractorImpl.INDEX_NIGHT_DIALOG -> interactor.onNight()
            else -> interactor.onLight()
        }
        uiLiveDataEvent.value = SettingUiEvents.RecreateActivity
    }

    /**
     * Проиницилизировать язык в вью
     */
    private fun initLanguageToView() {
        val lan = interactor.getAppLanguage()
        languageLiveData.value = lan
    }

    /**
     * Иницилизировать тип сортировки во вью
     */
    private fun initSortType() {
        val sortType = interactor.getSortType()
        sortTypeLiveData.value = sortType
    }

    fun getThemeNow() = interactor.getTheme()

    fun getSelectLanguage() = interactor.getSelectLanguage()

    /**
     * Выбрали язык
     * @param itemIndex индек выбранного поля
     */
    fun chosenLanguage(itemIndex: Int) {
        if (interactor.getChooseLanguageIndex() != itemIndex) {
            interactor.chosenLanguage(itemIndex)
            uiLiveDataEvent.value = SettingUiEvents.RecreateActivity
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
    fun chosenSort(item: Int) {
        when (item) {
            INDEX_SORT_NAME -> interactor.setChooseSort(SortType.SortName)
            INDEX_SORT_LIFE_SPAN -> interactor.setChooseSort(SortType.SortLifeSpan)
            INDEX_SORT_WIGHT -> interactor.setChooseSort(SortType.SortWeight)
        }
        initSortType()
    }

    /**
     * Иницилизация нотификации для View компонента
     */
    private fun initNotificationToView() {
        notificationLiveData.value = interactor.initNotification()
    }

    /**
     * Выбрали нотификацию
     * @param item индекс выбранного значения
     */
    fun chosenNotification(item: Int) {
        interactor.chosenNotification(item)
        initNotificationToView()
    }

    /**
     * Получить индекс установленной нотификации включено/выключено
     */
    fun getSelectNotification() =
        if (notificationLiveData.value == true) INDEX_CHOOSE_ON else INDEX_CHOOSE_OFF
}