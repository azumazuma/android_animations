package com.azuma.android_animation.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.android_animation.util.AnimSet

class Flash {
    fun week(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 0f, 1f)

        return AnimSet.set(view, duration, o1)
    }

    fun medium(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 0f, 1f, 0f, 1f)

        return AnimSet.set(view, duration, o1)
    }

    fun strength(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 0f, 1f, 0f, 1f, 0f, 1f)

        return AnimSet.set(view, duration, o1)
    }
}