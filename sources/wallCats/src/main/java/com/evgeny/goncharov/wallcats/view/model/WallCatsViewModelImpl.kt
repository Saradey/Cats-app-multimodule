package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import com.evgeny.goncharov.wallcats.di.components.WallCatsComponent
import com.evgeny.goncharov.wallcats.interactors.WallCatInteractor
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class WallCatsViewModelImpl : ViewModel(), WallCatsViewModel {

    @Inject
    lateinit var interactor: WallCatInteractor

    override fun initInjection() {
        WallCatsComponent.component?.inject(this)
    }

    override suspend fun initWallCat(): List<CatBreedView> {
        val result = interactor.loadWallCat()
        return suspendCoroutine { continuation ->
            continuation.resume(result)
        }
    }

    override suspend fun loadNextCats(key: Int): List<CatBreedView> {
        val result = interactor.loadNexPage(key)
        return suspendCoroutine { continuation ->
            continuation.resume(result)
        }
    }

    override fun getUiEventsLiveData() = interactor.getUiEventsLiveData()
}