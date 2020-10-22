package com.evgeny.goncharov.searchcats.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evgeny.goncharov.searchcats.R.layout
import com.evgeny.goncharov.searchcats.model.CatCatch
import com.evgeny.goncharov.searchcats.ui.holder.CatsCatchHolder

/**
 * Адаптер для управления списком искомых котов
 * @property listener слушатель нажатий
 */
class CatsCatchAdapter constructor(
    private val listener: (id: String) -> Unit
) : RecyclerView.Adapter<CatsCatchHolder>() {

    /** Модель искомых котов */
    var models: List<CatCatch> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatsCatchHolder {
        return CatsCatchHolder(
            listener,
            LayoutInflater.from(parent.context).inflate(layout.holder_cathed_cat, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: CatsCatchHolder, position: Int) {
        holder.bind(models[position])
    }
}