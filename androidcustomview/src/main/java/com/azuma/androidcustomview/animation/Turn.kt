package com.azuma.androidcustomview.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.azuma.androidcustomview.util.AnimSet

class Turn {
    fun inSideAxisTopLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = 0f

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -90f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val object4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, object1, object2, object3, object4)
    }

    fun outSideAxisTopLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = 0f

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 90f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, object1, object2, object3, object4)
    }


    fun inSideAxisTopRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = 0f

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,    "rotation", 90f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotX", x, x)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotY", y, y)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view,    "alpha", 0f, 1f)

        return AnimSet.set(view, duration, object1, object2, object3, object4)
    }

    fun outSideAxisTopRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = 0f

        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -90f)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, object1, object2, object3, object4)
    }
//
    fun inSideAxisBottomLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val object1: ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", -90f, 0f)
        val object2: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object3: ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val object4: ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

        return AnimSet.set(view, duration, object1, object2, object3, object4)
    }

    fun outSideAxisBottomLeft(view: View, duration: Long = 1000): AnimatorSet {
        val x = view.paddingLeft.toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, 90f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, object1, object2, object3, object4)
    }

    fun inSideAxisBottomRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view,    "rotation", 90f, 0f)
        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotX", x, x)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view,    "pivotY", y, y)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view,    "alpha", 0f, 1f)

        return AnimSet.set(view, duration, object1, object2, object3, object4)
    }

    fun outSideAxisBottomRight(view: View, duration: Long = 1000): AnimatorSet {
        val x = (view.width - view.paddingRight).toFloat()
        val y = (view.height - view.paddingBottom).toFloat()

        val object2:ObjectAnimator = ObjectAnimator.ofFloat(view, "rotation", 0f, -90f)
        val object3:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotX", x, x)
        val object4:ObjectAnimator = ObjectAnimator.ofFloat(view, "pivotY", y, y)
        val object1:ObjectAnimator = ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

        return AnimSet.set(view, duration, object1, object2, object3, object4)
    }
}