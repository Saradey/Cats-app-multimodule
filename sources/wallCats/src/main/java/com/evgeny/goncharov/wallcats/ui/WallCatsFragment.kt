package com.evgeny.goncharov.wallcats.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import androidx.recyclerview.widget.LinearLayoutManager
import com.evgeny.goncharov.coreapi.WithFacade
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.extension.setVisibilityBool
import com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator
import com.evgeny.goncharov.coreapi.mediators.SettingsMediator
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import com.evgeny.goncharov.coreapi.utils.MainThreadExecutor
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.wallcats.R
import com.evgeny.goncharov.wallcats.di.components.WallCatsComponent
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import com.evgeny.goncharov.wallcats.ui.adapters.CatBreedsPagedAdapter
import com.evgeny.goncharov.wallcats.ui.adapters.DiffUtilsCatBreeds
import com.evgeny.goncharov.wallcats.ui.adapters.PageKeyedDataSourceCatBreeds
import com.evgeny.goncharov.wallcats.ui.events.WallCatsEvents
import com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder
import com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel
import kotlinx.android.synthetic.main.fragment_wall_cats.*
import java.util.concurrent.Executors
import javax.inject.Inject

class WallCatsFragment : BaseFragment(), CatBreedViewHolder.CatBreedViewHolderListener {

    companion object {
        fun getInstance() = WallCatsFragment()
    }

    @Inject
    lateinit var viewModel: WallCatsViewModel

    @Inject
    lateinit var wallCatsMediator: WallCatsMediator

    @Inject
    lateinit var searchMediator: SearchCatsMediator

    @Inject
    lateinit var settingsMediator: SettingsMediator

    private lateinit var uiLiveData: LiveData<WallCatsEvents>

    private lateinit var dataSource: PageKeyedDataSourceCatBreeds

    private var mainThreadExecutor = MainThreadExecutor()

    private lateinit var adapter: CatBreedsPagedAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDaggerGraph()
        savedInstanceState ?: viewModel.initInjection()
    }

    private fun initDaggerGraph() {
        WallCatsComponent.init((requireActivity() as WithFacade).getFacade(), this)
            .inject(this)
    }

    override fun getLayoutId(): Int = R.layout.fragment_wall_cats

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        init()
    }

    private fun init() {
        initLiveData()
        initUi()
    }

    private fun initUi() {
        initToolbar()
        initPagedAdapterAndRecycle()
        initFirstSwipeRefreshLayout()
    }

    private fun initLiveData() {
        uiLiveData = viewModel.getUiEventsLiveData()
        uiLiveData.observe(this, Observer {
            when (it) {
                WallCatsEvents.EventShowProgressAndHideStub -> {
                    hideStubSomethingWrong()
                    showProgress()
                }
                WallCatsEvents.EventSomethingWrong -> {
                    showStubSomethingWrong()
                }
                WallCatsEvents.EventHideProgressAndInitRefreshLayout -> {
                    hideProgress()
                    initSwipeRefreshLayout()
                }
            }
        })
    }

    private fun showProgress() {
        prgLoad?.setVisibilityBool(true)
    }

    private fun hideStubSomethingWrong() {
        grpStubWallCat?.setVisibilityBool(false)
    }

    private fun showStubSomethingWrong() {
        prgLoad?.setVisibilityBool(false)
        grpStubWallCat?.setVisibilityBool(true)
    }

    private fun hideProgress() {
        prgLoad?.setVisibilityBool(false)
    }

    override fun clickCatUrlBreed(urlImage: String?) {
        urlImage?.let {
            val uri = Uri.parse(urlImage)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }

    override fun clickCatBreed(id: String?) {
        id?.let {
            wallCatsMediator.goToTheScreenCatDescription(id, requireFragmentManager())
        }
    }

    private fun initFirstSwipeRefreshLayout() {
        swrlContainer.setOnRefreshListener {
            swrlContainer.isRefreshing = false
        }
    }

    private fun initSwipeRefreshLayout() {
        grpStubWallCat?.setVisibilityBool(false)
        swrlContainer.setOnRefreshListener {
            initPagedAdapterAndRecycle()
            swrlContainer.isRefreshing = false
            initFirstSwipeRefreshLayout()
        }
    }

    private fun initPagedAdapterAndRecycle() {
        adapter = CatBreedsPagedAdapter(DiffUtilsCatBreeds(), this, themeManager)
        dataSource = PageKeyedDataSourceCatBreeds(viewModel)
        val pagedConfig = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(15)
            .build()
        val pagedList = PagedList.Builder<Int, CatBreedView>(dataSource, pagedConfig)
            .setNotifyExecutor(mainThreadExecutor)
            .setFetchExecutor(Executors.newCachedThreadPool())
            .build()
        adapter.submitList(pagedList)
        rcvCatBreeds.layoutManager = LinearLayoutManager(context)
        rcvCatBreeds.adapter = adapter
    }

    private fun initToolbar() {
        toolbar.setTitle(R.string.wall_cat_toolbar_title)
        when (themeManager.getThemeNow()) {
            R.style.AppThemeDay -> toolbar.inflateMenu(R.menu.menu_wall_cats_day)
            R.style.AppThemeNight -> toolbar.inflateMenu(R.menu.menu_wall_cats_night)
        }
        toolbar.setOnMenuItemClickListener { menu ->
            when (menu.itemId) {
                R.id.menuSearchCat -> {
                    searchMediator.goToTheSearchScreen(requireFragmentManager())
                    true
                }
                R.id.menuSettings -> {
                    settingsMediator.goToTheSettingsScreen(requireFragmentManager())
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        (uiLiveData as SingleLiveEvent<WallCatsEvents>).call()
        WallCatsComponent.component = null
    }
}