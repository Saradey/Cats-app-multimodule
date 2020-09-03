package com.evgeny.goncharov.wallcats.ui.events

sealed class WallCatsEvents {

    object EventShowProgressAndHideStub : WallCatsEvents()

    object EventSomethingWrong : WallCatsEvents()

    object EventHideProgressAndInitRefreshLayout : WallCatsEvents()

}