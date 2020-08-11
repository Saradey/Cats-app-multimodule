package com.evgeny.goncharov.searchcats.interactor

import androidx.lifecycle.LiveData
import com.evgeny.goncharov.searchcats.model.CatCatched
import com.evgeny.goncharov.searchcats.ui.events.SearchCatEvents

interface SearchCatInteractor {

    suspend fun setInputTextSearchView(text: String)

    fun getUiEventsLiveData(): LiveData<SearchCatEvents>

    fun getLiveDataCatsCathed(): LiveData<List<CatCatched>>
}