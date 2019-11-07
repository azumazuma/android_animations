package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

class Bound {

    fun fadeCenter(view: View, duration: Long = 1000): AnimatorSet {
        val anim = AnimatorSet()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 0.3f, 1.05f, 0.9f, 1f)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "scaleY", 0.3f, 1.05f, 0.9f, 1f)

        anim.playTogether(object1, object2, object3)
        anim.duration = duration
        anim.setTarget(view)
        return anim
    }

    fun downTop(view: View, duration: Long = 1000): AnimatorSet {
        val anim = AnimatorSet()
        val o1 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        val height = -view.height
        val o2 = ObjectAnimator.ofFloat(view, "translationY", height.toFloat() - 30f, 10f, 0f)

        anim.playTogether(o1, o2)
        anim.duration = duration
        anim.setTarget(view)
        return anim
    }

    fun upBottom(view: View, duration: Long = 1000): AnimatorSet {
        val anim = AnimatorSet()

        val o1 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        val height = view.height
        val o2 = ObjectAnimator.ofFloat(view, "translationY", height.toFloat(), 30f, -10f, 0f)

        anim.playTogether(o1, o2)
        anim.duration = duration
        anim.setTarget(view)
        return anim
    }

    fun slideRight(view: View, duration: Long = 1000): AnimatorSet {
        val anim = AnimatorSet()

        val o1 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        val width = -view.width.toFloat()
        val measureWidth = -view.measuredWidth.toFloat()
        val o2 = ObjectAnimator.ofFloat(view, "translationX", width + measureWidth, -30f, 10f, 0f)

        anim.playTogether(o1, o2)
        anim.duration = duration
        anim.setTarget(view)
        return anim
    }

    fun slideLeft(view: View, duration: Long = 1000): AnimatorSet {
        val anim = AnimatorSet()

        val o1 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f, 1f)
        val width = -view.width
        val o2 = ObjectAnimator.ofFloat(view, "translationX", width.toFloat(), 30f, -10f, 0f)

        anim.playTogether(o1, o2)
        anim.duration = duration
        anim.setTarget(view)
        return anim
    }
}