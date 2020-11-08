package com.evgeny.goncharov.wallcats.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.paging.PagedList
import androidx.recyclerview.widget.LinearLayoutManager
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.activity.contracts.WithProviders
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.mediators.SearchCatsMediator
import com.evgeny.goncharov.coreapi.mediators.SettingsMediator
import com.evgeny.goncharov.coreapi.mediators.WallCatsMediator
import com.evgeny.goncharov.coreapi.utils.MainThreadExecutor
import com.evgeny.goncharov.wallcats.R
import com.evgeny.goncharov.wallcats.di.components.WallCatsComponent
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import com.evgeny.goncharov.wallcats.ui.adapters.CatBreedsPagedAdapter
import com.evgeny.goncharov.wallcats.ui.adapters.DiffUtilsCatBreeds
import com.evgeny.goncharov.wallcats.ui.adapters.PageKeyedDataSourceCatBreeds
import com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder
import com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel
import kotlinx.android.synthetic.main.fragment_wall_cats.rcvCatBreeds
import kotlinx.android.synthetic.main.fragment_wall_cats.swrlContainer
import kotlinx.android.synthetic.main.fragment_wall_cats.toolbar
import java.util.concurrent.Executors

/**
 * Экран стены котов
 */
class WallCatsFragment : BaseFragment(),
    CatBreedViewHolder.CatBreedViewHolderListener {

    companion object {

        fun getInstance() = WallCatsFragment()
    }

    /** Вьюмодель стены котов */
    private lateinit var viewModel: WallCatsViewModel

    /** Для перехода на экран описание кота */
    private lateinit var wallCatsMediator: WallCatsMediator

    /** Для перехода на экран поиска котов */
    private lateinit var searchMediator: SearchCatsMediator

    /** Для перехода на экран настроек */
    private lateinit var settingsMediator: SettingsMediator

    /** Для пангинации списка котов */
    private lateinit var dataSource: PageKeyedDataSourceCatBreeds

    /** Для осуществление пангинации */
    private var mainThreadExecutor = MainThreadExecutor()

    /** Для управления холдерами списка стены котов */
    private lateinit var adapter: CatBreedsPagedAdapter

    private fun initDaggerGraph() {
        WallCatsComponent.getByLazy(
            (requireActivity() as WithFacade).getFacade(),
            (requireActivity() as WithProviders).getProviderAndroidComponent()
        )
            .apply {
                viewModel = provideWallCatsViewModel()
                wallCatsMediator = provideWallCatsMediator()
                searchMediator = provideSearchCatsMediator()
                settingsMediator = provideSettingMediator()
                themeManager = provideThemeManager()
            }
    }

    override fun getLayoutId(): Int = R.layout.fragment_wall_cats

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initDaggerGraph()
        savedInstanceState ?: viewModel.initInjection()
        init()
    }

    private fun init() {
        initLiveData()
        initUi()
    }

    private fun initUi() {
        initToolbar()
        initPagedAdapterAndRecycle()
        initSwipeRefreshLayout()
    }

    private fun initLiveData() {
        viewModel.liveDataUiEvents.observe(this, ::changeUiState)
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

    private fun initSwipeRefreshLayout() {
        swrlContainer.setOnRefreshListener {
            initPagedAdapterAndRecycle()
            swrlContainer.isRefreshing = false
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
        viewModel.liveDataUiEvents.call()
    }
}