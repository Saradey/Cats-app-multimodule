package com.evgeny.goncharov.settings.ui

import android.app.Dialog
import android.os.Bundle
import com.evgeny.goncharov.settings.R
import com.evgeny.goncharov.settings.base.BaseSettingsFragmentDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * Дилоговое окно выбора языка
 */
class DialogChooseLanguageApp : BaseSettingsFragmentDialog() {

    companion object {

        /** Индекс русского языка в списке выбора */
        const val INDEX_CHOOSE_RU = 0

        /** Индекс английского языка в списке выбора */
        const val INDEX_CHOOSE_EN = 1
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builderDialog = MaterialAlertDialogBuilder(
            requireContext(),
            getDialogTheme()
        )
        builderDialog.setTitle(R.string.language_app_title)
            .setPositiveButton(
                R.string.title_cancel_dialog_common
            ) { _, _ ->
                dismiss()
            }
            .setSingleChoiceItems(
                resources.getStringArray(R.array.language_titles),
                vm.getSelectLanguage()
            ) { _, item ->
                vm.chooseLanguage(item)
                dismiss()
            }
        return builderDialog.create()
    }
}