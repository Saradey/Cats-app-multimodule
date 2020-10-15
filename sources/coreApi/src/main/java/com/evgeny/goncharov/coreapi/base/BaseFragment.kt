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
import javax.inject.Inject

abstract class BaseFragment : Fragment() {

    @Inject
    lateinit var themeManager: ThemeManager

    private var stubController = StubController()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(getLayoutId(), container, false).apply {
        stubController.rootLayout = this as ViewGroup
    }

    protected abstract fun getLayoutId(): Int

    protected fun hideKeyboard() {
        val imm =
            requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view?.windowToken, 0)
    }

    protected fun showProgress() {
        stubController.initUiState(BaseUiEvents.ShowProgress)
    }

    protected fun hideProgress() {
        stubController.initUiState(BaseUiEvents.HideProgress)
    }

    protected fun showSomethingWrong() {
        stubController.initUiState(BaseUiEvents.ShowSomethingWrong)
    }

    protected fun hideSomethingWrong() {
        stubController.initUiState(BaseUiEvents.HideSomethingWrong)
    }
}