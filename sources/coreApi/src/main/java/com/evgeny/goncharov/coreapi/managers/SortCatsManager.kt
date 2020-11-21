package com.evgeny.goncharov.coreapi.managers

import com.evgeny.goncharov.coreapi.utils.SortedType

/**
 * Менеджер предоставляющий информацию о сортировки стены котов
 */
interface SortCatsManager {

    /**
     * Получить тип сортировки
     * @return по какому типу сортировать
     */
    fun getSortedType(): SortedType

    /**
     * Если пользователь выбрали тип сортировки сохраняем в шайреж
     * @param type тип выбранной сортировки в настройках
     */
    fun setSortedType(type: SortedType)
}