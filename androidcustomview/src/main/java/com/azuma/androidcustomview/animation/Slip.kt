package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import com.azuma.androidcustomview.util.AnimSet

class Slip {
    fun inSideTop(view: View, duration: Long = 1000): AnimatorSet {
        val range = (view.top + view.height).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", -range, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun outSideTop(view: View, duration: Long = 1000): AnimatorSet {
        val parent = view.parent as ViewGroup
        val range = (parent.height - view.top).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, range)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, 0f)

        o3.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun inSideBottom(view: View, duration: Long = 1000): AnimatorSet {
        val parent = view.parent as ViewGroup
        val range = (parent.height - view.top).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", range, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun outSideBottom(view: View, duration: Long = 1000): AnimatorSet {
        val bottom = -view.bottom.toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, bottom)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, 0f)

        o3.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun inSideRight(view: View, duration: Long = 1000): AnimatorSet {
        val parent = view.parent as ViewGroup
        val range = (parent.width - view.left).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", -range, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun outSideRight(view: View, duration: Long = 1000): AnimatorSet {
        val right = view.right.toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f, -right)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f, 0f)

        o3.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3)
    }

    fun inSideLeft(view: View, duration: Long = 1000): AnimatorSet {
        val parent = view.parent as ViewGroup
        val range = (parent.width - view.left).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", range, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun outSideLeft(view: View, duration: Long = 1000): AnimatorSet {
        val parent = view.parent as ViewGroup
        val range = (parent.width - view.left).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f, range)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f, 0f)

        o3.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3)
    }
}