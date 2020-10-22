package com.evgeny.goncharov.wallcats.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.extension.setVisibilityBool
import com.evgeny.goncharov.coreapi.utils.SingleLiveEvent
import com.evgeny.goncharov.wallcats.R
import com.evgeny.goncharov.wallcats.di.components.CatDescriptionComponent
import com.evgeny.goncharov.wallcats.model.view.CatDescription
import com.evgeny.goncharov.wallcats.ui.events.CatDescriptionEvents
import com.evgeny.goncharov.wallcats.view.model.CatDescriptionViewModel
import kotlinx.android.synthetic.main.fragment_cat_description.grpAllContent
import kotlinx.android.synthetic.main.fragment_cat_description.imvCat
import kotlinx.android.synthetic.main.fragment_cat_description.mbtnWikiLink
import kotlinx.android.synthetic.main.fragment_cat_description.toolbar
import kotlinx.android.synthetic.main.fragment_cat_description.txvDescription
import kotlinx.android.synthetic.main.fragment_cat_description.txvLifeSpan
import kotlinx.android.synthetic.main.fragment_cat_description.txvNameCat
import kotlinx.android.synthetic.main.fragment_cat_description.txvOrigin
import kotlinx.android.synthetic.main.fragment_cat_description.txvTemperament
import kotlinx.android.synthetic.main.fragment_cat_description.txvWeight
import javax.inject.Inject

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
    @Inject
    lateinit var viewModel: CatDescriptionViewModel

    /** id выбранного кота */
    private var catId: String? = null

    /** Шлет ui эвенты */
    private lateinit var uiLiveData: LiveData<CatDescriptionEvents>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDaggerGraph()
        loadOrInit(savedInstanceState)
    }

    private fun loadOrInit(savedInstanceState: Bundle?) {
        savedInstanceState ?: run {
            viewModel.initInjection()
            viewModel.setCatId(catId ?: "")
        }
        viewModel.loadChooseCat()
    }

    private fun initDaggerGraph() {
        CatDescriptionComponent.init(
            (requireActivity() as WithFacade).getFacade(),
            this
        ).inject(this)
    }

    override fun getLayoutId(): Int = R.layout.fragment_cat_description

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initUi()
        initLiveData()
    }

    private fun initUi() {
        initToolbar()
    }

    private fun initLiveData() {
        initUiEventsLiveData()
        initCatDescriptionLiveData()
    }

    private fun initCatDescriptionLiveData() {
        viewModel.getCatDescriptionLiveData().observe(this, Observer {
            setCatDescription(it)
        })
    }

    private fun initUiEventsLiveData() {
        uiLiveData = viewModel.getLiveDataUiEvents()
        uiLiveData.observe(this, Observer {
            when (it) {
                CatDescriptionEvents.EventShowProgress -> showProgress()
                CatDescriptionEvents.EventHideProgressAndShowContent -> showAllContent()
                CatDescriptionEvents.EventHideProgressAndShowSomethingWrong -> showStubSomethingWrong()
            }
        })
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
            setTitle(R.string.description_cat_title_toolbar)
        }
    }

    private fun setCatDescription(model: CatDescription?) {
        model?.let {
            txvNameCat.text = resources.getString(R.string.name_cat_title, model.name)
            txvOrigin.text = resources.getString(R.string.origin_cat_title, model.origin)
            txvWeight.text = resources.getString(R.string.weight_cat_title, model.weight)
            txvLifeSpan.text = resources.getString(R.string.life_span_cat_title, model.lifeSpan)
            txvTemperament.text =
                resources.getString(R.string.temperament_cat_title, model.temperament)
            txvDescription.text =
                resources.getString(R.string.description_cat_title, model.description)
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

    private fun showAllContent() {
        hideProgress()
        grpAllContent.setVisibilityBool(true)
    }

    private fun showStubSomethingWrong() {
        showSomethingWrong()
    }

    override fun onDestroy() {
        super.onDestroy()
        CatDescriptionComponent.component = null
        (uiLiveData as SingleLiveEvent<CatDescriptionEvents>).call()
    }
}