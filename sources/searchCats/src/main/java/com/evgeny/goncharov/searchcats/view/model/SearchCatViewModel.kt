package com.evgeny.goncharov.searchcats.view.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evgeny.goncharov.searchcats.di.components.SearchCatComponent
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Вьюмодель поиска котов
 */
class SearchCatViewModel : ViewModel() {

    /** Интерактор бизнес логика поиска котов */
    @Inject
    lateinit var interactor: SearchCatInteractor

    /**
     * Для отмены поиска если мы ввели новое значение
     */
    private var job: Job? = null

    /**
     * иницилизация зависимостей
     */
    fun initInject() {
        SearchCatComponent.component?.inject(this)
    }

    /**
     * Запускаем поиск
     * @param text
     */
    fun setInputTextSearchView(text: String) {
        job?.cancel()
        job = viewModelScope.launch {
            interactor.setInputTextSearchView(text)
        }
    }

    /**
     * LiveData отдает View юйаЭвент
     */
    fun getUiEventsLiveData() = interactor.getUiEventsLiveData()

    /**
     * LiveData отдает View список искомых котов
     */
    fun getLiveDataCatsCathed() = interactor.getLiveDataCatsCatch()
}