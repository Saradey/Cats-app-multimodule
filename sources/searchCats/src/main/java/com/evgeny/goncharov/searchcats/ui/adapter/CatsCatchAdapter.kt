package com.evgeny.goncharov.searchcats.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.evgeny.goncharov.searchcats.R.layout
import com.evgeny.goncharov.searchcats.model.CatCatch
import com.evgeny.goncharov.searchcats.ui.holder.CatsCatchHolder

/**
 * Адаптер для управления списком искомых котов
 * @property listener слушатель нажатий
 */
class CatsCatchAdapter constructor(
    private val listener: (id: String) -> Unit
) : ListAdapter<CatCatch, CatsCatchHolder>(CatCatchItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatsCatchHolder {
        return CatsCatchHolder(
            listener,
            LayoutInflater.from(parent.context).inflate(layout.holder_cathed_cat, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CatsCatchHolder, position: Int) {
        holder.bind(getItem(position))
    }

    /**
     * Для оптимизации поиска
     */
    class CatCatchItemCallback : DiffUtil.ItemCallback<CatCatch>() {

        override fun areItemsTheSame(oldItem: CatCatch, newItem: CatCatch): Boolean {
            return oldItem.catId == newItem.catId
        }

        override fun areContentsTheSame(oldItem: CatCatch, newItem: CatCatch): Boolean {
            return oldItem == newItem
        }
    }
}