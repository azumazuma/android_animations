package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

class Zoom {
    fun inSide(view: View, duration: Long = 1000): AnimatorSet {
        val o1 = ObjectAnimator.ofFloat(view, "scaleX", 0.45f, 1f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleY", 0.45f, 1f)
        val o3 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimatorSet()
    }

    fun outSide(view: View, duration: Long = 1000): AnimatorSet {
        val o1 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f, 0f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.3f, 0f)
        val o3 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.3f, 0f)

        return AnimatorSet()
    }
}