package com.example.moodtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
var x1 = 1f
var y1 = 1f
var x2 = 1f
var y2 = 1f
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onTouchEvent(touchevent: MotionEvent): Boolean {


        when (touchevent.action) {
            MotionEvent.ACTION_DOWN -> {
                x1 = touchevent.x
                y1 = touchevent.y
            }
            MotionEvent.ACTION_UP -> {
                x2 = touchevent.x
                y2 = touchevent.y

                if (y1 < y2) {
                    val i = Intent(this@MainActivity, goodMood::class.java)
                    startActivity(i)
                }
                if (y1 > y2) {
                    val i = Intent(this@MainActivity, badMood::class.java)
                    startActivity(i)
               }
            }
        }
        return false
    }

}