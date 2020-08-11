package com.evgeny.goncharov.wallcats.interactors

import androidx.lifecycle.LiveData
import com.evgeny.goncharov.wallcats.model.view.CatDescription
import com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents

interface CatDescriptionInteractor {

    fun setCatId(catId: String)

    suspend fun loadChooseCat(): CatDescription?

    fun getLiveDataUiEvents(): LiveData<CatDescriptionEvents>
}