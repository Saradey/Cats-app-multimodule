package com.evgeny.goncharov.wallcats.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.activity.contracts.WithProviders
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.wallcats.R
import com.evgeny.goncharov.wallcats.R.string
import com.evgeny.goncharov.wallcats.di.components.WallCatsComponent
import com.evgeny.goncharov.wallcats.model.view.CatDescription
import com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel
import kotlinx.android.synthetic.main.fragment_cat_description.*

/**
 * Экран описания кота
 */
class CatDescriptionFragment : BaseFragment() {

    companion object {

        fun getInstance(idCat: String?) = CatDescriptionFragment().apply {
            setCatId(idCat ?: "")
        }
    }

    /** Вьюмодель экрана описания кота */
    private lateinit var viewModel: CatDescriptionViewModel

    /** id выбранного кота */
    private var catId: String? = null

    private fun loadOrInit(savedInstanceState: Bundle?) {
        savedInstanceState ?: run {
            viewModel.initInjection()
            viewModel.setCatId(catId ?: "")
        }
        viewModel.loadChooseCat()
    }

    private fun initDaggerGraph() {
        WallCatsComponent.getByLazy(
            (requireActivity() as WithFacade).getFacade(),
            (requireActivity() as WithProviders).getProviderAndroidComponent()
        ).apply {
            themeManager = provideThemeManager()
        }
    }

    override fun getLayoutId() = R.layout.fragment_cat_description

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProviders.of(this).get(CatDescriptionViewModel::class.java)
        initDaggerGraph()
        loadOrInit(savedInstanceState)
        initLiveData()
        initUi()
    }

    private fun initUi() {
        initToolbar()
    }

    private fun initLiveData() {
        viewModel.liveDataUiEvents.observe(this, ::changeUiState)
        viewModel.catDescriptionLiveData.observe(this, ::setCatDescription)
    }

    fun setCatId(catId: String) {
        this.catId = catId
    }

    private fun initToolbar() {
        toolbar.apply {
            when (themeManager.getThemeNow()) {
                R.style.AppThemeDay -> setNavigationIcon(R.drawable.ic_arrow_back_black)
                R.style.AppThemeNight -> setNavigationIcon(R.drawable.ic_arrow_back_black_night)
            }
            setNavigationOnClickListener {
                requireFragmentManager().popBackStack()
            }
            setTitle(string.description_cat_title_toolbar)
        }
    }

    private fun setCatDescription(model: CatDescription?) {
        model?.let {
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
            Glide.with(this)
                .load(model.urlImage)
                .centerCrop()
                .into(imvCat)
        }
    }

    override fun showContent() {
        grpAllContent.isVisible = true
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.liveDataUiEvents.call()
    }
}