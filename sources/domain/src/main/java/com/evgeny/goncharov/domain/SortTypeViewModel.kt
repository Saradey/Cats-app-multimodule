package com.evgeny.goncharov.domain

import androidx.lifecycle.ViewModel
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent

/**
 * Вью модель которая используется на экране настроек и на экране стены котов
 * оповещает экран стены котов о том что нужно обновить стену после смены типа сортировки
 * на экране настроек
 */
class SortTypeViewModel : ViewModel() {

    /** Лайв дата которая оповещает о смени типа сортировки */
    val updateChooseSortType = SingleLiveEvent<Boolean?>().apply {
        value = false
    }
}