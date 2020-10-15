package com.evgeny.goncharov.uikit

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.util.AttributeSet
import android.view.animation.LinearInterpolator
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.layout_progress_cat.view.*

class ProgressCat : ConstraintLayout {

    companion object {
        private const val RADIUS_ROTATE = 360f
        private const val DEFAULT_ANIMATION_DURATION = 2500L
        private const val REPEAT_ROTATE_PLANET = 9999
    }

    constructor(context: Context) : super(context)

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)

    private lateinit var animationCatFrame: AnimationDrawable
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

    fun startAnimation() {
        animationCatFrame.start()
        animatorRotatePlanet.start()
    }

    fun stopAnimation() {
        animationCatFrame.stop()
        animatorRotatePlanet.cancel()
    }

}