package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.androidcustomview.util.AnimSet

class Roll {
    fun topInSide(view: View, duration: Long = 1000): AnimatorSet {
        val start = -view.bottom.toFloat()
        val o1 = ObjectAnimator.ofFloat(view, "translationY", start, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -180f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun topOutSide(view: View, duration: Long = 1000): AnimatorSet {
        val end = -view.bottom.toFloat()
        val o1 = ObjectAnimator.ofFloat(view, "translationY", 0f, end)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 180f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun bottomInSide(view: View, duration: Long = 1000): AnimatorSet {
        val start = view.bottom.toFloat()
        val o1 = ObjectAnimator.ofFloat(view, "translationY", start, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -180f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun bottomOutSide(view: View, duration: Long = 1000): AnimatorSet {
        val end = view.bottom.toFloat()
        val o1 = ObjectAnimator.ofFloat(view, "translationY", 0f, end)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 180f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun leftInSide(view: View, duration: Long = 1000): AnimatorSet {
        val start = -view.right.toFloat()
        val o1 = ObjectAnimator.ofFloat(view, "translationX", start, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -180f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun leftOutSide(view: View, duration: Long = 1000): AnimatorSet {
        val end = -view.right.toFloat()
        val o1 = ObjectAnimator.ofFloat(view, "translationX", 0f, end)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -180f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun rightInSide(view: View, duration: Long = 1000): AnimatorSet {
        val start = view.right.toFloat()
        val o1 = ObjectAnimator.ofFloat(view, "translationX", start, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 180f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun rightOutSide(view: View, duration: Long = 1000): AnimatorSet {
        val end = view.right.toFloat()
        val o1 = ObjectAnimator.ofFloat(view, "translationX", 0f, end)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 180f)

        return AnimSet.set(view, duration, o1, o2)
    }
}