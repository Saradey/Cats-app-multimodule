package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evgeny.goncharov.wallcats.di.components.CatDescriptionComponent
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor
import com.evgeny.goncharov.wallcats.model.view.CatDescription
import kotlinx.coroutines.launch
import javax.inject.Inject

class CatDescriptionViewModel : ViewModel() {

    private val catDescriptionLiveData = MutableLiveData<CatDescription>()

    @Inject
    lateinit var interactor: CatDescriptionInteractor

    fun initInjection() {
        CatDescriptionComponent.component?.inject(this)
    }

    fun setCatId(catId: String) {
        interactor.setCatId(catId)
    }

    fun loadChooseCat() {
        viewModelScope.launch {
            val cat = interactor.loadChooseCat()
            cat?.let {
                catDescriptionLiveData.postValue(cat)
            }
        }
    }

    fun getCatDescriptionLiveData() = catDescriptionLiveData

    fun getLiveDataUiEvents() = interactor.getLiveDataUiEvents()
}