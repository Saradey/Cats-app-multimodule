package com.evgeny.goncharov.wallcats.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.paging.PagedList
import androidx.recyclerview.widget.LinearLayoutManager
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.activity.contracts.WithProviders
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.base.BaseUiEvent
import com.evgeny.goncharov.coreapi.utils.MainThreadExecutor
import com.evgeny.goncharov.coreapi.utils.ViewModelProviderFactory
import com.evgeny.goncharov.domain.SortTypeViewModel
import com.evgeny.goncharov.wallcats.R
import com.evgeny.goncharov.wallcats.databinding.FragmentWallCatsBinding
import com.evgeny.goncharov.wallcats.di.components.WallCatsComponent
import com.evgeny.goncharov.wallcats.managers.NavigationWallCatsManager
import com.evgeny.goncharov.wallcats.managers.WorkScheduleManager
import com.evgeny.goncharov.wallcats.ui.adapters.CatBreedsPagedAdapter
import com.evgeny.goncharov.wallcats.ui.adapters.PageKeyedDataSourceCatBreeds
import com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder
import com.evgeny.goncharov.wallcats.view.model.WallCatsViewModel
import java.util.concurrent.Executors

/**
 * Экран стены котов
 */
class WallCatsFragment : BaseFragment(),
    CatBreedViewHolder.CatBreedViewHolderListener {

    /** Для пангинации списка котов */
    private lateinit var dataSource: PageKeyedDataSourceCatBreeds

    /** Для осуществление пангинации */
    private var mainThreadExecutor = MainThreadExecutor()

    /** Для управления холдерами списка стены котов */
    private lateinit var adapter: CatBreedsPagedAdapter

    /** Получаем события о том что нужно обновить стену котов */
    private lateinit var vmSort: SortTypeViewModel

    /** Шедулер для запуска запланированных задач */
    private lateinit var workSchedulerManager: WorkScheduleManager

    /** Менеджер отвечающий за навигацию на экране стены котов */
    private lateinit var navigationManager: NavigationWallCatsManager

    /** Биндинг View экрана стены котов */
    private lateinit var binder: FragmentWallCatsBinding

    private val component: WallCatsComponent by lazy {
        WallCatsComponent.getByLazy(
            (requireActivity() as WithFacade).getFacade(),
            (requireActivity() as WithProviders).getProviderAndroidComponent()
        )
    }

    /** Вьюмодель стены котов */
    private val viewModel: WallCatsViewModel by lazy {
        ViewModelProvider(
            this, ViewModelProviderFactory {
                WallCatsViewModel(
                    component.provideInteractor(),
                    component.provideNetworkManager()
                )
            }
        ).get(WallCatsViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binder = FragmentWallCatsBinding.inflate(inflater, container, false)
        addStubLayout(binder.root)
        return binder.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initDaggerGraph()
        init()
        workSchedulerManager.cancelWorksCheckOutUser()
    }

    private fun initDaggerGraph() {
        component.apply {
            navigationManager = provideNavigationWallCatsManager()
            themeManager = provideThemeManager()
            vmSort = provideSortViewModel()
            workSchedulerManager = provideWorkScheduleManager()
        }
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
        viewModel.liveDataUiEvents.observe(this, Observer { changeUiState(it) })
        vmSort.updateChooseSortType.observe(this, Observer { updateWallCats(it) })
    }

    private fun updateWallCats(isUpdate: Boolean?) {
        if (isUpdate == true) {
            initPagedAdapterAndRecycle()
        }
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
            navigationManager.goToTheScreenCatDescription(id, requireFragmentManager())
        }
    }

    private fun initSwipeRefreshLayout() {
        binder.swrlContainer.setOnRefreshListener {
            initPagedAdapterAndRecycle()
            binder.swrlContainer.isRefreshing = false
        }
    }

    private fun initPagedAdapterAndRecycle() {
        adapter = CatBreedsPagedAdapter(this, themeManager)
        dataSource = PageKeyedDataSourceCatBreeds(viewModel)
        val pagedConfig = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(PAGE_WALL_CATS_SIZE)
            .build()
        val pagedList = PagedList.Builder(dataSource, pagedConfig)
            .setNotifyExecutor(mainThreadExecutor)
            .setFetchExecutor(Executors.newCachedThreadPool())
            .build()
        adapter.submitList(pagedList)
        binder.rcvCatBreeds.layoutManager = LinearLayoutManager(context)
        binder.rcvCatBreeds.adapter = adapter
    }

    private fun initToolbar() {
        binder.toolbar.setOnMenuItemClickListener { menu ->
            when (menu.itemId) {
                R.id.menuSearchCat -> {
                    navigationManager.goToTheSearchScreen(requireFragmentManager())
                    true
                }
                R.id.menuSettings -> {
                    navigationManager.goToTheSettingsScreen(requireFragmentManager())
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun changeUiState(event: BaseUiEvent<*>?) {
        when (event) {
            BaseUiEvent.EventShowProgress -> {
                hideSomethingWrong()
                showProgress()
            }
            is BaseUiEvent.Success<*> -> {
                hideProgress()
                binder.rcvCatBreeds.isGone = false
            }
            BaseUiEvent.EventSomethingWrong -> {
                binder.rcvCatBreeds.isGone = true
                hideProgress()
                showSomethingWrong()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.liveDataUiEvents.call()
        vmSort.updateChooseSortType.call()
        workSchedulerManager.startWorksCheckOutUser()
        WallCatsComponent.component = null
    }

    companion object {

        fun getInstance() = WallCatsFragment()

        /** Загружаемая страница котят */
        private const val PAGE_WALL_CATS_SIZE = 15
    }
}