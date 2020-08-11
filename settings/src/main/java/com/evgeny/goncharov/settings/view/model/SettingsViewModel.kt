package com.evgeny.goncharov.settings.view.model

import androidx.lifecycle.LiveData
import com.evgeny.goncharov.settings.events.SettingUiEvents
import com.evgeny.goncharov.settings.models.ThemeModel
import com.evgeny.goncharov.coreapi.utils.Language

interface SettingsViewModel {

    fun initInjection()

    fun getThemeLiveData(): LiveData<ThemeModel>

    fun initThemeToView()

    fun getThemeValue(): Int

    fun setChooseThemeIndex(item: Int)

    fun getLanguageLiveData(): LiveData<Language>

    fun initLanguageToView()

    fun getUiEvents(): LiveData<SettingUiEvents>

    fun getThemeNow(): Int

    fun getSelectLanguage(): Int

    fun chooseLanguage(itemIndex: Int)
}