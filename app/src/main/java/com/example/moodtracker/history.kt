package com.example.moodtracker

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_history.*
import java.io.*
import java.lang.System.load
import java.nio.file.Files.write

//Create function that moves currentDay to day 1 and move all the days up and then delete day 7

class history : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        assignToday()
        assignDay2()
        assignDay3()
        assignDay4()
        assignDay5()
        assignDay6()
        assignDay7()

        commentToday.setOnClickListener {
            Toast.makeText(this, Days.day1[2].toString(), Toast.LENGTH_LONG).show()
        }
        comment2DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day2[2].toString(), Toast.LENGTH_LONG).show()
        }
        comment3DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day3[2].toString(), Toast.LENGTH_LONG).show()
        }
        comment4DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day4[2].toString(), Toast.LENGTH_LONG).show()
        }
        comment5DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day5[2].toString(), Toast.LENGTH_LONG).show()
        }
        comment6DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day6[2].toString(), Toast.LENGTH_LONG).show()
        }
        comment7DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day7[2].toString(), Toast.LENGTH_LONG).show()
        }

    }



    fun assignToday(){
        if(Days.day1[2] == "") {
            commentToday.visibility = View.INVISIBLE
        }

        if( Days.day1[0] == "Great"){
            day1Layout.layoutParams.width = 1080
            day1Layout.setBackgroundColor(Color.YELLOW)
        }

        if( Days.day1[0] == "Happy"){
            day1Layout.layoutParams.width = 900
            day1Layout.setBackgroundColor(Color.GREEN)
        }

        if( Days.day1[0] == "Normal"){
            day1Layout.layoutParams.width = 720
            day1Layout.setBackgroundColor(Color.BLUE)
        }

        if( Days.day1[0] == "Angry"){
            day1Layout.layoutParams.width = 540
            day1Layout.setBackgroundColor(Color.GRAY)
        }

        if( Days.day1[0] == "VAngry"){
            day1Layout.layoutParams.width = 360
            day1Layout.setBackgroundColor(Color.RED)
        }
    }

    fun assignDay2(){
        if(Days.day2[2] == "") {
            comment2DaysAgo.visibility = View.INVISIBLE
        }

        if( Days.day2[0] == "Great"){
            day2Layout.getLayoutParams().width = 1080
            day2Layout.setBackgroundColor(Color.YELLOW)
        }

        if( Days.day2[0] == "Happy"){
            day2Layout.getLayoutParams().width = 900
            day2Layout.setBackgroundColor(Color.GREEN)
        }

        if( Days.day2[0] == "Normal"){
            day2Layout.getLayoutParams().width = 720
            day2Layout.setBackgroundColor(Color.BLUE)
        }

        if( Days.day2[0] == "Angry"){
            day2Layout.getLayoutParams().width = 540
            day2Layout.setBackgroundColor(Color.GRAY)
        }

        if( Days.day2[0] == "VAngry"){
            day2Layout.getLayoutParams().width = 360
            day2Layout.setBackgroundColor(Color.RED)
        }
    }

    fun assignDay3(){
        if(Days.day3[2] == "") {
            comment3DaysAgo.visibility = View.INVISIBLE
        }
        if( Days.day3[0] == "Great"){
            day3Layout.getLayoutParams().width = 1080
            day3Layout.setBackgroundColor(Color.YELLOW)
        }

        if( Days.day3[0] == "Happy"){
            day3Layout.getLayoutParams().width = 900
            day3Layout.setBackgroundColor(Color.GREEN)
        }

        if( Days.day3[0] == "Normal"){
            day3Layout.getLayoutParams().width = 720
            day3Layout.setBackgroundColor(Color.BLUE)
        }

        if( Days.day3[0] == "Angry"){
            day3Layout.getLayoutParams().width = 540
            day3Layout.setBackgroundColor(Color.GRAY)
        }

        if( Days.day3[0] == "VAngry"){
            day3Layout.getLayoutParams().width = 360
            day3Layout.setBackgroundColor(Color.RED)
        }
    }

    fun assignDay4(){

        if(Days.day4[2] == "") {
            comment4DaysAgo.visibility = View.INVISIBLE
        }
        if( Days.day4[0] == "Great"){
            day4Layout.getLayoutParams().width = 1080
            day4Layout.setBackgroundColor(Color.YELLOW)
        }

        if( Days.day4[0] == "Happy"){
            day4Layout.getLayoutParams().width = 900
            day4Layout.setBackgroundColor(Color.GREEN)
        }

        if( Days.day4[0] == "Normal"){
            day4Layout.getLayoutParams().width = 720
            day4Layout.setBackgroundColor(Color.BLUE)
        }

        if( Days.day4[0] == "Angry"){
            day4Layout.getLayoutParams().width = 540
            day4Layout.setBackgroundColor(Color.GRAY)
        }

        if( Days.day4[0] == "VAngry"){
            day4Layout.getLayoutParams().width = 360
            day4Layout.setBackgroundColor(Color.RED)
        }
    }


    fun assignDay5(){

        if(Days.day5[2] == "") {
            comment5DaysAgo.visibility = View.INVISIBLE
        }
        if( Days.day5[0] == "Great"){
            day5Layout.getLayoutParams().width = 1080
            day5Layout.setBackgroundColor(Color.YELLOW)
        }

        if( Days.day5[0] == "Happy"){
            day5Layout.getLayoutParams().width = 900
            day5Layout.setBackgroundColor(Color.GREEN)
        }

        if( Days.day5[0] == "Normal"){
            day5Layout.getLayoutParams().width = 720
            day5Layout.setBackgroundColor(Color.BLUE)
        }

        if( Days.day5[0] == "Angry"){
            day5Layout.getLayoutParams().width = 540
            day5Layout.setBackgroundColor(Color.GRAY)
        }

        if( Days.day5[0] == "VAngry"){
            day5Layout.getLayoutParams().width = 360
            day5Layout.setBackgroundColor(Color.RED)
        }
    }

    fun assignDay6(){

        if(Days.day6[2] == "") {
            comment6DaysAgo.visibility = View.INVISIBLE
        }
        if( Days.day6[0] == "Great"){
            day6Layout.getLayoutParams().width = 1080
            day6Layout.setBackgroundColor(Color.YELLOW)
        }

        if( Days.day6[0] == "Happy"){
            day6Layout.getLayoutParams().width = 900
            day6Layout.setBackgroundColor(Color.GREEN)
        }

        if( Days.day6[0] == "Normal"){
            day6Layout.getLayoutParams().width = 720
            day6Layout.setBackgroundColor(Color.BLUE)
        }

        if( Days.day6[0] == "Angry"){
            day6Layout.getLayoutParams().width = 540
            day6Layout.setBackgroundColor(Color.GRAY)
        }

        if( Days.day6[0] == "VAngry"){
            day6Layout.getLayoutParams().width = 360
            day6Layout.setBackgroundColor(Color.RED)
        }
    }

    fun assignDay7(){

        if(Days.day7[2] == "") {
            comment7DaysAgo.visibility = View.INVISIBLE
        }

        if( Days.day7[0] == "Great"){
            day7Layout.getLayoutParams().width = 1080
            day7Layout.setBackgroundColor(Color.YELLOW)
        }

        if( Days.day7[0] == "Happy"){
            day7Layout.getLayoutParams().width = 900
            day7Layout.setBackgroundColor(Color.GREEN)
        }

        if( Days.day7[0] == "Normal"){
            day7Layout.getLayoutParams().width = 720
            day7Layout.setBackgroundColor(Color.BLUE)
        }

        if( Days.day7[0] == "Angry"){
            day7Layout.getLayoutParams().width = 540
            day7Layout.setBackgroundColor(Color.GRAY)
        }

        if( Days.day7[0] == "VAngry"){
            day7Layout.getLayoutParams().width = 360
            day7Layout.setBackgroundColor(Color.RED)
        }
    }




}