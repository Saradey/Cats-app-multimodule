package com.evgeny.goncharov.coreapi.utils

/**
 * Тип сортировки для стены котов
 */
sealed class SortedType {

    /**
     * Сортировка по алфовиту
     */
    object SortedName : SortedType()

    /**
     * Сортировка по жизненному циклу
     */
    object SortedLifeSpan : SortedType()

    /**
     * Сортировка по весу
     */
    object SortedWeight : SortedType()
}