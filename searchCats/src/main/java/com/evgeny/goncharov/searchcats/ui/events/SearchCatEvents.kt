package com.evgeny.goncharov.searchcats.ui.events

sealed class SearchCatEvents {

    object EventShowProgressAndHideStubAndHideModels : SearchCatEvents()

    object EventHideProgressAndShowStub : SearchCatEvents()

    object EventHideProgressAndShowRecycleView : SearchCatEvents()
}