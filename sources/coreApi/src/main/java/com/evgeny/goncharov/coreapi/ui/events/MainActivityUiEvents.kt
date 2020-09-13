package com.evgeny.goncharov.coreapi.ui.events

sealed class MainActivityUiEvents {

    object ShowProgress : MainActivityUiEvents()

    object HideProgress : MainActivityUiEvents()

    object ShowSomethingWrong : MainActivityUiEvents()

    object HideSomethingWrong : MainActivityUiEvents()

}