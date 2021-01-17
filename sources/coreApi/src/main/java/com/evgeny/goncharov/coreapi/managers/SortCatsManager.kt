package com.evgeny.goncharov.coreapi.managers

import com.evgeny.goncharov.coreapi.utils.SortType

/**
 * Менеджер предоставляющий информацию о сортировки стены котов
 */
interface SortCatsManager {

    /**
     * Получить тип сортировки
     * @return по какому типу сортировать
     */
    fun getSortedType(): SortType

    /**
     * Если пользователь выбрали тип сортировки сохраняем в шараду
     * @param type тип выбранной сортировки в настройках
     */
    fun setSortedType(type: SortType)
}