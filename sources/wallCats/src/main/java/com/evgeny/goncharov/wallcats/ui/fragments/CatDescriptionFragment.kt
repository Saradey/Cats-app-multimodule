package com.evgeny.goncharov.wallcats.ui.fragments

import android.content.Intent
import android.graphics.drawable.Animatable
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.activity.contracts.WithProviders
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.base.BaseUiEvent
import com.evgeny.goncharov.coreapi.utils.ViewModelProviderFactory
import com.evgeny.goncharov.coreapi.utils.getDrawableTheme
import com.evgeny.goncharov.coreapi.utils.withArgs
import com.evgeny.goncharov.wallcats.R
import com.evgeny.goncharov.wallcats.R.string
import com.evgeny.goncharov.wallcats.databinding.FragmentCatDescriptionBinding
import com.evgeny.goncharov.wallcats.di.components.WallCatsComponent
import com.evgeny.goncharov.wallcats.model.view.CatDescriptionEntity
import com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel

/**
 * Экран описания кота
 */
class CatDescriptionFragment : BaseFragment() {

    /** Биндинг View экрана описания кота */
    private lateinit var binder: FragmentCatDescriptionBinding

    /** Компонент фитчи стены котов */
    private val component: WallCatsComponent by lazy {
        WallCatsComponent.getByLazy(
            (requireActivity() as WithFacade).getFacade(),
            (requireActivity() as WithProviders).getProviderAndroidComponent()
        )
    }

    /** Вьюмодель экрана описания кота */
    private val viewModel: CatDescriptionViewModel by lazy {
        ViewModelProvider(this, ViewModelProviderFactory {
            CatDescriptionViewModel(
                component.provideDescriptionInteractor(),
                component.provideNetworkManager()
            )
        }).get(CatDescriptionViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binder = FragmentCatDescriptionBinding.inflate(inflater, container, false)
        addStubLayout(binder.root)
        return binder.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initDaggerGraph()
        loadOrInit(savedInstanceState)
        initLiveData()
        initUi()
    }

    private fun loadOrInit(savedInstanceState: Bundle?) {
        savedInstanceState ?: run {
            viewModel.setCatId(arguments?.getString(KEY_ID_CAT) ?: "")
        }
        viewModel.loadChooseCat()
    }

    private fun initDaggerGraph() {
        themeManager = component.provideThemeManager()
    }

    private fun initUi() {
        initToolbar()
    }

    private fun initLiveData() {
        viewModel.liveDataUiEvents.observe(this, Observer { changeUiState(it) })
    }

    private fun initToolbar() {
        binder.toolbar.apply {
            setOnMenuItemClickListener(::onClickShareButton)
            setNavigationOnClickListener(::onClickNavigation)
        }
    }

    private fun onClickNavigation(view: View) {
        requireFragmentManager().popBackStack()
    }

    private fun onClickShareButton(menu: MenuItem): Boolean {
        startActivity(createChooseIntent())
        return true
    }

    private fun createChooseIntent() =
        Intent.createChooser(
            Intent(Intent.ACTION_SEND)
                .setType(TYPE_INTENT)
                .putExtra(Intent.EXTRA_TEXT, buildExtraText()),
            resources.getString(string.share_cat_title)
        )

    private fun buildExtraText(): String = StringBuilder()
        .append(binder.txvNameCat.text)
        .append("\n")
        .append(binder.txvOrigin.text)
        .append("\n")
        .append(binder.txvDescription.text)
        .toString()

    private fun setCatDescription(model: CatDescriptionEntity) {
        model.let {
            binder.apply {
                txvNameCat.text = resources.getString(string.name_cat_title, model.name)
                txvOrigin.text = resources.getString(string.origin_cat_title, model.origin)
                txvWeight.text = resources.getString(string.weight_cat_title, model.weight)
                txvLifeSpan.text = resources.getString(string.life_span_cat_title, model.lifeSpan)
                txvTemperament.text =
                    resources.getString(string.temperament_cat_title, model.temperament)
                txvDescription.text =
                    resources.getString(string.description_cat_title, model.description)
                mbtnWikiLink.setOnClickListener {
                    val uri = Uri.parse(model.urlWiki)
                    val intent = Intent(Intent.ACTION_VIEW, uri)
                    startActivity(intent)
                }
                val animatedDrawable = getDrawableTheme(
                    R.drawable.day_shimmer_drawable,
                    R.drawable.night_shimmer_drawable,
                    themeManager,
                    resources
                )
                (animatedDrawable as Animatable).start()
                Glide.with(this@CatDescriptionFragment)
                    .load(model.urlImage)
                    .placeholder(animatedDrawable)
                    .centerCrop()
                    .into(imvCat)
            }
        }
    }

    private fun changeUiState(event: BaseUiEvent<CatDescriptionEntity>?) {
        when (event) {
            BaseUiEvent.EventShowProgress -> showProgress()
            is BaseUiEvent.Success -> {
                hideProgress()
                binder.grpAllContent.isGone = false
                setCatDescription(event.data)
            }
            BaseUiEvent.EventSomethingWrong -> {
                hideProgress()
                binder.grpAllContent.isGone = true
                showSomethingWrong()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.liveDataUiEvents.call()
    }

    companion object {

        private const val TYPE_INTENT = "text/plain"
        private const val KEY_ID_CAT = "KEY_ID_CAT"

        fun getInstance(idCat: String?) = CatDescriptionFragment().withArgs {
            putString(KEY_ID_CAT, idCat)
        }
    }
}