package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.wallcats.di.components.WallCatsComponent
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor
import com.evgeny.goncharov.wallcats.model.view.CatDescription
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Вьюмодель экрана описание кота
 */
class CatDescriptionViewModel : ViewModel() {

    /** Отдает выбранного кота для отоборажения в View */
    private val catDescriptionLiveData = MutableLiveData<CatDescription>()

    /** Бизнес логика экрана описание кота */
    private lateinit var interactor: CatDescriptionInteractor

    /** Корутина для запроса выбранного кота */
    private val coroutineMainScope = CoroutineScope(Dispatchers.Main)

    /**
     * Иницилизация зависимостей
     */
    fun initInjection() {
        WallCatsComponent.component?.let {
            interactor = it.provideDescriptionInteractor()
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
        coroutineMainScope.launch {
            val cat = interactor.loadChooseCat()
            cat?.let {
                catDescriptionLiveData.value = it
            }
        }
    }

    fun getCatDescriptionLiveData() = catDescriptionLiveData

    fun getLiveDataUiEvents() = interactor.getLiveDataUiEvents()
}