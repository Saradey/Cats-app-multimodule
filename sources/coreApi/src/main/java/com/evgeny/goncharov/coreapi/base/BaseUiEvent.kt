package com.evgeny.goncharov.coreapi.base

/**
 * Базовый сценарий ui эвентов на экранах
 */
sealed class BaseUiEvent<out T : Any> {
    /**
     * Показать прогресс
     */
    object EventShowProgress : BaseUiEvent<Nothing>()

    /**
     * Показать заглушку ошибки
     */
    object EventSomethingWrong : BaseUiEvent<Nothing>()

    /**
     * Спрятать прогресс
     */
    object EventHideProgress : BaseUiEvent<Nothing>()

    /**
     * В случае успеха загрузки мы передаем данные в виде такой обертки
     * @param data данные
     */
    data class Success<T : Any>(
        val data: T
    ) : BaseUiEvent<T>()
}