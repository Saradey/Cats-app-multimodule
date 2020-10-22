package com.evgeny.goncharov.wallcats.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.wallcats.R
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import com.evgeny.goncharov.wallcats.ui.holders.CatBreedViewHolder

/**
 * Адаптер стены котов
 * @property listener контракт слушателя нажатий
 * @property themeManager менеджер отвечающий за темы в приложении
 * @param diffUtils для рассчета списка
 */
class CatBreedsPagedAdapter(
    diffUtils: DiffUtil.ItemCallback<CatBreedView>,
    private val listener: CatBreedViewHolder.CatBreedViewHolderListener,
    private val themeManager: ThemeManager
) : PagedListAdapter<CatBreedView, CatBreedViewHolder>(diffUtils) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatBreedViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.holder_cat_breed, parent, false)
        return CatBreedViewHolder(view, listener, themeManager)
    }

    override fun onBindViewHolder(holder: CatBreedViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}