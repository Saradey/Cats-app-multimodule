package com.evgeny.goncharov.wallcats.interactors

import com.evgeny.goncharov.wallcats.model.view.CatBreedView

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
     * @param nextCount
     */
    suspend fun loadNextPage(nextCount: Int): List<CatBreedView>
}