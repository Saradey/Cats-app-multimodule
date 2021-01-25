package com.evgeny.goncharov.wallcats.view.model

import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.coreapi.base.BaseUiEvent
import com.evgeny.goncharov.coreapi.managers.NetworkManager
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.wallcats.interactors.CatDescriptionInteractor
import com.evgeny.goncharov.wallcats.model.view.CatDescriptionEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Вьюмодель экрана описание кота
 * @property interactor бизнес логики экрана описание кота
 * @property networkManager проверяет есть ли соединение с интернетом
 */
class CatDescriptionViewModel(
    private val interactor: CatDescriptionInteractor,
    private val networkManager: NetworkManager
) : ViewModel() {

    /** Корутина для запроса выбранного кота */
    private val coroutineMainScope = CoroutineScope(Dispatchers.Main)

    /** Отдает ui эвенты */
    val liveDataUiEvents = SingleLiveEvent<BaseUiEvent<CatDescriptionEntity>?>()

    /**
     * Делегирование id кота слою бизнес логики
     * @param catId
     */
    fun setCatId(catId: String) = interactor.setCatId(catId)

    /**
     * Загрузить выбранного кота для отображения в View
     */
    fun loadChooseCat() {
        coroutineMainScope.launch {
            if (networkManager.isConnect())
                liveDataUiEvents.value = BaseUiEvent.EventShowProgress
            val cat = interactor.loadChooseCat()
            liveDataUiEvents.value = BaseUiEvent.EventHideProgress
            cat?.let {
                liveDataUiEvents.value = BaseUiEvent.Success(cat)
            } ?: run {
                liveDataUiEvents.value = BaseUiEvent.EventSomethingWrong
            }
        }
    }
}