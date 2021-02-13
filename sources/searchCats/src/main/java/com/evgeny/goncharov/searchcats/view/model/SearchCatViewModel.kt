package com.evgeny.goncharov.searchcats.view.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evgeny.goncharov.coreapi.base.BaseUiEvent
import com.evgeny.goncharov.coreapi.managers.NetworkManager
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor
import com.evgeny.goncharov.searchcats.model.CatCatchEntity
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
 * Вьюмодель поиска котов
 * @property interactor интерактор поиска
 * @property networkManager предоставляет информацию о подключении к интернету
 */
class SearchCatViewModel(
    private val interactor: SearchCatInteractor,
    private val networkManager: NetworkManager
) : ViewModel() {

    /** LiveData отдает Ui эвенты */
    val liveDataUiEvents = SingleLiveEvent<BaseUiEvent<List<CatCatchEntity>>?>()

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
            if (text.isNotEmpty()) {
                if (networkManager.isConnect())
                    liveDataUiEvents.value = BaseUiEvent.EventShowProgress
                val models = interactor.setInputTextSearchView(text)
                liveDataUiEvents.value = BaseUiEvent.EventHideProgress
                validateData(models)
            } else {
                liveDataUiEvents.value = BaseUiEvent.EventSomethingWrong
            }
        }
    }

    private fun validateData(models: List<CatCatchEntity>) {
        if (models.isEmpty()) {
            liveDataUiEvents.value = BaseUiEvent.EventSomethingWrong
        } else {
            liveDataUiEvents.value = BaseUiEvent.Success(models)
        }
    }
}