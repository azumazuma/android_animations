package com.azuma.android_animation.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.android_animation.util.AnimSet

class Door {
    fun topOpen(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", 0f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun topClose(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", 0f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun bottomOpen(view: View, duration: Long = 1000): AnimatorSet {
        val y = view.height.toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun bottomClose(view: View, duration: Long = 1000): AnimatorSet {
        val y = view.height.toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun leftOpen(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", 0f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun leftClose(view: View, duration: Long = 1000): AnimatorSet {
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", 0f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun rightOpen(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.width.toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)


        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun rightClose(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.width.toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }
}