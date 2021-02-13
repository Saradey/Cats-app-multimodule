package com.evgeny.goncharov.settings.ui

import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.core.text.set
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.evgeny.goncharov.coreapi.activity.contracts.WithFacade
import com.evgeny.goncharov.coreapi.base.BaseFragment
import com.evgeny.goncharov.coreapi.providers.ActivityContextProvider
import com.evgeny.goncharov.coreapi.utils.Language
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
        binder.toolbar.setNavigationOnClickListener(::clickToolbarNavigation)
        initClickThemeApp()
        initClickLanguageChoose()
        initClickNotification()
    }

    private fun init() {
        initLiveData()
        viewModel.initModelToView()
    }

    private fun initLiveData() {
        viewModel.themeLiveDataModel.observe(this, Observer { initTheme(it) })
        viewModel.languageLiveData.observe(this, Observer { initLanguage(it) })
        viewModel.uiLiveDataEvent.observe(this, Observer { changeUiState(it) })
        viewModel.notificationLiveData.observe(this, Observer { initNotificationView(it) })
    }

    private fun initNotificationView(isOn: Boolean) {
        when (isOn) {
            true -> initNotificationView(R.string.notification_settings_ison)
            false -> initNotificationView(R.string.notification_settings_isoff)
        }
    }

    private fun initNotificationView(@StringRes subTitle: Int) {
        initSpannableTextView(
            title = R.string.notification_settings_title,
            subTitle = subTitle,
            textView = binder.txvNotification
        )
    }

    private fun initTheme(model: ThemeEntity?) {
        model?.let {
            when (model.themeValue) {
                R.style.AppThemeNight -> initSubTitleTheme(R.string.settings_night_title)
                R.style.AppThemeDay -> initSubTitleTheme(R.string.settings_light_title)
            }
        }
    }

    private fun initSubTitleTheme(@StringRes subtitle: Int) {
        initSpannableTextView(
            title = R.string.theme_title_settings,
            subTitle = subtitle,
            textView = binder.txvThemeApp
        )
    }

    private fun initLanguage(lang: Language?) {
        lang?.let {
            when (lang) {
                Language.RU -> initSubTitleLanguage(R.string.language_app_title_ru)
                Language.EN -> initSubTitleLanguage(R.string.language_app_title_en)
            }
        }
    }

    private fun initSubTitleLanguage(@StringRes subTitle: Int) {
        initSpannableTextView(
            title = R.string.language_app_title,
            subTitle = subTitle,
            textView = binder.txvLanguageApp
        )
    }

    /**
     * Иницилизация TextView которая выглядит как CardView
     * @param title надпись
     * @param subTitle выбранное значение
     * @param colorTitle цвет тайтла
     * @param colorSubTitle цвет выбранного значения
     * @param textView вьюха для модификации
     */
    private fun initSpannableTextView(
        @StringRes title: Int,
        @StringRes subTitle: Int,
        @ColorRes colorTitle: Int = getColorTitle(),
        @ColorRes colorSubTitle: Int = getColorSubtitle(),
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
    }

    private fun initClickThemeApp() {
        binder.txvThemeApp.setOnClickListener {
            val dialog = DialogChooseThemeApp.getInstance()
            dialog.show(childFragmentManager, DialogChooseThemeApp::class.java.name)
        }
    }

    private fun clickToolbarNavigation(view: View) {
        requireActivity().supportFragmentManager.popBackStack()
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
            val dialog = DialogChooseLanguageApp.getInstance()
            dialog.show(childFragmentManager, DialogChooseLanguageApp::class.java.name)
        }
    }

    private fun initClickNotification() {
        binder.txvNotification.setOnClickListener {
            val dialog = DialogChooseOnOrOfNotification.getInstance()
            dialog.show(childFragmentManager, DialogChooseOnOrOfNotification::class.java.name)
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