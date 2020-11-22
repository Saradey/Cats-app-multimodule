package com.evgeny.goncharov.settings.ui

import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.core.text.set
import androidx.lifecycle.Observer
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.settings.R
import com.evgeny.goncharov.settings.di.components.SettingsComponent
import com.evgeny.goncharov.settings.events.SettingUiEvents
import com.evgeny.goncharov.settings.models.ThemeModel
import com.evgeny.goncharov.settings.view.model.SettingsViewModel
import kotlinx.android.synthetic.main.fragment_settings.toolbar
import kotlinx.android.synthetic.main.fragment_settings.txvLanguageApp
import kotlinx.android.synthetic.main.fragment_settings.txvSortParameter
import kotlinx.android.synthetic.main.fragment_settings.txvThemeApp

/**
 * Экран настроек
 */
class SettingsFragment : BaseFragment() {

    companion object {

        fun getInstance() = SettingsFragment()
    }

    /** ВьюМодель экрана настроек */
    private lateinit var viewModel: SettingsViewModel

    override fun getLayoutId(): Int = R.layout.fragment_settings

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDaggerGraph()
        savedInstanceState ?: viewModel.initInjection()
        init()
    }

    private fun initDaggerGraph() {
        SettingsComponent.init(
            this,
            (requireActivity() as WithFacade).getFacade()
        ).apply {
            viewModel = provideSettingsViewModel()
            themeManager = provideThemeManager()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initUi()
    }

    private fun initUi() {
        initToolbar()
        initClickThemeApp()
        initClickLanguageChoose()
        initClickSortType()
    }

    private fun init() {
        initLiveData()
        viewModel.initThemeToView()
        viewModel.initLanguageToView()
        viewModel.initSortType()
    }

    private fun initLiveData() {
        viewModel.themeLiveDataModel.observe(this, Observer { initTheme(it) })
        viewModel.languageLiveData.observe(this, Observer { initLanguage(it) })
        viewModel.uiLiveDataEvent.observe(this, Observer { updateUiEvent(it) })
        viewModel.sortTypeLiveData.observe(this, Observer { initSorTypeTextView(it) })
    }

    private fun initSorTypeTextView(type: SortType) {
        when (type) {
            SortType.SortName -> initSort(R.string.sort_by_name)
            SortType.SortLifeSpan -> initSort(R.string.sort_by_life_span)
            SortType.SortWeight -> initSort(R.string.sort_by_wight)
        }
    }

    private fun initSort(@StringRes sortTitle: Int) {
        when (viewModel.themeLiveDataModel.value?.themeValue) {
            R.style.AppThemeNight -> initThemeSort(sortTitle, R.drawable.ic_sort_light)
            R.style.AppThemeDay -> initThemeSort(sortTitle, R.drawable.ic_sort_night)
        }
    }

    private fun initThemeSort(@StringRes sortSubTitle: Int, @DrawableRes idDrawable: Int) {
        initSpannableTextView(
            title = R.string.sort_mine_title,
            subTitle = sortSubTitle,
            drawStart = idDrawable,
            textView = txvSortParameter
        )
    }

    private fun updateUiEvent(event: SettingUiEvents?) {
        when (event) {
            SettingUiEvents.ChooseLanguageApp,
            SettingUiEvents.ChooseThemeApp -> activity?.recreate()
        }
    }

    private fun initTheme(model: ThemeModel?) {
        model?.let {
            setThemeModel(model)
        }
    }

    private fun initLanguage(lang: Language?) {
        lang?.let {
            setLanguageApp(lang)
        }
    }

    private fun setThemeModel(value: ThemeModel) {
        when (value.themeValue) {
            R.style.AppThemeNight -> initNightTheme()
            R.style.AppThemeDay -> initLightTheme()
        }
    }

    private fun initNightTheme() {
        initSpannableTextView(
            title = R.string.theme_title_settings,
            subTitle = R.string.settings_night_title,
            drawStart = R.drawable.ic_theme_night,
            textView = txvThemeApp
        )
    }

    private fun initLightTheme() {
        initSpannableTextView(
            title = R.string.theme_title_settings,
            subTitle = R.string.settings_light_title,
            drawStart = R.drawable.ic_theme,
            textView = txvThemeApp
        )
    }

    /**
     * Иницилизация TextView которая выглядит как CardView
     * @param title надпись
     * @param subTitle выбранное значение
     * @param colorTitle цвет тайтла
     * @param colorSubTitle цвет выбранного значения
     * @param drawStart иконка которая отрисовывается рядом с текстом
     * @param textView вьюха для модификации
     */
    private fun initSpannableTextView(
        @StringRes title: Int,
        @StringRes subTitle: Int,
        @ColorRes colorTitle: Int = getColorTitle(),
        @ColorRes colorSubTitle: Int = getColorSubtitle(),
        @DrawableRes drawStart: Int,
        textView: AppCompatTextView
    ) {
        val titleStr = requireActivity().getString(title)
        val subTitleStr = requireActivity().getString(subTitle)
        val resultTitle = SpannableString("$titleStr\n$subTitleStr")
        resultTitle[0..titleStr.length] = ForegroundColorSpan(
            ContextCompat.getColor(requireContext(), colorTitle)
        )
        resultTitle[titleStr.length..titleStr.length + subTitleStr.length + 1] =
            ForegroundColorSpan(
                ContextCompat.getColor(requireContext(), colorSubTitle)
            )
        textView.text = resultTitle
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(
            ContextCompat.getDrawable(
                requireContext(),
                drawStart
            ), null, null, null
        )
    }

    private fun initClickThemeApp() {
        txvThemeApp.setOnClickListener {
            val dialog = DialogChooseThemeApp()
            dialog.show(requireFragmentManager(), DialogChooseThemeApp::class.java.name)
        }
    }

    private fun initToolbar() {
        toolbar.apply {
            when (themeManager.getThemeNow()) {
                R.style.AppThemeDay -> setNavigationIcon(R.drawable.ic_arrow_back_black)
                R.style.AppThemeNight -> setNavigationIcon(R.drawable.ic_arrow_back_black_night)
            }
            setNavigationOnClickListener {
                requireActivity().supportFragmentManager.popBackStack()
            }
            setTitle(R.string.settings_to_cat_title)
        }
    }

    private fun setLanguageApp(language: Language) {
        when (language) {
            Language.RU -> initRuLanguageTitle()
            Language.EN -> initEnLanguageTitle()
        }
    }

    private fun initRuLanguageTitle() {
        initSpannableTextView(
            title = R.string.language_app_title,
            subTitle = R.string.language_app_title_ru,
            drawStart = getIconTheme(),
            textView = txvLanguageApp
        )
    }

    private fun getIconTheme() = when (themeManager.getThemeNow()) {
        R.style.AppThemeNight -> R.drawable.ic_global_night
        else -> R.drawable.ic_global
    }

    private fun initEnLanguageTitle() {
        initSpannableTextView(
            title = R.string.language_app_title,
            subTitle = R.string.language_app_title_en,
            drawStart = getIconTheme(),
            textView = txvLanguageApp
        )
    }

    private fun getColorTitle(): Int = when (viewModel.getThemeNow()) {
        R.style.AppThemeNight -> R.color.white
        else -> R.color.text_toolbar_title_light
    }

    private fun getColorSubtitle(): Int = when (viewModel.getThemeNow()) {
        R.style.AppThemeNight -> R.color.white_hint
        else -> R.color.color_dark_grey
    }

    private fun initClickLanguageChoose() {
        txvLanguageApp.setOnClickListener {
            val dialog = DialogChooseLanguageApp()
            dialog.show(requireFragmentManager(), DialogChooseLanguageApp::class.java.name)
        }
    }

    private fun initClickSortType() {
        txvSortParameter.setOnClickListener {
            val dialog = DialogChooseSortType()
            dialog.show(requireFragmentManager(), DialogChooseSortType::class.java.name)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        SettingsComponent.component = null
        viewModel.themeLiveDataModel.call()
        viewModel.languageLiveData.call()
        viewModel.uiLiveDataEvent.call()
    }
}