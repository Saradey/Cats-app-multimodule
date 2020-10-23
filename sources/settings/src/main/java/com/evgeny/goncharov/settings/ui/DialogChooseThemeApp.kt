package com.evgeny.goncharov.settings.ui

import android.app.Dialog
import android.os.Bundle
import com.evgeny.goncharov.coreapi.base.BaseFragmentDialog
import com.evgeny.goncharov.settings.R
import com.evgeny.goncharov.settings.di.components.SettingsComponent
import com.evgeny.goncharov.settings.view.model.SettingsViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * Диалоговое окно выбора темы
 */
class DialogChooseThemeApp : BaseFragmentDialog() {

    /** Вьюмодель для экрана настроек */
    private lateinit var vm: SettingsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SettingsComponent.component?.apply {
            vm = provideSettingsViewModel()
            themeManager = provideThemeManager()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builderDialog = MaterialAlertDialogBuilder(
            requireContext(),
            getDialogTheme()
        )
        builderDialog.setTitle(R.string.theme_title_settings)
            .setPositiveButton(
                R.string.title_cancel_dialog_common
            ) { _, _ ->
                dismiss()
            }
            .setSingleChoiceItems(
                resources.getStringArray(R.array.themes_titles),
                vm.getThemeValue()
            ) { _, item ->
                vm.setChooseThemeIndex(item)
                dismiss()
            }
        return builderDialog.create()
    }
}