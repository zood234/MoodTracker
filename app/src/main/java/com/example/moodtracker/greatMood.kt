package com.example.moodtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_bad_mood.*
import kotlinx.android.synthetic.main.activity_bad_mood.commentIV
import kotlinx.android.synthetic.main.activity_great_mood.*

class greatMood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_great_mood)

        commentIV.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.comment_layout,null)
            val editText = dialogLayout.findViewById<EditText>(R.id.commentEditText)
            with(builder){
                setTitle("Enter Your Comment")
                setPositiveButton("Submit"){ dialog, which ->
                    Days.currentDay[2] = editText.text.toString()
                }
                setNegativeButton("Cancel"){dialog, which ->
                    Log.d("main", "Negative Button Clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
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

                if (y1 > y2) {
                    val i = Intent(this@greatMood, goodMood::class.java)
                    startActivity(i)
                }
            }
        }
        return false
    }

}