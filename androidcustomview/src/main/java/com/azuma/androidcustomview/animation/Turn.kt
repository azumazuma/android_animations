package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.androidcustomview.util.AnimSet

class Turn {
    fun inSideAxisTopLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = 0f

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -90f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun outSideAxisTopLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = 0f

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 90f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }


    fun inSideAxisTopRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = 0f

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view,    "rotation", 90f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view,    "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun outSideAxisTopRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = 0f

        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -90f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }
//
    fun inSideAxisBottomLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -90f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun outSideAxisBottomLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 90f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun inSideAxisBottomRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view,    "rotation", 90f, 0f)
        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotX", x, x)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotY", y, y)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view,    "alpha", 0f, 1f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }

    fun outSideAxisBottomRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val o2: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -90f)
        val o3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val o4: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val o1: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, o1, o2, o3, o4)
    }
}