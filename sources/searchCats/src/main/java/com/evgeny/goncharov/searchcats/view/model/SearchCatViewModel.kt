package com.evgeny.goncharov.searchcats.view.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evgeny.goncharov.coreapi.base.BaseUiEvent
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor
import com.evgeny.goncharov.searchcats.model.CatCatch
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
 * Вьюмодель поиска котов
 * @param interactor интерактор поиска
 */
class SearchCatViewModel(
    private val interactor: SearchCatInteractor
) : ViewModel() {

    /** LiveData отдает Ui эвенты */
    val liveDataUiEvents = SingleLiveEvent<BaseUiEvent<List<CatCatch>>?>()

    /**
     * Для отмены поиска если мы ввели новое значение
     */
    private var job: Job? = null

    /**
     * Запускаем поиск
     * @param text
     */
    fun setInputTextSearchView(text: String) {
        job?.cancel()
        job = viewModelScope.launch {
            liveDataUiEvents.value = BaseUiEvent.EventShowProgress
            val models = interactor.setInputTextSearchView(text)
            validateData(models)
            liveDataUiEvents.value = BaseUiEvent.EventHideProgress
        }
    }

    private fun validateData(models: List<CatCatch>) {
        if (models.isEmpty()) {
            liveDataUiEvents.value = BaseUiEvent.EventSomethingWrong
        } else {
            liveDataUiEvents.value = BaseUiEvent.Success(models)
        }
    }
}