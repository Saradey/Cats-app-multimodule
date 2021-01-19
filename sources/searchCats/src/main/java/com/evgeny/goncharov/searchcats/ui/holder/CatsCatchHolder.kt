package com.evgeny.goncharov.searchcats.ui.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.evgeny.goncharov.searchcats.databinding.HolderCathedCatBinding
import com.evgeny.goncharov.searchcats.model.CatCatch

/**
 * Холдер искомых котов в RecycleView
 * @property listener контракт для передачи нажатия на данный холдер
 * @param view макет холдера
 */
class CatsCatchHolder(private val listener: (id: String) -> Unit, view: View) :
    RecyclerView.ViewHolder(view) {

    /** Для бинда View в холдере поиска котов */
    private lateinit var binder: HolderCathedCatBinding

    /**
     * Бинд данных для данного холдера
     * @param catCatch модель для бинда
     */
    fun bind(catCatch: CatCatch) {
        binder = HolderCathedCatBinding.bind(itemView)
        binder.apply {
            txvTitleName.text = catCatch.catName
            txvIdTitle.text = catCatch.catId
            binder.root.setOnClickListener {
                listener(catCatch.catId)
            }
        }
    }
}