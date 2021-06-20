package com.example.moodtracker

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_bad_mood.*
import kotlinx.android.synthetic.main.activity_bad_mood.commentIV

class BadMood : AppCompatActivity() {
    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad_mood)

        Days.currentDay[0] = "Angry"

        historyBadIV.setOnClickListener {
            val intent = Intent(this, History::class.java)
            startActivity(intent)

        }



        commentIV.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.comment_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.commentEditText)
            with(builder) {
                setTitle("Enter Your Comment")
                setPositiveButton("Submit") { _, _ ->
                    Days.currentDay[2] = editText.text.toString()
                }
                setNegativeButton("Cancel") { _, _ ->
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
                if (y1 < y2) {
                    val i = Intent(this@BadMood, MainActivity::class.java)
                    startActivity(i)
                }
                if (y1 > y2) {
                    val i = Intent(this@BadMood, VeryBadMood::class.java)
                    startActivity(i)
                }
            }
        }
        //  Toast.makeText(this, Days.day1[1], Toast.LENGTH_LONG).show()

        return false

    }


}