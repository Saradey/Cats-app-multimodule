package com.evgeny.goncharov.wallcats.ui.holders

import android.graphics.drawable.Animatable
import android.view.View
import android.view.animation.AnimationUtils
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.evgeny.goncharov.coreapi.managers.ThemeManager
import com.evgeny.goncharov.wallcats.R
import com.evgeny.goncharov.wallcats.databinding.HolderCatBreedBinding
import com.evgeny.goncharov.wallcats.model.view.CatBreedEntity

/**
 * Холдер кота на экране стены котов
 * @property listener контракт слушатель нажатий
 * @property themeManager менеджер отвечающий за темы в приложении
 * @param view макет холдера кота на стене котов
 */
class CatBreedViewHolder(
    private val listener: CatBreedViewHolderListener,
    private val themeManager: ThemeManager,
    view: View
) : RecyclerView.ViewHolder(view) {

    /** Биндинг View кошачего холдера */
    private lateinit var binder: HolderCatBreedBinding

    /**
     * Биндим данные со вью
     * @param item модель кота
     */
    fun bind(item: CatBreedEntity?) {
        binder = HolderCatBreedBinding.bind(itemView)
        item?.let {
            animationHolder(item)
            bindModel(item)
        }
    }

    private fun bindModel(item: CatBreedEntity) {
        binder.apply {
            txvBreedName.text = item.name
            txvBreedDescription.text = item.description
            val animatedDrawable = getAnimationDrawable()
            (animatedDrawable as Animatable).start()
            Glide.with(itemView)
                .load(item.urlImage)
                .apply(
                    RequestOptions()
                        .override(SIZE_BITMAP_CATS, SIZE_BITMAP_CATS)
                        .centerCrop()
                )
                .placeholder(animatedDrawable)
                .into(imvShowCat)
            imbWiki.setOnClickListener {
                listener.clickCatUrlBreed(item.wikipediaUrl)
            }
            cnlContainerCat.setOnClickListener {
                listener.clickCatBreed(item.id)
            }
        }
    }

    private fun getAnimationDrawable() = if (themeManager.getThemeNow() == R.style.AppThemeDay) {
        ResourcesCompat.getDrawable(
            itemView.resources,
            R.drawable.day_shimmer_drawable,
            null
        )
    } else {
        ResourcesCompat.getDrawable(
            itemView.resources,
            R.drawable.night_shimmer_drawable,
            null
        )
    }

    private fun animationHolder(item: CatBreedEntity) {
        if (!item.isAnimated) {
            binder.root.startAnimation(
                AnimationUtils.loadAnimation(
                    itemView.context,
                    R.anim.fade_scale_translate_animation
                )
            )
            item.isAnimated = true
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