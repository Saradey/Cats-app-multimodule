package com.evgeny.goncharov.searchcats.view.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evgeny.goncharov.searchcats.interactor.SearchCatInteractor
import com.evgeny.goncharov.searchcats.di.components.SearchCatComponent
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

class SearchCatViewModelImpl : ViewModel(), SearchCatViewModel {

    @Inject
    lateinit var interactor: SearchCatInteractor

    private var job: Job? = null

    override fun initInject() {
        SearchCatComponent.component?.inject(this)
    }

    override fun setInputTextSearchView(text: String) {
        job?.cancel()
        job = viewModelScope.launch {
            interactor.setInputTextSearchView(text)
        }
    }

    override fun getUiEventsLiveData() = interactor.getUiEventsLiveData()

    override fun getLiveDataCatsCathed() = interactor.getLiveDataCatsCathed()
}