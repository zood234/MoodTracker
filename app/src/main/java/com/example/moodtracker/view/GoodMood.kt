package com.example.moodtracker.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.moodtracker.*
import kotlinx.android.synthetic.main.activity_bad_mood.commentIV
import kotlinx.android.synthetic.main.activity_good_mood.*


class GoodMood : AppCompatActivity() {
    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_good_mood)

        Days.currentDay[0] = "Happy"
        historyGoodIV.setOnClickListener {
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
                    if(editText.text.toString().length >3) {
                        Days.currentDay[2] = editText.text.toString()
                    }
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
                y1 = touchevent.y
            }
            MotionEvent.ACTION_UP -> {
                y2 = touchevent.y

                if (y1 < y2) {
                    val i = Intent(this@GoodMood, MainActivity::class.java)
                    startActivity(i)
                }
                if (y1 > y2) {
                    val i = Intent(this@GoodMood, GreatMood::class.java)
                    startActivity(i)
                }
            }
        }
        return false
    }

}