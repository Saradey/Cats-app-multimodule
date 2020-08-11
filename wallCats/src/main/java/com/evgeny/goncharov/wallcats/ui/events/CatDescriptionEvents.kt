package com.evgeny.goncharov.wallcats.ui.events

sealed class CatDescriptionEvents {

    object EventShowProgress : CatDescriptionEvents()

    object EventHideProgressAndShowContent : CatDescriptionEvents()

    object EventHideProgressAndShowSomethingWrong : CatDescriptionEvents()
}