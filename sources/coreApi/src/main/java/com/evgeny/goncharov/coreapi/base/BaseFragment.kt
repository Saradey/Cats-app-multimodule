package com.evgeny.goncharov.coreapi.base

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreapi.ui.UiStateController
import com.evgeny.goncharov.coreapi.ui.events.BaseUiEvents

/**
 * Базовый класс фрагмент, с базовой реализацией, должны наследовать ВСЕ фрагменты
 */
abstract class BaseFragment : Fragment() {

    /** Менеджер тем */
    protected lateinit var themeManager: ThemeManager

    /** Контроллер за состоянием экранов */
    private var stubController = UiStateController()

    /** Добавляем часто используемую заглушку */
    protected fun addStubLayout(root: View) {
        stubController.rootLayout = root as ViewGroup
    }

    /**
     * Спрятать клавиатуру
     */
    protected fun hideKeyboard() {
        val imm =
            requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view?.windowToken, 0)
    }

    /**
     * Показать прогресс
     */
    protected open fun showProgress() {
        stubController.initUiState(BaseUiEvents.ShowProgress)
    }

    /**
     * Спрятать прогресс
     */
    protected open fun hideProgress() {
        stubController.initUiState(BaseUiEvents.HideProgress)
    }

    /**
     * Показать заглушку ошибки
     */
    protected open fun showSomethingWrong() {
        stubController.initUiState(BaseUiEvents.ShowSomethingWrong)
    }

    /**
     * Спрятать заглушку ошибки
     */
    protected open fun hideSomethingWrong() {
        stubController.initUiState(BaseUiEvents.HideSomethingWrong)
    }
}