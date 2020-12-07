package com.evgeny.goncharov.wallcats.ui.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.wallcats.R
import com.evgeny.goncharov.wallcats.model.view.CatBreedView
import kotlinx.android.synthetic.main.holder_cat_breed.view.*

/**
 * Холдер кота на экране стены котов
 * @property listener контракт слушатель нажатий
 * @property themeManager менеджер отвечающий за темы в приложении
 * @param view макет холдера кота на стене котов
 */
class CatBreedViewHolder(
    view: View,
    private val listener: CatBreedViewHolderListener,
    private val themeManager: ThemeManager
) : RecyclerView.ViewHolder(view) {

    companion object {

        private const val SIZE_BITMAP_CATS = 100
    }

    /**
     * Биндим данные со вью
     * @param item модель кота
     */
    fun bind(item: CatBreedView?) {
        item?.let {
            itemView.txvBreedName.text = item.name
            itemView.txvBreedDescription.text = item.description
            Glide.with(itemView)
                .load(item.urlImage)
                .apply(
                    RequestOptions()
                        .override(SIZE_BITMAP_CATS, SIZE_BITMAP_CATS)
                        .centerCrop()
                )
                .into(itemView.imvShowCat)
            itemView.imbWiki.setOnClickListener {
                listener.clickCatUrlBreed(item.wikipediaUrl)
            }
            when (themeManager.getThemeNow()) {
                R.style.AppThemeDay -> itemView.imbWiki.setImageResource(R.drawable.ic_wikipedia)
                R.style.AppThemeNight -> itemView.imbWiki.setImageResource(R.drawable.ic_wikipedia_night)
            }
            itemView.cnlContainerCat.setOnClickListener {
                listener.clickCatBreed(item.id)
            }
        }
    }

    /**
     * Контракт, слушателя нажатий
     */
    interface CatBreedViewHolderListener {

        /**
         * Нажатие на холдер
         * @param id кота на которого нажали
         */
        fun clickCatBreed(id: String?)

        /**
         * Нажатие на кнопку википедии
         * @param urlImage урл страницы кота в википедии
         */
        fun clickCatUrlBreed(urlImage: String?)
    }
}