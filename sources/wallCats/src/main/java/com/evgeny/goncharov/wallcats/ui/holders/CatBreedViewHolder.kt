package com.evgeny.goncharov.wallcats.ui.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.wallcats.R
import com.evgeny.goncharov.wallcats.databinding.HolderCatBreedBinding
import com.evgeny.goncharov.wallcats.model.view.CatBreedView

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

    /** Биндинг View кошачего холдера */
    private lateinit var binder: HolderCatBreedBinding

    /**
     * Биндим данные со вью
     * @param item модель кота
     */
    fun bind(item: CatBreedView?) {
        binder = HolderCatBreedBinding.bind(itemView)
        item?.let {
            binder.apply {
                txvBreedName.text = item.name
                txvBreedDescription.text = item.description
                Glide.with(itemView)
                    .load(item.urlImage)
                    .apply(
                        RequestOptions()
                            .override(SIZE_BITMAP_CATS, SIZE_BITMAP_CATS)
                            .centerCrop()
                    )
                    .into(imvShowCat)
                imbWiki.setOnClickListener {
                    listener.clickCatUrlBreed(item.wikipediaUrl)
                }
                when (themeManager.getThemeNow()) {
                    R.style.AppThemeDay -> imbWiki.setImageResource(R.drawable.ic_wikipedia)
                    R.style.AppThemeNight -> imbWiki.setImageResource(R.drawable.ic_wikipedia_night)
                }
                cnlContainerCat.setOnClickListener {
                    listener.clickCatBreed(item.id)
                }
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

    companion object {

        /** Размер картинки кошек в пикселях */
        private const val SIZE_BITMAP_CATS = 100
    }
}