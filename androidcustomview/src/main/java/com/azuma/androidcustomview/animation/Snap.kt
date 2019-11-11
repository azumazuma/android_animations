package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.androidcustomview.util.AnimSet

class Snap {
    fun inSideX(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotationX", 90f, -15f, 15f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun outSideX(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view,    "rotationX", 0f, 90f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view,  "alpha", 1f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun inSideY(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view,   "rotationY", 90f, -15f, 15f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f,1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun outSideY(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view,    "rotationY", 0f, 90f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view,    "alpha", 1f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }
}