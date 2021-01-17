package com.evgeny.goncharov.searchcats.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.core.view.isGone
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.base.BaseUiEvent
import com.evgeny.goncharov.coreapi.extension.setHintTextColor
import com.evgeny.goncharov.coreapi.extension.setTextColor
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import com.evgeny.goncharov.coreapi.utils.ViewModelProviderFactory
import com.evgeny.goncharov.searchcats.R
import com.evgeny.goncharov.searchcats.di.components.SearchCatComponent
import com.evgeny.goncharov.searchcats.model.CatCatch
import com.evgeny.goncharov.searchcats.ui.adapter.CatsCatchAdapter
import com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel
import kotlinx.android.synthetic.main.fragment_search_cat.*

/**
 * Фрагмент поиска котов
 */
class SearchCatFragment : BaseFragment() {

    /**
     * Компонент стены поиска котов
     */
    private val component: SearchCatComponent by lazy {
        SearchCatComponent.init(
            this,
            (requireActivity() as WithFacade).getFacade()
        )
    }

    /** Вьюмодель поиска котов */
    private val viewModel: SearchCatViewModel by lazy {
        ViewModelProvider(
            this, ViewModelProviderFactory {
                SearchCatViewModel(component.provideSearchCatInteractor())
            }
        ).get(SearchCatViewModel::class.java)
    }

    /** Для запуска стены котов */
    private lateinit var wallCatsMediator: WallCatsMediator

    /** Для управления список искомых котов */
    private lateinit var adapter: CatsCatchAdapter

    override fun getLayoutId() = R.layout.fragment_search_cat

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initDaggerGraph()
        initLiveData()
        initUi()
    }

    private fun initDaggerGraph() {
        themeManager = component.provideThemeManager()
        wallCatsMediator = component.provideWallCatsMediator()
    }

    private fun initUi() {
        initAdapterAndRecycle()
        initToolbar()
        initSearchView()
    }

    private fun initLiveData() {
        viewModel.liveDataUiEvents.observe(this, ::changeUiState)
    }

    /** Выбрали кота, делаем переход в на экран описание кота */
    private fun chooseCat(id: String) {
        wallCatsMediator.goToTheScreenCatDescriptionReplace(id, requireFragmentManager())
    }

    private fun initAdapterAndRecycle() {
        adapter = CatsCatchAdapter(::chooseCat)
        rcvCathedCats.layoutManager = LinearLayoutManager(context)
        rcvCathedCats.adapter = adapter
        rcvCathedCats.itemAnimator = null
    }

    private fun initToolbar() {
        toolbar.apply {
            when (themeManager.getThemeNow()) {
                R.style.AppThemeDay -> setNavigationIcon(R.drawable.ic_arrow_back_black)
                R.style.AppThemeNight -> setNavigationIcon(R.drawable.ic_arrow_back_black_night)
            }
            setNavigationOnClickListener {
                activity?.supportFragmentManager?.popBackStack()
            }
            setTitle(R.string.title_toolbar_search_cat)
        }
    }

    private fun initSearchView() {
        srcSearchCat.onActionViewExpanded()
        srcSearchCat.setOnQueryTextListener(
            object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?) = true
                override fun onQueryTextChange(newText: String?): Boolean {
                    viewModel.setInputTextSearchView(newText ?: "")
                    return true
                }
            }
        )
        initEditTextSearchView(srcSearchCat)
    }

    private fun initEditTextSearchView(searchView: SearchView) {
        if (themeManager.getThemeNow() == R.style.AppThemeDay) {
            searchView.setHintTextColor(R.color.color_dark_grey_hint)
        } else {
            searchView.setHintTextColor(R.color.white_hint)
            searchView.setTextColor(R.color.white)
        }
    }

    private fun setCatsCatched(models: List<CatCatch>?) = adapter.submitList(models ?: emptyList())

    override fun showSomethingWrong() {
        txvCatsStubNotFound.isGone = false
    }

    override fun hideSomethingWrong() {
        txvCatsStubNotFound.isGone = true
    }

    private fun changeUiState(event: BaseUiEvent<List<CatCatch>>?) {
        when (event) {
            BaseUiEvent.EventShowProgress -> {
                hideSomethingWrong()
                showProgress()
            }
            BaseUiEvent.EventHideProgress -> {
                hideProgress()
            }
            is BaseUiEvent.Success -> {
                crvContainerCats.isGone = false
                setCatsCatched(event.data)
            }
            BaseUiEvent.EventSomethingWrong -> {
                crvContainerCats.isGone = true
                showSomethingWrong()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        SearchCatComponent.component = null
        viewModel.liveDataUiEvents.call()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        hideKeyboard()
    }

    companion object {

        fun getInstance() = SearchCatFragment()
    }
}