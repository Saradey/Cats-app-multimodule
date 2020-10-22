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

/**
 * Реализауия бизнес логики экрана стены котов
 * @property repository источник даных экрана стены котов
 */
class WallCatInteractorImpl @Inject constructor(
    private val repository: WallCatGateway
) : WallCatInteractor {

    /** Отдает ui эвенты */
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

    override suspend fun loadNexPage(nextCount: Int): List<CatBreedView> =
        repository.loadWallCatFromInternet(
            WallCatRequest(
                limit = LIMIT_PAGE_SIZE_CAT_WALL,
                page = nextCount
            )
        )

    private suspend fun loadFromDatabase(exp: Exception): List<CatBreedView> {
        exp.printStackTrace()
        return repository.loadWallCatFromDatabase()
    }

    private suspend fun loadFromInternet(): List<CatBreedView> =
        repository.loadWallCatFromInternet(
            WallCatRequest(
                limit = LIMIT_PAGE_SIZE_CAT_WALL,
                page = 0
            )
        )

    private suspend fun showProgress() = withContext(Dispatchers.Main) {
        liveDataUiEvents.value = WallCatsEvents.EventShowProgressAndHideStub
    }

    private suspend fun hideProgressAndInitRefreshLayout() = withContext(Dispatchers.Main) {
        liveDataUiEvents.value = WallCatsEvents.EventHideProgressAndInitRefreshLayout
    }

    override fun getUiEventsLiveData() = liveDataUiEvents
}