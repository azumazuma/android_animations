package com.azuma.android_animation.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.android_animation.util.AnimSet

class Roll {
    fun inSideTop(view: View, duration: Long = 1000): AnimatorSet {
        val start = -view.bottom.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "translationY", start, 0f)
        val o2 = ObjectAnimator.ofFloat(view, "rotation", -180f, 0f)
        val o3 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun outSideTop(view: View, duration: Long = 1000): AnimatorSet {
        val end = -view.bottom.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "translationY", 0f, end)
        val o2 = ObjectAnimator.ofFloat(view, "rotation", 0f, 180f)
        val o3 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 1f, 0f)
        val o4 = ObjectAnimator.ofFloat(view, "translationY", 0f, 0f)
        val o5 = ObjectAnimator.ofFloat(view, "rotation", 0f, 0f)

        o4.startDelay = duration
        o5.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5)
    }

    fun inSideBottom(view: View, duration: Long = 1000): AnimatorSet {
        val start = view.bottom.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "translationY", start, 0f)
        val o2 = ObjectAnimator.ofFloat(view, "rotation", -180f, 0f)
        val o3 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun outSideBottom(view: View, duration: Long = 1000): AnimatorSet {
        val end = view.bottom.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "translationY", 0f, end)
        val o2 = ObjectAnimator.ofFloat(view, "rotation", 0f, 180f)
        val o3 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 1f, 0f)
        val o4 = ObjectAnimator.ofFloat(view, "translationY", 0f, 0f)
        val o5 = ObjectAnimator.ofFloat(view, "rotation", 0f, 0f)

        o4.startDelay = duration
        o5.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5)
    }

    fun inSideLeft(view: View, duration: Long = 1000): AnimatorSet {
        val start = -view.right.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "translationX", start, 0f)
        val o2 = ObjectAnimator.ofFloat(view, "rotation", -180f, 0f)
        val o3 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun outSideLeft(view: View, duration: Long = 1000): AnimatorSet {
        val end = -view.right.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "translationX", 0f, end)
        val o2 = ObjectAnimator.ofFloat(view, "rotation", 0f, -180f)
        val o3 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 1f, 0f)
        val o4 = ObjectAnimator.ofFloat(view, "translationX", 0f, 0f)
        val o5 = ObjectAnimator.ofFloat(view, "rotation", 0f, 0f)

        o4.startDelay = duration
        o5.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5)
    }

    fun inSideRight(view: View, duration: Long = 1000): AnimatorSet {
        val start = view.right.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "translationX", start, 0f)
        val o2 = ObjectAnimator.ofFloat(view, "rotation", 180f, 0f)
        val o3 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun outSideRight(view: View, duration: Long = 1000): AnimatorSet {
        val end = view.right.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "translationX", 0f, end)
        val o2 = ObjectAnimator.ofFloat(view, "rotation", 0f, 180f)
        val o3 = ObjectAnimator.ofFloat(view, "alpha", 1f, 1f, 1f, 0f)
        val o4 = ObjectAnimator.ofFloat(view, "translationX", 0f, 0f)
        val o5 = ObjectAnimator.ofFloat(view, "rotation", 0f, 0f)

        o4.startDelay = duration
        o5.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5)
    }
}