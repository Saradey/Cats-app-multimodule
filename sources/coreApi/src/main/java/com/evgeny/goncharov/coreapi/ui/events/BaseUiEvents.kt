package com.evgeny.goncharov.coreapi.ui.events

/**
 * Силид класс и состояния экрана
 */
sealed class BaseUiEvents {

    /**
     * Показываем прогресс кота
     */
    object ShowProgress : BaseUiEvents()

    /**
     * Прячим прогресс кота
     */
    object HideProgress : BaseUiEvents()

    /**
     * Показываем заглушку ошибки
     */
    object ShowSomethingWrong : BaseUiEvents()

    /**
     * Прячим заглушку ошибки
     */
    object HideSomethingWrong : BaseUiEvents()
}