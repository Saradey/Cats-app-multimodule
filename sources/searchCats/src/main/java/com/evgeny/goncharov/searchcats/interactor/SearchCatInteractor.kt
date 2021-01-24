package com.evgeny.goncharov.searchcats.interactor

import com.evgeny.goncharov.searchcats.model.CatCatchEntity

/**
 * Контракт use case экрана поиска котов
 */
interface SearchCatInteractor {

    /**
     * Поиск котов по их имени
     * @param text
     */
    suspend fun setInputTextSearchView(text: String): List<CatCatchEntity>
}