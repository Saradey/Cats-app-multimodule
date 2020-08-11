package com.evgeny.goncharov.searchcats.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.evgeny.goncharov.coreapi.extension.setHintTextColor
import com.evgeny.goncharov.coreapi.extension.setTextColor
import com.evgeny.goncharov.coreapi.extension.setVisibilityBool
import com.evgeny.goncharov.searchcats.model.CatCatched
import com.evgeny.goncharov.searchcats.ui.events.SearchCatEvents
import com.evgeny.goncharov.coreapi.WithFacade
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.searchcats.R
import com.evgeny.goncharov.searchcats.di.components.SearchCatComponent
import com.evgeny.goncharov.searchcats.ui.adapter.CatsCathedAdapter
import com.evgeny.goncharov.searchcats.view.model.SearchCatViewModel
import kotlinx.android.synthetic.main.fragment_search_cat.crvContainerCats
import kotlinx.android.synthetic.main.fragment_search_cat.prgLoad
import kotlinx.android.synthetic.main.fragment_search_cat.rcvCathedCats
import kotlinx.android.synthetic.main.fragment_search_cat.srcSearchCat
import kotlinx.android.synthetic.main.fragment_search_cat.toolbar
import kotlinx.android.synthetic.main.fragment_search_cat.txvCatsStubNotFound
import javax.inject.Inject

class SearchCatFragment : BaseFragment() {

    @Inject
    lateinit var viewModel: SearchCatViewModel

    @Inject
    lateinit var wallCatsMediator: WallCatsMediator

    private lateinit var uiLiveData: LiveData<SearchCatEvents>

    private lateinit var adapter: CatsCathedAdapter

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
        ).inject(this)
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
                SearchCatEvents.EventShowProgressAndHideStubAndHideModels -> hideStubAndListAndShowProgress()
                SearchCatEvents.EventHideProgressAndShowStub -> hideProgressAndShowStub()
                SearchCatEvents.EventHideProgressAndShowRecycleView -> hideProgressAndShowModels()
            }
        })
    }

    private fun chooseCat(id: String) {
        wallCatsMediator.goToTheScreenCatDescription(id, fragmentManager!!)
    }

    private fun initAdapterAndRecycle() {
        adapter = CatsCathedAdapter(::chooseCat)
        rcvCathedCats.layoutManager = LinearLayoutManager(context)
        rcvCathedCats.adapter = adapter
    }

    private fun initToolbar() {
        toolbar.apply {
            setNavigationIcon(R.drawable.ic_arrow_back_black)
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
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
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

    private fun setCatsCatched(models: List<CatCatched>?) {
        adapter.models = models ?: emptyList()
    }

    private fun showProgress() {
        prgLoad?.setVisibilityBool(true)
    }

    private fun hideProgress() {
        prgLoad?.setVisibilityBool(false)
    }

    override fun onDestroy() {
        super.onDestroy()
        SearchCatComponent.component = null
        hideKeyboard()
        (uiLiveData as SingleLiveEvent<SearchCatEvents>).call()
    }
}