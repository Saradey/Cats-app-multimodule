package com.evgeny.goncharov.coreapi.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.Group
import com.evgeny.goncharov.coreapi.R
import com.evgeny.goncharov.coreapi.extension.setVisibilityBool
import com.evgeny.goncharov.coreapi.ui.events.BaseUiEvents
import com.evgeny.goncharov.uikit.ProgressCat

/**
 * Контроллер над состоянием ui (показываем крутилу, показываем заглушку ошибки)
 */
class StubController {

    /** Корневой макет всех фрагментов, добавляем ему макет состояний экрана */
    var rootLayout: ViewGroup? = null
        set(value) {
            field = value
            val viewStub = LayoutInflater.from(field?.context)
                .inflate(R.layout.layout_stubs, field as ViewGroup, false)
            rootLayout?.addView(viewStub)
            groupProgress = field?.findViewById(R.id.grpProgress)
            groupSomethingWrong = field?.findViewById(R.id.grpSomethingWrong)
            progress = field?.findViewById(R.id.prgLoad)
        }

    /** Группа для отображения вьюх прогресса */
    private var groupProgress: Group? = null

    /** Группа для отображения вьюх заглушки в случае ошибки */
    private var groupSomethingWrong: Group? = null

    /** Кастомная вьюха для запуска анимации загрузки */
    private var progress: ProgressCat? = null

    /**
     * Иницилизация состояния экрана
     * @param event эвент по которому нужно иницилизировать состояние
     */
    fun initUiState(event: BaseUiEvents) {
        initState(event)
    }

    private fun initState(event: BaseUiEvents?) {
        when (event) {
            BaseUiEvents.ShowProgress -> showProgress()
            BaseUiEvents.HideProgress -> hideProgress()
            BaseUiEvents.ShowSomethingWrong -> showSomethingWrong()
            BaseUiEvents.HideSomethingWrong -> hideSomethingWrong()
        }
    }

    private fun showProgress() {
        groupProgress?.setVisibilityBool(true)
        progress?.startAnimation()
    }

    private fun hideProgress() {
        groupProgress?.setVisibilityBool(false)
        progress?.stopAnimation()
    }

    private fun showSomethingWrong() {
        groupSomethingWrong?.setVisibilityBool(true)
    }

    private fun hideSomethingWrong() {
        groupSomethingWrong?.setVisibilityBool(false)
    }
}