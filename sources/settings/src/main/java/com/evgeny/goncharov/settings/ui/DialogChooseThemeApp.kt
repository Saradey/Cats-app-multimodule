package com.evgeny.goncharov.settings.ui

import android.app.Dialog
import android.os.Bundle
import com.evgeny.goncharov.settings.R
import com.evgeny.goncharov.settings.base.BaseSettingsFragmentDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * Диалоговое окно выбора темы
 */
class DialogChooseThemeApp : BaseSettingsFragmentDialog() {

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
                vm.chosenThemeIndex(item)
                dismiss()
            }
        return builderDialog.create()
    }
}