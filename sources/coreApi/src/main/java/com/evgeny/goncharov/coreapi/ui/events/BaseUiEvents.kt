package com.evgeny.goncharov.coreapi.ui.events

sealed class BaseUiEvents {

    object ShowProgress : BaseUiEvents()

    object HideProgress : BaseUiEvents()

    object ShowSomethingWrong : BaseUiEvents()

    object HideSomethingWrong : BaseUiEvents()

}