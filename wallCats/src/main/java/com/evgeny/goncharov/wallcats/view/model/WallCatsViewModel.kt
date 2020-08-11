package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.LiveData
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import com.evgeny.goncharov.wallcats.ui.events.WallCatsEvents

interface WallCatsViewModel {

    suspend fun initWallCat(): List<CatBreedView>

    suspend fun loadNextCats(key: Int): List<CatBreedView>

    fun getUiEventsLiveData(): LiveData<WallCatsEvents>

    fun initInjection()
}