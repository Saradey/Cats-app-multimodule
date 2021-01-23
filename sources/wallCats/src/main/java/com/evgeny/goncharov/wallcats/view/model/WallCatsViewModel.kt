package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.coreapi.base.BaseUiEvent
import com.evgeny.goncharov.coreapi.managers.NetworkManager
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractor
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/**
 * Вьюмодель экрана стены котов
 * @param interactor интерактор стены котов
 * @param networkManager проверяет есть ли соединение с интернетом
 */
class WallCatsViewModel(
    private val interactor: WallCatInteractor,
    private val networkManager: NetworkManager
) : ViewModel() {

    /** Отдает ui эвенты */
    val liveDataUiEvents = SingleLiveEvent<BaseUiEvent<*>>()

    /**
     * Иницилизация стены котов
     */
    suspend fun initWallCat(): List<CatBreedView> {
        if (networkManager.isConnect())
            liveDataUiEvents.value = BaseUiEvent.EventShowProgress
        val result = interactor.loadWallCat()
        liveDataUiEvents.value = BaseUiEvent.EventHideProgress
        changeStateView(result)
        return suspendCoroutine { continuation ->
            continuation.resume(result)
        }
    }

    private fun changeStateView(listModels: List<CatBreedView>) {
        if (listModels.isEmpty()) {
            liveDataUiEvents.value = BaseUiEvent.EventSomethingWrong
        } else {
            liveDataUiEvents.value = BaseUiEvent.Success(Any())
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