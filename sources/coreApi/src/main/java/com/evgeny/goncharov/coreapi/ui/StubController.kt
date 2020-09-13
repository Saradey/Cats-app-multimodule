package com.evgeny.goncharov.coreapi.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.Group
import com.evgeny.goncharov.coreapi.R
import com.evgeny.goncharov.coreapi.extension.setVisibilityBool
import com.evgeny.goncharov.coreapi.ui.events.MainActivityUiEvents

class StubController {

    var rootLayout: ViewGroup? = null
        set(value) {
            field = value
            val viewStub = LayoutInflater.from(field?.context)
                .inflate(R.layout.layout_stubs, field as ViewGroup, false)
            rootLayout?.addView(viewStub)
            groupProgress = field?.findViewById(R.id.grpProgress)
            groupSomethingWrong = field?.findViewById(R.id.grpSomethingWrong)
        }
    private var groupProgress: Group? = null
    private var groupSomethingWrong: Group? = null

    fun initUiState(event: MainActivityUiEvents) {
        initState(event)
    }

    private fun initState(event: MainActivityUiEvents?) {
        when (event) {
            MainActivityUiEvents.ShowProgress -> showProgress()
            MainActivityUiEvents.HideProgress -> hideProgress()
            MainActivityUiEvents.ShowSomethingWrong -> showSomethingWrong()
            MainActivityUiEvents.HideSomethingWrong -> hideSomethingWrong()
        }
    }

    private fun showProgress() {
        groupProgress?.setVisibilityBool(true)
    }

    private fun hideProgress() {
        groupProgress?.setVisibilityBool(false)
    }

    private fun showSomethingWrong() {
        groupSomethingWrong?.setVisibilityBool(true)
    }

    private fun hideSomethingWrong() {
        groupSomethingWrong?.setVisibilityBool(false)
    }
}