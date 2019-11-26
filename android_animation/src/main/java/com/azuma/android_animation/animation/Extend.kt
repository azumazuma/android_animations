package com.azuma.android_animation.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.android_animation.util.AnimSet

class Extend {
    fun widthSmall(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width / 2).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.5f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun widthBig(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width / 2).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 1.5f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun heightSmall(view: View, duration: Long = 1000): AnimatorSet {
        val y = (view.height / 2).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.5f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun heightBig(view: View, duration: Long = 1000): AnimatorSet {
        val y = (view.height / 2).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 1.5f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun small(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width / 2).toFloat()
        val y = (view.height / 2).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.5f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.5f, 1f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3, o4, o5)
    }

    fun big(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width / 2).toFloat()
        val y = (view.height / 2).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 1.5f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 1.5f, 1f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3, o4, o5)
    }
}