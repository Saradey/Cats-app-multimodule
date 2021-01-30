package com.evgeny.goncharov.settings.ui

import android.app.Dialog
import android.os.Bundle
import com.evgeny.goncharov.settings.R
import com.evgeny.goncharov.settings.base.BaseSettingsFragmentDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * Диалоговое окно выбора включить или выключить нотификацию
 */
class DialogChooseOnOrOfNotification : BaseSettingsFragmentDialog() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builderDialog = MaterialAlertDialogBuilder(
            requireContext(),
            getDialogTheme()
        )
        builderDialog.setTitle(R.string.notification_settings_title)
            .setPositiveButton(
                R.string.title_cancel_dialog_common
            ) { _, _ ->
                dismiss()
            }
            .setSingleChoiceItems(
                resources.getStringArray(R.array.notification_titles),
                vm.getSelectNotification()
            ) { _, item ->
                vm.chosenNotification(item)
                dismiss()
            }
        return builderDialog.create()
    }

    companion object {
        /** Индекс нотификации включены */
        const val INDEX_CHOOSE_ON = 0

        /** Индекс нотификации выключены */
        const val INDEX_CHOOSE_OFF = 1

        fun getInstance() = DialogChooseOnOrOfNotification()
    }
}