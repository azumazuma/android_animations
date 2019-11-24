package com.customview.azuma.customviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ListView
import com.azuma.androidcustomview.animation.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val box = findViewById<View>(R.id.box)
//        box.setOnClickListener {
//            Door().rightClose(box).start()
//        }
        val image = findViewById<ImageView>(R.id.image)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = CustomListView(applicationContext, image)
    }
}
