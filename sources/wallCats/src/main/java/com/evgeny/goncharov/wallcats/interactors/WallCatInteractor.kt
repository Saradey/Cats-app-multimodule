package com.evgeny.goncharov.wallcats.interactors

import androidx.lifecycle.LiveData
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import com.evgeny.goncharov.wallcats.ui.events.WallCatsEvents

/**
 * Контракт бизнес логики экрана стены котов
 */
interface WallCatInteractor {

    /**
     * Загрузить первую порцию стены котов
     */
    suspend fun loadWallCat(): List<CatBreedView>

    /**
     * Пангинация для стены котов
     * @param key
     */
    suspend fun loadNexPage(nextCount: Int): List<CatBreedView>

    /**
     * Отдает ui события
     */
    fun getUiEventsLiveData(): LiveData<WallCatsEvents>
}