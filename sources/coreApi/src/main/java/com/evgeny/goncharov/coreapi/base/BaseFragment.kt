package com.evgeny.goncharov.coreapi.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.coreapi.ui.StubController
import com.evgeny.goncharov.coreapi.ui.events.BaseUiEvents

/**
 * Базовый класс фрагмент, с базовой реализацией, должны наследовать ВСЕ фрагменты
 */
abstract class BaseFragment : Fragment() {

    /** Менеджер тем */
    protected lateinit var themeManager: ThemeManager

    /** Контроллер за состоянием экранов */
    private var stubController = StubController()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(getLayoutId(), container, false).apply {
        stubController.rootLayout = this as ViewGroup
    }

    /**
     * Возвращает id layout наследуемого фрагмента
     */
    protected abstract fun getLayoutId(): Int

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
    protected fun showProgress() {
        stubController.initUiState(BaseUiEvents.ShowProgress)
    }

    /**
     * Спрятать прогресс
     */
    protected fun hideProgress() {
        stubController.initUiState(BaseUiEvents.HideProgress)
    }

    /**
     * Показать заглушку ошибки
     */
    protected fun showSomethingWrong() {
        stubController.initUiState(BaseUiEvents.ShowSomethingWrong)
    }

    /**
     * Спрятать заглушку ошибки
     */
    private fun hideSomethingWrong() {
        stubController.initUiState(BaseUiEvents.HideSomethingWrong)
    }

    /**
     * Метод смены ui состояния
     * @param event состояние ui
     */
    protected fun changeUiState(event: BaseUiEvent?) {
        when (event) {
            BaseUiEvent.EventShowProgress -> showProgress()
            BaseUiEvent.EventSomethingWrong -> showSomethingWrong()
            BaseUiEvent.EventHideProgress -> hideProgress()
            BaseUiEvent.EventHideSomethingWrong -> hideSomethingWrong()
            BaseUiEvent.EventShowContent -> showContent()
        }
    }

    /**
     * Метод для переопределния, показать контент
     */
    open fun showContent() {}
}