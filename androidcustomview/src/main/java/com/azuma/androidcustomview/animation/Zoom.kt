package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.androidcustomview.util.AnimSet

class Zoom {
    fun inSide(view: View, duration: Long = 1000): AnimatorSet {
        val o1 = ObjectAnimator.ofFloat(view, "scaleX", 0.5f, 1f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleY", 0.5f, 1f)
        val o3 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2 , o3)
    }

    fun outSide(view: View, duration: Long = 1000): AnimatorSet {
        val o1 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.3f, 0f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.3f, 0f)
        val o3 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f, 0f)

        return AnimSet.set(view, duration, o1, o2 , o3)
    }

    fun inSideTop(view: View, duration: Long = 1000): AnimatorSet {
        val start = -view.bottom.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 1f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 1f)
        val o3 = ObjectAnimator.ofFloat(view, "translationY", start, 0f)
        val o4 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun outSideTop(view: View, duration: Long = 1000): AnimatorSet {
        val end = -view.bottom.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.1f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.1f)
        val o3 = ObjectAnimator.ofFloat(view, "translationY", 0f, end)
        val o4 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f, 0f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun inSideBottom(view: View, duration: Long = 1000): AnimatorSet {
        val start = view.bottom.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 1f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 1f)
        val o3 = ObjectAnimator.ofFloat(view, "translationY", start, 0f)
        val o4 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun outSideBottom(view: View, duration: Long = 1000): AnimatorSet {
        val end = view.bottom.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.1f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.1f)
        val o3 = ObjectAnimator.ofFloat(view, "translationY", 0f, end)
        val o4 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f, 0f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun inSideLeft(view: View, duration: Long = 1000): AnimatorSet {
        val start = -view.right.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 1f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 1f)
        val o3 = ObjectAnimator.ofFloat(view, "translationX", start, 0f)
        val o4 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun outSideLeft(view: View, duration: Long = 1000): AnimatorSet {
        val end = -view.right.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.1f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.1f)
        val o3 = ObjectAnimator.ofFloat(view, "translationX", 0f, end)
        val o4 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f, 0f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun inSideRight(view: View, duration: Long = 1000): AnimatorSet {
        val start = view.right.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 1f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleY", 0.1f, 1f)
        val o3 = ObjectAnimator.ofFloat(view, "translationX", start, 0f)
        val o4 = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun outSideRight(view: View, duration: Long = 1000): AnimatorSet {
        val end = view.right.toFloat()

        val o1 = ObjectAnimator.ofFloat(view, "scaleX", 1f, 0.1f)
        val o2 = ObjectAnimator.ofFloat(view, "scaleY", 1f, 0.1f)
        val o3 = ObjectAnimator.ofFloat(view, "translationX", 0f, end)
        val o4 = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f, 0f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }
}