package com.evgeny.goncharov.searchcats.interactor

import androidx.lifecycle.MutableLiveData
import com.evgeny.goncharov.coreapi.dto.request.GetChooseCatRequest
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.searchcats.gateway.SearchCatGateway
import com.evgeny.goncharov.searchcats.model.CatCatched
import com.evgeny.goncharov.searchcats.ui.events.SearchCatEvents
import javax.inject.Inject

class SearchCatInteractorImpl @Inject constructor(
    private val repository: SearchCatGateway
) : SearchCatInteractor {

    private val liveDataUiEvents = SingleLiveEvent<SearchCatEvents>()
    private val liveDataCatsCathed = MutableLiveData<List<CatCatched>>()

    override suspend fun setInputTextSearchView(text: String) {
        liveDataUiEvents.value = SearchCatEvents.EventShowProgressAndHideStubAndHideModels
        val models = try {
            repository.loadFromInternet(GetChooseCatRequest(text).createRequest())
        } catch (exp: Exception) {
            exp.printStackTrace()
            repository.loadFromDatabase(text)
        }
        validateData(models)
    }

    private fun validateData(models: List<CatCatched>) {
        if (models.isEmpty()) {
            liveDataUiEvents.value = SearchCatEvents.EventHideProgressAndShowStub
        } else {
            liveDataUiEvents.value = SearchCatEvents.EventHideProgressAndShowRecycleView
            liveDataCatsCathed.postValue(models)
        }
    }

    override fun getUiEventsLiveData() = liveDataUiEvents

    override fun getLiveDataCatsCathed() = liveDataCatsCathed
}