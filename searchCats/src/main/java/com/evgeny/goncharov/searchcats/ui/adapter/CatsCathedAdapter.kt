package com.evgeny.goncharov.searchcats.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evgeny.goncharov.searchcats.model.CatCatched
import com.evgeny.goncharov.searchcats.R.layout
import com.evgeny.goncharov.searchcats.ui.holder.CatsCathedHolder

class CatsCathedAdapter constructor(
    private val listener: (id: String) -> Unit
) : RecyclerView.Adapter<CatsCathedHolder>() {

    var models: List<CatCatched> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatsCathedHolder {
        return CatsCathedHolder(
            listener,
            LayoutInflater.from(parent.context).inflate(layout.holder_cathed_cat, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: CatsCathedHolder, position: Int) {
        holder.bind(models[position])
    }
}