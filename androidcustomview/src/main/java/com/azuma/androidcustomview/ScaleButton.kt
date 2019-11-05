package com.azuma.androidcustomview

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.Button
import androidx.annotation.ColorInt

class ScaleButton : Button {
    constructor(context: Context): this(context, null)

    constructor(context: Context, attrs: AttributeSet?): this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int): this(context, attrs, defStyleAttr, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int): super(context, attrs, defStyleAttr, defStyleRes) {
        init()
    }

    private fun init() {
        background = ColorDrawable(Color.RED)
    }

    override fun setPressed(pressed: Boolean) {
        if(pressed){
            this.scaleY = 0.50f
            this.scaleX = 0.50f
        }else{
            this.scaleY = 1.0f
            this.scaleX = 1.0f
        }
        super.setPressed(pressed)
    }
}