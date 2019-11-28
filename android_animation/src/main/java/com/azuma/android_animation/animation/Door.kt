package com.azuma.android_animation.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.android_animation.util.AnimSet

class Door {
    fun topOpen(view: View, duration: Long = 1000): AnimatorSet {
        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", 0f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o4.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun topClose(view: View, duration: Long = 1000): AnimatorSet {
        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", 0f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 0f)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 1f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o4.startDelay = duration
        o5.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5)
    }

    fun bottomOpen(view: View, duration: Long = 1000): AnimatorSet {
        val y = view.height.toFloat()

        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o4.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun bottomClose(view: View, duration: Long = 1000): AnimatorSet {
        val y = view.height.toFloat()

        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 0f)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 1f, 1f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o4.startDelay = duration
        o5.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5)
    }

    fun leftOpen(view: View, duration: Long = 1000): AnimatorSet {
        val afterX = view.width.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", 0f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)

        o4.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun leftClose(view: View, duration: Long = 1000): AnimatorSet {
        val afterX = view.width.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", 0f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 0f)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 1f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)

        o4.startDelay = duration
        o5.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5)
    }

    fun rightOpen(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.width.toFloat()

        val afterX = view.width.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)

        o4.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun rightClose(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.width.toFloat()

        val afterX = view.width.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha",  1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 1f, 0f)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 1f, 1f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)

        o4.startDelay = duration
        o5.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5)
    }
}