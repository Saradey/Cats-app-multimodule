package com.evgeny.goncharov.wallcats.interactors

import com.evgeny.goncharov.wallcats.model.view.CatDescriptionEntity

/**
 * Контракт бизнес логики экрана описание кота
 */
interface CatDescriptionInteractor {

    /**
     * Сетаем id кота которого нужно отобразить
     * @param catId id выбранного кота
     */
    fun setCatId(catId: String)

    /**
     * Загружаем выбранного кота
     */
    suspend fun loadChooseCat(): CatDescriptionEntity?
}