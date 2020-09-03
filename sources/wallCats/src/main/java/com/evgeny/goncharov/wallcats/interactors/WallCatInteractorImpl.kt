package com.evgeny.goncharov.wallcats.interactors

import com.evgeny.goncharov.coreapi.LIMIT_PAGE_SIZE_CAT_WALL
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.wallcats.gateways.WallCatGateway
import com.evgeny.goncharov.wallcats.model.request.WallCatRequest
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import com.evgeny.goncharov.wallcats.ui.events.WallCatsEvents
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class WallCatInteractorImpl @Inject constructor(
    private val repository: WallCatGateway
) : WallCatInteractor {

    private val liveDataUiEvents = SingleLiveEvent<WallCatsEvents>()

    override suspend fun loadWallCat(): List<CatBreedView> {
        showProgress()
        val listModels = try {
            loadFromInternet()
        } catch (exp: Exception) {
            loadFromDatabase(exp)
        } finally {
            hideProgressAndInitRefreshLayout()
        }
        changeStateView(listModels)
        return suspendCoroutine { continuation ->
            continuation.resume(listModels)
        }
    }

    private fun changeStateView(listModels: List<CatBreedView>) {
        if (listModels.isEmpty()) {
            liveDataUiEvents.value = WallCatsEvents.EventSomethingWrong
        }
    }

    override suspend fun loadNexPage(key: Int): List<CatBreedView> {
        val result = repository.loadWallCatFromInternet(
            WallCatRequest(
                limit = LIMIT_PAGE_SIZE_CAT_WALL,
                page = key
            )
        )
        return suspendCoroutine { continuation ->
            continuation.resume(
                result
            )
        }
    }

    private suspend fun loadFromDatabase(exp: Exception): List<CatBreedView> {
        exp.printStackTrace()
        return repository.loadWallCatFromDatabase()
    }

    private suspend fun loadFromInternet(): List<CatBreedView> {
        return repository.loadWallCatFromInternet(
            WallCatRequest(
                limit = LIMIT_PAGE_SIZE_CAT_WALL,
                page = 0
            )
        )
    }

    private suspend fun showProgress() = withContext(Dispatchers.Main) {
        liveDataUiEvents.value = WallCatsEvents.EventShowProgressAndHideStub
    }

    private suspend fun hideProgressAndInitRefreshLayout() = withContext(Dispatchers.Main) {
        liveDataUiEvents.value = WallCatsEvents.EventHideProgressAndInitRefreshLayout
    }

    override fun getUiEventsLiveData() = liveDataUiEvents
}