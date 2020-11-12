package com.evgeny.goncharov.searchcats.view.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evgeny.goncharov.coreapi.base.BaseUiEvent
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.searchcats.di.components.SearchCatComponent
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor
import com.evgeny.goncharov.searchcats.model.CatCatch
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
 * Вьюмодель поиска котов
 */
class SearchCatViewModel : ViewModel() {

    /** LiveData отдает Ui эвенты */
    val liveDataUiEvents = SingleLiveEvent<BaseUiEvent?>()

    /** LiveData отдает список искомых котов */
    val liveDataCatsCatch = MutableLiveData<List<CatCatch>>()

    /** Интерактор бизнес логика поиска котов */
    private lateinit var interactor: SearchCatInteractor

    /**
     * Для отмены поиска если мы ввели новое значение
     */
    private var job: Job? = null

    /**
     * иницилизация зависимостей
     */
    fun initInject() {
        SearchCatComponent.component?.apply {
            interactor = provideSearchCatInteractor()
        }
    }

    /**
     * Запускаем поиск
     * @param text
     */
    fun setInputTextSearchView(text: String) {
        job?.cancel()
        liveDataUiEvents.value = BaseUiEvent.EventHideSomethingWrong
        liveDataUiEvents.value = BaseUiEvent.EventHideContent
        liveDataUiEvents.value = BaseUiEvent.EventShowProgress
        job = viewModelScope.launch {
            val models = interactor.setInputTextSearchView(text)
            validateData(models)
            liveDataUiEvents.value = BaseUiEvent.EventHideProgress
        }
    }

    private fun validateData(models: List<CatCatch>) {
        if (models.isEmpty()) {
            liveDataUiEvents.value = BaseUiEvent.EventSomethingWrong
        } else {
            liveDataUiEvents.value = BaseUiEvent.EventShowContent
            liveDataCatsCatch.postValue(models)
        }
    }
}