package com.evgeny.goncharov.uikit

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.util.AttributeSet
import android.view.animation.LinearInterpolator
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.layout_progress_cat.view.imvCat
import kotlinx.android.synthetic.main.layout_progress_cat.view.imvPlanet

/**
 * Макет содержащий в себе заглушку в случае ошибки и прогресс пока идет запрос в сеть
 */
class ProgressCat : ConstraintLayout {

    companion object {

        /** Вращение картинки земли вокруг своей оси */
        private const val RADIUS_ROTATE = 360f

        /** Сколько миллисекунд длится анимация */
        private const val DEFAULT_ANIMATION_DURATION = 2500L

        /** Сколько раз необходимо повторить анимацию */
        private const val REPEAT_ROTATE_PLANET = 9999
    }

    constructor(context: Context) : super(context)

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)

    /** Покадровая анимация кота */
    private lateinit var animationCatFrame: AnimationDrawable

    /** Для анимации вращения планеты */
    private val animatorRotatePlanet = ValueAnimator.ofFloat(0f, RADIUS_ROTATE)

    init {
        inflate(context, R.layout.layout_progress_cat, this)
        animationCatFrame = imvCat.background as AnimationDrawable
        animatorRotatePlanet.addUpdateListener {
            val value = it.animatedValue as Float
            imvPlanet.rotation = value
        }
        animatorRotatePlanet.interpolator = LinearInterpolator()
        animatorRotatePlanet.duration = DEFAULT_ANIMATION_DURATION
        animatorRotatePlanet.repeatCount = REPEAT_ROTATE_PLANET
    }

    /** Запускаем анимацию */
    fun startAnimation() {
        if (!animationCatFrame.isRunning && !animatorRotatePlanet.isRunning) {
            animationCatFrame.start()
            animatorRotatePlanet.start()
        }
    }

    /** Стопаем анимацию */
    fun stopAnimation() {
        animationCatFrame.stop()
        animatorRotatePlanet.cancel()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        stopAnimation()
    }
}