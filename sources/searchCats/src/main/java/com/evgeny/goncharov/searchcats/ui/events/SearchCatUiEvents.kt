package com.evgeny.goncharov.searchcats.ui.events

/**
 * Ui эвенты на экране поиска котов
 */
sealed class SearchCatUiEvents {

    /** Показать прогресс спрятать контент и спрятать заглушку о том что мы ничего не нашли */
    object EventShowProgressAndHideStubAndHideModels : SearchCatUiEvents()

    /** Спрятать прогресс и показать заглушку что мы ничего не нашли */
    object EventHideProgressAndShowStub : SearchCatUiEvents()

    /** Спрятать заглушку и показать список искомых котов */
    object EventHideProgressAndShowRecycleView : SearchCatUiEvents()
}