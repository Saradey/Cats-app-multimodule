package com.evgeny.goncharov.settings.ui

import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.core.text.set
import androidx.lifecycle.ViewModelProvider
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.providers.ActivityContextProvider
import com.evgeny.goncharov.coreapi.utils.Language
import com.evgeny.goncharov.coreapi.utils.SortType
import com.evgeny.goncharov.coreapi.utils.ViewModelProviderFactory
import com.evgeny.goncharov.settings.R
import com.evgeny.goncharov.settings.databinding.FragmentSettingsBinding
import com.evgeny.goncharov.settings.di.components.SettingsComponent
import com.evgeny.goncharov.settings.events.SettingUiEvents
import com.evgeny.goncharov.settings.models.ThemeEntity
import com.evgeny.goncharov.settings.view.model.SettingsViewModel

/**
 * Экран настроек
 */
class SettingsFragment : BaseFragment() {

    /** Биндинг клас View для экрана настроек */
    private lateinit var binder: FragmentSettingsBinding

    /** Компонент фитчи настроек */
    private val component by lazy {
        SettingsComponent.init(
            this,
            (requireActivity() as WithFacade).getFacade(),
            (requireActivity() as WithFacade).getFacade() as ActivityContextProvider
        )
    }

    /** ВьюМодель экрана настроек */
    private val viewModel: SettingsViewModel by lazy {
        ViewModelProvider(
            this, ViewModelProviderFactory {
                SettingsViewModel(component.provideInteractor())
            }
        ).get(SettingsViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binder = FragmentSettingsBinding.inflate(inflater, container, false)
        addStubLayout(binder.root)
        return binder.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initDaggerGraph()
        init()
        initUi()
    }

    private fun initDaggerGraph() {
        component.apply {
            themeManager = provideThemeManager()
        }
    }

    private fun initUi() {
        initToolbar()
        initClickThemeApp()
        initClickLanguageChoose()
        initClickSortType()
        initClickNotification()
    }

    private fun init() {
        initLiveData()
        viewModel.initModelToView()
    }

    private fun initLiveData() {
        viewModel.themeLiveDataModel.observe(this, ::initTheme)
        viewModel.languageLiveData.observe(this, ::initLanguage)
        viewModel.uiLiveDataEvent.observe(this, ::changeUiState)
        viewModel.sortTypeLiveData.observe(this, ::initSortTypeTextView)
        viewModel.notificationLiveData.observe(this, ::initNotificationView)
    }

    private fun initNotificationView(isOn: Boolean) {
        when (isOn) {
            true -> initNotificationView(R.string.notification_settings_ison)
            false -> initNotificationView(R.string.notification_settings_isoff)
        }
    }

    private fun initNotificationView(@StringRes subTitle: Int) {
        when (viewModel.themeLiveDataModel.value?.themeValue) {
            R.style.AppThemeNight -> setNotificationView(subTitle, R.drawable.ic_notification_day)
            R.style.AppThemeDay -> setNotificationView(subTitle, R.drawable.ic_notification_night)
        }
    }

    private fun setNotificationView(@StringRes subTitle: Int, @DrawableRes drawId: Int) {
        initSpannableTextView(
            title = R.string.notification_settings_title,
            subTitle = subTitle,
            drawStart = drawId,
            textView = binder.txvNotification
        )
    }

    private fun initSortTypeTextView(type: SortType) {
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
            textView = binder.txvSortParameter
        )
    }

    private fun initTheme(model: ThemeEntity?) {
        model?.let {
            setThemeModel(model)
        }
    }

    private fun initLanguage(lang: Language?) {
        lang?.let {
            setLanguageApp(lang)
        }
    }

    private fun setThemeModel(value: ThemeEntity) {
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
            textView = binder.txvThemeApp
        )
    }

    private fun initLightTheme() {
        initSpannableTextView(
            title = R.string.theme_title_settings,
            subTitle = R.string.settings_light_title,
            drawStart = R.drawable.ic_theme,
            textView = binder.txvThemeApp
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
        binder.txvThemeApp.setOnClickListener {
            val dialog = DialogChooseThemeApp.getInstance(viewModel)
            dialog.show(requireFragmentManager(), DialogChooseThemeApp::class.java.name)
        }
    }

    private fun initToolbar() {
        binder.toolbar.apply {
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
            textView = binder.txvLanguageApp
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
            textView = binder.txvLanguageApp
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
        binder.txvLanguageApp.setOnClickListener {
            val dialog = DialogChooseLanguageApp.getInstance(viewModel)
            dialog.show(requireFragmentManager(), DialogChooseLanguageApp::class.java.name)
        }
    }

    private fun initClickSortType() {
        binder.txvSortParameter.setOnClickListener {
            val dialog = DialogChooseSortType.getInstance(viewModel)
            dialog.show(requireFragmentManager(), DialogChooseSortType::class.java.name)
        }
    }

    private fun initClickNotification() {
        binder.txvNotification.setOnClickListener {
            val dialog = DialogChooseOnOrOfNotification.getInstance(viewModel)
            dialog.show(requireFragmentManager(), DialogChooseOnOrOfNotification::class.java.name)
        }
    }

    private fun changeUiState(event: SettingUiEvents?) {
        when (event) {
            SettingUiEvents.RecreateActivity -> activity?.recreate()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        SettingsComponent.component = null
        viewModel.uiLiveDataEvent.call()
    }

    companion object {

        fun getInstance() = SettingsFragment()
    }
}