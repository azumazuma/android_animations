package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

class Bound {
    fun upBottom(view: View, duration: Long = 1000): AnimatorSet {
        val anim = AnimatorSet()

        val o1 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        val height = view.height
        val o2 = ObjectAnimator.ofFloat(view, "translationY", height.toFloat(), 30f, -10f, 0f)
        anim.playTogether(o1, o2)
        anim.duration = duration
        anim.setTarget(view)
        return anim
    }
}