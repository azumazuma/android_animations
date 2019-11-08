package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

class Shake {
    fun week(view: View, duration: Long = 1000): AnimatorSet {
        val width = (view.width).toFloat()
        val one = (width / 100.0).toFloat()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f * one, -25f * one, 20f * one, -15f * one, 10f * one, -5f * one, 0f * one, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -5f, 3f, -3f, 2f, -1f, 0f)

        return AnimatorSet()
    }

    fun medium(): AnimatorSet {

        return AnimatorSet()
    }

    fun strength(): AnimatorSet {
        
        return AnimatorSet()
    }
}