package com.evgeny.goncharov.wallcats.interactors

import androidx.lifecycle.LiveData
import com.evgeny.goncharov.wallcats.model.view.CatDescription
import com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents

/**
 * Контракт бзнес логики экрана описание кота
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
    suspend fun loadChooseCat(): CatDescription?

    /**
     * Отдает ui эвенты
     */
    fun getLiveDataUiEvents(): LiveData<CatDescriptionEvents>
}