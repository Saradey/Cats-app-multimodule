package com.evgeny.goncharov.wallcats.interactors

import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.wallcats.gateways.CatDescriptionGateway
import com.evgeny.goncharov.wallcats.model.view.CatDescription
import com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CatDescriptionInteractorImpl @Inject constructor(
    private val repository: CatDescriptionGateway
) : CatDescriptionInteractor {

    private var catId = ""

    private var liveDataUiEvents = SingleLiveEvent<CatDescriptionEvents>()

    override fun setCatId(catId: String) {
        this.catId = catId
    }

    override suspend fun loadChooseCat(): CatDescription? =
        withContext(Dispatchers.Main) {
            var cat: CatDescription? = null
            liveDataUiEvents.value = CatDescriptionEvents.EventShowProgress
            cat = try {
                repository.loadChooseCatFromInternet(catId)
            } catch (exception: Exception) {
                exception.printStackTrace()
                loadChooseCatFromDatabase()
            }
            validateData(cat)
            cat
        }

    private suspend fun loadChooseCatFromDatabase(): CatDescription? {
        val model = repository.loadChooseCatFromDatabase(catId)
        return model ?: kotlin.run {
            repository.loadChooseCatFromDatabaseSpare(catId)
        }
    }

    private fun validateData(model: CatDescription?) {
        if (model == null) {
            liveDataUiEvents.value = CatDescriptionEvents.EventHideProgressAndShowSomethingWrong
        } else {
            liveDataUiEvents.value = CatDescriptionEvents.EventHideProgressAndShowContent
        }
    }

    override fun getLiveDataUiEvents() = liveDataUiEvents
}