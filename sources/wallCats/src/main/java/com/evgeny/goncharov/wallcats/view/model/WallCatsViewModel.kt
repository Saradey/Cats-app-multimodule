package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.coreapi.base.BaseUiEvent
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractor
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/**
 * Вьюмодель экрана стены котов
 * @param interactor интерактор стены котов
 */
class WallCatsViewModel(
    private val interactor: WallCatInteractor
) : ViewModel() {

    /** Отдает ui эвенты */
    val liveDataUiEvents = SingleLiveEvent<BaseUiEvent?>()

    /**
     * Иницилизация стены котов
     */
    suspend fun initWallCat(): List<CatBreedView> {
        liveDataUiEvents.value = BaseUiEvent.EventHideSomethingWrong
        liveDataUiEvents.value = BaseUiEvent.EventShowProgress
        val result = interactor.loadWallCat()
        changeStateView(result)
        liveDataUiEvents.value = BaseUiEvent.EventHideProgress
        return suspendCoroutine { continuation ->
            continuation.resume(result)
        }
    }

    private fun changeStateView(listModels: List<CatBreedView>) {
        if (listModels.isEmpty()) {
            liveDataUiEvents.value = BaseUiEvent.EventSomethingWrong
        }
    }

    /**
     * Пангинация стены котов
     * @param nextCount индекс следующей порции
     */
    suspend fun loadNextCats(nextCount: Int): List<CatBreedView> {
        val result = interactor.loadNextPage(nextCount)
        return suspendCoroutine { continuation ->
            continuation.resume(result)
        }
    }
}