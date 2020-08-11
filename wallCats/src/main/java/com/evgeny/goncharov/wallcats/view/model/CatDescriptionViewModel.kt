package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.LiveData
import com.evgeny.goncharov.wallcats.model.view.CatDescription
import com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents

interface CatDescriptionViewModel {

    fun setCatId(catId: String)

    fun loadChooseCat()

    fun getCatDescriptionLiveData(): LiveData<CatDescription>

    fun initInjection()

    fun getLiveDataUiEvents(): LiveData<CatDescriptionEvents>
}