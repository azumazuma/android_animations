package com.azuma.android_animation.util

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View

object AnimSet {
    fun set(view: View, duration: Long, vararg animators: ObjectAnimator ): AnimatorSet {
        val anim = AnimatorSet()

        anim.playTogether(*animators)
        anim.duration = duration
        anim.setTarget(view)

        return anim
    }
}