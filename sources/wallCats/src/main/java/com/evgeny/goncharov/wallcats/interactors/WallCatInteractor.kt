package com.evgeny.goncharov.wallcats.interactors

import androidx.lifecycle.LiveData
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import com.evgeny.goncharov.wallcats.ui.events.WallCatsEvents

interface WallCatInteractor {

    suspend fun loadWallCat(): List<CatBreedView>

    suspend fun loadNexPage(key: Int): List<CatBreedView>

    fun getUiEventsLiveData(): LiveData<WallCatsEvents>
}