package com.evgeny.goncharov.wallcats.ui.events

/**
 * Ui эвенты экрана стены котов
 */
sealed class WallCatsEvents {

    /**
     * Показать прогресс и спрятать заглушку ошибки
     */
    object EventShowProgressAndHideStub : WallCatsEvents()

    /**
     * Показать заглушку ошибки
     */
    object EventSomethingWrong : WallCatsEvents()

    /**
     * Спрятать прогресс и иницилизировать свайп лейут
     */
    object EventHideProgressAndInitRefreshLayout : WallCatsEvents()
}