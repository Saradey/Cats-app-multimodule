package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evgeny.goncharov.wallcats.model.view.CatDescription
import com.evgeny.goncharov.wallcats.di.components.CatDescriptionComponent
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor
import kotlinx.coroutines.launch
import javax.inject.Inject

class CatDescriptionViewModelImpl : ViewModel(), CatDescriptionViewModel {

    private val catDescriptionLiveData = MutableLiveData<CatDescription>()

    @Inject
    lateinit var interactor: CatDescriptionInteractor

    override fun initInjection() {
        CatDescriptionComponent.component?.inject(this)
    }

    override fun setCatId(catId: String) {
        interactor.setCatId(catId)
    }

    override fun loadChooseCat() {
        viewModelScope.launch {
            val cat = interactor.loadChooseCat()
            cat?.let {
                catDescriptionLiveData.postValue(cat)
            }
        }
    }

    override fun getCatDescriptionLiveData() = catDescriptionLiveData

    override fun getLiveDataUiEvents() = interactor.getLiveDataUiEvents()
}