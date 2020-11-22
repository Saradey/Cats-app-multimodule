package com.evgeny.goncharov.settings.ui

import android.app.Dialog
import android.os.Bundle
import com.evgeny.goncharov.settings.R
import com.evgeny.goncharov.settings.base.BaseSettingsFragmentDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

/**
 * Диалоговое окно выбора типа сортировки
 */
class DialogChooseSortType : BaseSettingsFragmentDialog() {

    companion object {
        /** Индекс сортировки по алфовиту в диалоговом окне */
        const val INDEX_SORT_NAME = 0

        /** Индекс сортировки по долголетию в диалоговом окне */
        const val INDEX_SORT_LIFE_SPAN = 1

        /** Индекс сортировки по весу в диалоговом окне */
        const val INDEX_SORT_WIGHT = 2
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
                resources.getStringArray(R.array.sorts_titles),
                vm.getSortValue()
            ) { _, item ->
                vm.setChooseSort(item)
                dismiss()
            }
        return builderDialog.create()
    }
}