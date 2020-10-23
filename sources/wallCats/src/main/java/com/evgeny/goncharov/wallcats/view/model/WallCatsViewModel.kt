package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.wallcats.di.components.WallCatsComponent
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractor
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/**
 * Вьюмодель экрана стены котов
 */
class WallCatsViewModel : ViewModel() {

    /** Интерактор стены котов */
    private lateinit var interactor: WallCatInteractor

    /**
     * Иницилизация зависимостей
     */
    fun initInjection() {
        WallCatsComponent.component?.let {
            interactor = it.provideInteractor()
        }
    }

    /**
     * Иницилизация стены котов
     */
    suspend fun initWallCat(): List<CatBreedView> {
        val result = interactor.loadWallCat()
        return suspendCoroutine { continuation ->
            continuation.resume(result)
        }
    }

    /**
     * Пангинация стены котов
     * @param nextCount индекс следующей порции
     */
    suspend fun loadNextCats(nextCount: Int): List<CatBreedView> {
        val result = interactor.loadNexPage(nextCount)
        return suspendCoroutine { continuation ->
            continuation.resume(result)
        }
    }

    /** LiveData отдает ui эвенты */
    fun getUiEventsLiveData() = interactor.getUiEventsLiveData()
}