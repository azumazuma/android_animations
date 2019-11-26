package com.azuma.android_animation.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.android_animation.util.AnimSet

class Turn {
    fun inSide(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.width.toFloat() / 2
        val y = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -720f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun outSide(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.width.toFloat() / 2
        val y = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 720f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 0f)

        o5.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5)
    }

    fun inSideAxisTopLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = 0f

        val afterX = view.width.toFloat() / 2
        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -90f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)
        val o6: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o5.startDelay = duration
        o6.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5, o6)
    }

    fun outSideAxisTopLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = 0f

        val afterX = view.width.toFloat() / 2
        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 90f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 0f)
        val o6: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)
        val o7: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o5.startDelay = duration
        o6.startDelay = duration
        o7.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5, o6, o7)
    }


    fun inSideAxisTopRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = 0f

        val afterX = view.width.toFloat() / 2
        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view,    "rotation", 90f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view,    "alpha", 0f, 1f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)
        val o6: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o5.startDelay = duration
        o6.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5, o6)
    }

    fun outSideAxisTopRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = 0f

        val afterX = view.width.toFloat() / 2
        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -90f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 0f)
        val o6: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)
        val o7: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o5.startDelay = duration
        o6.startDelay = duration
        o7.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5, o6, o7)
    }

    fun inSideAxisBottomLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val afterX = view.width.toFloat() / 2
        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -90f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)
        val o6: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o5.startDelay = duration
        o6.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5, o6)
    }

    fun outSideAxisBottomLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val afterX = view.width.toFloat() / 2
        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 90f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 0f)
        val o6: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)
        val o7: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o5.startDelay = duration
        o6.startDelay = duration
        o7.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5, o6, o7)
    }

    fun inSideAxisBottomRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val afterX = view.width.toFloat() / 2
        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view,    "rotation", 90f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view,    "alpha", 0f, 1f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)
        val o6: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o5.startDelay = duration
        o6.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5, o6)
    }

    fun outSideAxisBottomRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val afterX = view.width.toFloat() / 2
        val afterY = view.height.toFloat() / 2

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -90f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)
        val o5: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 0f)
        val o6: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", afterX, afterX)
        val o7: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", afterY, afterY)

        o5.startDelay = duration
        o6.startDelay = duration
        o7.startDelay = duration
        return AnimSet.set(view, duration, o1, o2, o3, o4, o5, o6, o7)
    }
}