package com.evgeny.goncharov.searchcats.interactor

import androidx.lifecycle.LiveData
import com.evgeny.goncharov.searchcats.model.CatCatch
import com.evgeny.goncharov.searchcats.ui.events.SearchCatUiEvents

/**
 * Контракт use case экрана поиска котов
 */
interface SearchCatInteractor {

    /**
     * Поиск котов по их имени
     * @param text
     */
    suspend fun setInputTextSearchView(text: String)

    /**
     * LiveData отдает Ui эвенты
     */
    fun getUiEventsLiveData(): LiveData<SearchCatUiEvents>

    /**
     * LiveData отдает список искомых котов
     */
    fun getLiveDataCatsCatch(): LiveData<List<CatCatch>>
}