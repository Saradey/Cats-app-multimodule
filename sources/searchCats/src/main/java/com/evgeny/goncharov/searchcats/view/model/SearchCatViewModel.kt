package com.evgeny.goncharov.searchcats.view.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evgeny.goncharov.searchcats.di.components.SearchCatComponent
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

class SearchCatViewModel : ViewModel() {

    @Inject
    lateinit var interactor: SearchCatInteractor

    private var job: Job? = null

    fun initInject() {
        SearchCatComponent.component?.inject(this)
    }

    fun setInputTextSearchView(text: String) {
        job?.cancel()
        job = viewModelScope.launch {
            interactor.setInputTextSearchView(text)
        }
    }

    fun getUiEventsLiveData() = interactor.getUiEventsLiveData()

    fun getLiveDataCatsCathed() = interactor.getLiveDataCatsCathed()
}