package com.evgeny.goncharov.searchcats.interactor

import androidx.lifecycle.MutableLiveData
import com.evgeny.goncharov.coreapi.dto.request.GetChooseCatRequest
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.searchcats.gateway.SearchCatGateway
import com.evgeny.goncharov.searchcats.model.CatCatch
import com.evgeny.goncharov.searchcats.ui.events.SearchCatUiEvents
import javax.inject.Inject

/**
 * Реализация бизнес кейсов экрана поиска котов
 * @property gateway источник данных искомых котов
 */
class SearchCatInteractorImpl @Inject constructor(
    private val gateway: SearchCatGateway
) : SearchCatInteractor {

    /** LiveData отдает Ui эвенты */
    private val liveDataUiEvents = SingleLiveEvent<SearchCatUiEvents>()

    /** LiveData отдает список искомых котов */
    private val liveDataCatsCatch = MutableLiveData<List<CatCatch>>()

    override suspend fun setInputTextSearchView(text: String) {
        liveDataUiEvents.value = SearchCatUiEvents.EventShowProgressAndHideStubAndHideModels
        val models = try {
            gateway.loadFromInternet(GetChooseCatRequest(text).createRequest())
        } catch (exp: Exception) {
            exp.printStackTrace()
            gateway.loadFromDatabase(text)
        }
        validateData(models)
    }

    private fun validateData(models: List<CatCatch>) {
        if (models.isEmpty()) {
            liveDataUiEvents.value = SearchCatUiEvents.EventHideProgressAndShowStub
        } else {
            liveDataUiEvents.value = SearchCatUiEvents.EventHideProgressAndShowRecycleView
            liveDataCatsCatch.postValue(models)
        }
    }

    override fun getUiEventsLiveData() = liveDataUiEvents

    override fun getLiveDataCatsCatch() = liveDataCatsCatch
}