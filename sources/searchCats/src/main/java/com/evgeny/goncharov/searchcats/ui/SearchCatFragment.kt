package com.evgeny.goncharov.searchcats.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.extension.setHintTextColor
import com.evgeny.goncharov.coreapi.extension.setTextColor
import com.evgeny.goncharov.coreapi.extension.setVisibilityBool
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.searchcats.R
import com.evgeny.goncharov.searchcats.di.components.SearchCatComponent
import com.evgeny.goncharov.searchcats.model.CatCatch
import com.evgeny.goncharov.searchcats.ui.adapter.CatsCatchAdapter
import com.evgeny.goncharov.searchcats.ui.events.SearchCatUiEvents
import com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel
import kotlinx.android.synthetic.main.fragment_search_cat.crvContainerCats
import kotlinx.android.synthetic.main.fragment_search_cat.rcvCathedCats
import kotlinx.android.synthetic.main.fragment_search_cat.srcSearchCat
import kotlinx.android.synthetic.main.fragment_search_cat.toolbar
import kotlinx.android.synthetic.main.fragment_search_cat.txvCatsStubNotFound

/**
 * Фрагмент поиска котов
 */
class SearchCatFragment : BaseFragment() {

    /** ВьюМодель поиска котов */
    private lateinit var viewModel: SearchCatViewModel

    /** Для запуска стены котов */
    private lateinit var wallCatsMediator: WallCatsMediator

    /** Отдает ui эвенты */
    private lateinit var uiLiveData: LiveData<SearchCatUiEvents>

    /** Для управления список искомых котов */
    private lateinit var adapter: CatsCatchAdapter

    companion object {

        fun getInstance() = SearchCatFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDaggerGraph()
        savedInstanceState ?: viewModel.initInject()
        initLiveData()
    }

    private fun initDaggerGraph() {
        SearchCatComponent.init(
            this,
            (requireActivity() as WithFacade).getFacade()
        ).apply {
            viewModel = provideSearchCatViewModel()
            wallCatsMediator = provideWallCatsMediator()
            themeManager = provideThemeManager()
        }
    }

    override fun getLayoutId() = R.layout.fragment_search_cat

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initUi()
    }

    private fun initUi() {
        initAdapterAndRecycle()
        initToolbar()
        initSearchView()
    }

    private fun initLiveData() {
        initUiEvents()
        initCatsCathed()
    }

    private fun initCatsCathed() {
        viewModel.getLiveDataCatsCathed().observe(this, Observer {
            setCatsCatched(it)
        })
    }

    private fun initUiEvents() {
        uiLiveData = viewModel.getUiEventsLiveData()
        uiLiveData.observe(this, Observer {
            when (it) {
                SearchCatUiEvents.EventShowProgressAndHideStubAndHideModels -> hideStubAndListAndShowProgress()
                SearchCatUiEvents.EventHideProgressAndShowStub -> hideProgressAndShowStub()
                SearchCatUiEvents.EventHideProgressAndShowRecycleView -> hideProgressAndShowModels()
            }
        })
    }

    /** Выбрали кота, делаем переход в на экран описание кота */
    private fun chooseCat(id: String) {
        wallCatsMediator.goToTheScreenCatDescription(id, fragmentManager!!)
    }

    private fun initAdapterAndRecycle() {
        adapter = CatsCatchAdapter(::chooseCat)
        rcvCathedCats.layoutManager = LinearLayoutManager(context)
        rcvCathedCats.adapter = adapter
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

    private fun hideStubAndListAndShowProgress() {
        crvContainerCats.setVisibilityBool(false)
        txvCatsStubNotFound.setVisibilityBool(false)
        showProgress()
    }

    private fun hideProgressAndShowStub() {
        txvCatsStubNotFound.setVisibilityBool(true)
        hideProgress()
    }

    private fun hideProgressAndShowModels() {
        hideProgress()
        crvContainerCats.setVisibilityBool(true)
    }

    private fun setCatsCatched(models: List<CatCatch>?) {
        adapter.submitList(models ?: emptyList())
    }

    override fun onDestroy() {
        super.onDestroy()
        SearchCatComponent.component = null
        hideKeyboard()
        (uiLiveData as SingleLiveEvent<SearchCatUiEvents>).call()
    }
}