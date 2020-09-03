package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.wallcats.di.components.WallCatsComponent
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractor
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class WallCatsViewModel : ViewModel() {

    @Inject
    lateinit var interactor: WallCatInteractor

    fun initInjection() {
        WallCatsComponent.component?.inject(this)
    }

    suspend fun initWallCat(): List<CatBreedView> {
        val result = interactor.loadWallCat()
        return suspendCoroutine { continuation ->
            continuation.resume(result)
        }
    }

    suspend fun loadNextCats(key: Int): List<CatBreedView> {
        val result = interactor.loadNexPage(key)
        return suspendCoroutine { continuation ->
            continuation.resume(result)
        }
    }

    fun getUiEventsLiveData() = interactor.getUiEventsLiveData()
}