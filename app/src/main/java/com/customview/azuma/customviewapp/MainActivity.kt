package com.customview.azuma.customviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.azuma.androidcustomview.animation.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // https://github.com/gayanvoice/android-view-animations-daimajia-kotlin
        val box = findViewById<View>(R.id.box)
        box.setOnClickListener {
            Slip().inSideBottom(box).start()
        }
    }
}
