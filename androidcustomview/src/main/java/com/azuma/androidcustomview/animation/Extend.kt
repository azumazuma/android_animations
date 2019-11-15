package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.androidcustomview.util.AnimSet

class Extend {
    fun widthSmall(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.5f, 1f)

        return AnimSet.set(view, duration, o1)
    }

    fun widthBig(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 1.5f, 1f)

        return AnimSet.set(view, duration, o1)
    }

    fun heightSmall(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.5f, 1f)

        return AnimatorSet()
    }

    fun heightBig(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 1.5f, 1f)

        return AnimatorSet()
    }

    fun small(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.5f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.5f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun big(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 1.5f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 1.5f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }
}