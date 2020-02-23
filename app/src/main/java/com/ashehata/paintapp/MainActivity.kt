package com.ashehata.paintapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ashehata.paintapp.customCanvas.Canvas
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val canvas = Canvas(this, null)
        setContentView(R.layout.activity_main)

        btn_color.setOnClickListener {
            mCanvas.paint.apply {
                color = Color.BLACK
            }
        }

        btn_clear.setOnClickListener {

        }
    }
}
