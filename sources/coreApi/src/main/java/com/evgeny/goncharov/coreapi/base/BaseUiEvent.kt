package com.evgeny.goncharov.coreapi.base

/**
 * Базовый сценарий ui эвентов на экранах
 */
sealed class BaseUiEvent {
    /**
     * Показать прогресс
     */
    object EventShowProgress : BaseUiEvent()

    /**
     * Показать заглушку ошибки
     */
    object EventSomethingWrong : BaseUiEvent()

    /**
     * Спрятать прогресс
     */
    object EventHideProgress : BaseUiEvent()

    /**
     * Спрятать заглушку ошибки
     */
    object EventHideSomethingWrong : BaseUiEvent()

    /**
     * Показать контент
     */
    object EventShowContent : BaseUiEvent()

    /**
     * Спрятать контент
     */
    object EventHideContent : BaseUiEvent()
}