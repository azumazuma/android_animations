package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.androidcustomview.util.AnimSet

class Bound {
    fun inSideCenter(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 0.3f, 1.05f, 0.9f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 0.3f, 1.05f, 0.9f, 1f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun inSideTop(view: View, duration: Long = 1000): AnimatorSet {
        val height = -view.height
        val o1 = ObjectAnimator.ofFloat(view, "translationY", height.toFloat() - 30f, 10f, 0f)
        val o2 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun inSideBottom(view: View, duration: Long = 1000): AnimatorSet {
        val height = view.height
        val o1 = ObjectAnimator.ofFloat(view, "translationY", height.toFloat(), 30f, -10f, 0f)
        val o2 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun inSideRight(view: View, duration: Long = 1000): AnimatorSet {
        val width = -view.width.toFloat()
        val measureWidth = -view.measuredWidth.toFloat()
        val o1 = ObjectAnimator.ofFloat(view, "translationX", width + measureWidth, -30f, 10f, 0f)
        val o2= ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun inSideLeft(view: View, duration: Long = 1000): AnimatorSet {
        val width = -view.width
        val o1 = ObjectAnimator.ofFloat(view, "translationX", width.toFloat(), 30f, -10f, 0f)
        val o2 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }
}