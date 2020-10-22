package com.evgeny.goncharov.wallcats.ui.events

/**
 * Ui эвенты экрана описания кота
 */
sealed class CatDescriptionEvents {

    /**
     * Показать прогресс
     */
    object EventShowProgress : CatDescriptionEvents()

    /**
     * Спрятать прогресс и показать контент
     */
    object EventHideProgressAndShowContent : CatDescriptionEvents()

    /**
     * Спрятать прогресс и показать заглушку ошибки
     */
    object EventHideProgressAndShowSomethingWrong : CatDescriptionEvents()
}