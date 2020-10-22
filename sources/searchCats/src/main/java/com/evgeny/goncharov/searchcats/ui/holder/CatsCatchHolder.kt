package com.evgeny.goncharov.searchcats.ui.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.evgeny.goncharov.searchcats.model.CatCatch
import kotlinx.android.synthetic.main.holder_cathed_cat.view.txvIdTitle
import kotlinx.android.synthetic.main.holder_cathed_cat.view.txvTitleName

/**
 * Холдер искомых котов в RecycleView
 * @property listener контракт для передачи нажатия на данный холдер
 * @param view макет холдера
 */
class CatsCatchHolder(private val listener: (id: String) -> Unit, view: View) :
    RecyclerView.ViewHolder(view) {

    fun bind(catCatch: CatCatch) {
        itemView.apply {
            txvTitleName.text = catCatch.catName
            txvIdTitle.text = catCatch.catId
            setOnClickListener {
                listener(catCatch.catId)
            }
        }
    }
}