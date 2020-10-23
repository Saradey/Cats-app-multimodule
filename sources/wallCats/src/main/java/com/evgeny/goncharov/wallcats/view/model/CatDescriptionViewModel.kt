package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evgeny.goncharov.wallcats.di.components.CatDescriptionComponent
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor
import com.evgeny.goncharov.wallcats.model.view.CatDescription
import kotlinx.coroutines.launch

/**
 * Вьюмодель экрана описание кота
 */
class CatDescriptionViewModel : ViewModel() {

    /** Отдает выбранного кота для отоборажения в View */
    private val catDescriptionLiveData = MutableLiveData<CatDescription>()

    /** Бизнес логика экрана описание кота */
    private lateinit var interactor: CatDescriptionInteractor

    /**
     * Иницилизация зависимостей
     */
    fun initInjection() {
        CatDescriptionComponent.component?.let {
            interactor = it.provideInteractor()
        }
    }

    /**
     * Делегирование id кота слою бизнес логики
     * @param catId
     */
    fun setCatId(catId: String) {
        interactor.setCatId(catId)
    }

    /**
     * Загрузить выбранного кота для отображения в View
     */
    fun loadChooseCat() {
        viewModelScope.launch {
            val cat = interactor.loadChooseCat()
            cat?.let {
                catDescriptionLiveData.value = it
            }
        }
    }

    fun getCatDescriptionLiveData() = catDescriptionLiveData

    fun getLiveDataUiEvents() = interactor.getLiveDataUiEvents()
}