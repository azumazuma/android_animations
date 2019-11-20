package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.androidcustomview.util.AnimSet

class Roll {
    fun topInSide(view: View, duration: Long = 1000): AnimatorSet {

        return AnimatorSet()
    }

    fun topOutSide(view: View, duration: Long = 1000): AnimatorSet {

        return AnimatorSet()
    }

    fun bottomInSide(view: View, duration: Long = 1000): AnimatorSet {

        return AnimatorSet()
    }

    fun bottomOutSide(view: View, duration: Long = 1000): AnimatorSet {
        
        return AnimatorSet()
    }

    fun leftInSide(view: View, duration: Long = 1000): AnimatorSet {
        val start = -view.right.toFloat()
        val o1 = ObjectAnimator.ofFloat(view, "translationX", start, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -180f, 0f)

        return AnimSet.set(view, duration, o1, o2)
    }

    fun leftOutSide(view: View, duration: Long = 1000): AnimatorSet {

        return AnimatorSet()
    }

    fun rightInSide(view: View, duration: Long = 1000): AnimatorSet {

        return AnimatorSet()
    }

    fun rightOutSide(view: View, duration: Long = 1000): AnimatorSet {

        return AnimatorSet()
    }
}