package com.customview.azuma.customviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.Animation
import com.azuma.androidcustomview.ScaleButton
import com.azuma.androidcustomview.animation.Bound

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // https://github.com/gayanvoice/android-view-animations-daimajia-kotlin
        val box = findViewById<View>(R.id.box)
        box.setOnClickListener {
            Bound().fadeCenter(box).start()
        }
    }
}
