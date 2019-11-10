package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import com.azuma.androidcustomview.util.AnimSet

class Slip {
    fun inSideTop(view: View, duration: Long = 1000): AnimatorSet {
        val distance = (view.top + view.height).toFloat()
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", -distance, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun outSideTop(view: View, duration: Long = 1000): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.height - view.top).toFloat()
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, distance)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun inSideBottom(view: View, duration: Long = 1000): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.height - view.top).toFloat()
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", distance, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun outSideBottom(view: View, duration: Long = 1000): AnimatorSet {
        val bottom = -view.bottom.toFloat()
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, bottom)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun inSideRight(view: View, duration: Long = 1000): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.width - view.left).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", -distance, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun outSideRight(view: View, duration: Long = 1000): AnimatorSet {
        val right = view.right.toFloat()
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f, -right)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun inSideLeft(view: View, duration: Long = 1000): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.width - view.left).toFloat()
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", distance, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun outSideLeft(view: View, duration: Long = 1000): AnimatorSet {
        val parent = view.parent as ViewGroup
        val distance = (parent.width - view.left).toFloat()
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f, distance)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }
}