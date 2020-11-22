package com.evgeny.goncharov.coreapi.utils

/**
 * Тип сортировки для стены котов
 */
sealed class SortType {

    /**
     * Сортировка по алфовиту
     */
    object SortName : SortType()

    /**
     * Сортировка по жизненному циклу
     */
    object SortLifeSpan : SortType()

    /**
     * Сортировка по весу
     */
    object SortWeight : SortType()
}