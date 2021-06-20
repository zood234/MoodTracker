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

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
  //     turnStringIntoArray() //load
        daysMover()
        assignToday()
        assignDay2()
        assignDay3()
        assignDay4()
        assignDay5()
        assignDay6()
        assignDay7()
   //    write(turnAllArraysString()) //write

        commentToday.setOnClickListener {
            Toast.makeText(this, Days.day1[2], Toast.LENGTH_LONG).show()
        }
        comment2DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day2[2], Toast.LENGTH_LONG).show()
        }
        comment3DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day3[2], Toast.LENGTH_LONG).show()
        }
        comment4DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day4[2], Toast.LENGTH_LONG).show()
        }
        comment5DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day5[2], Toast.LENGTH_LONG).show()
        }
        comment6DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day6[2], Toast.LENGTH_LONG).show()
        }
        comment7DaysAgo.setOnClickListener {
            Toast.makeText(this, Days.day7[2], Toast.LENGTH_LONG).show()
        }

    }

    private fun daysMover() {

        //checks to see if you have used the app today or not
        if (Days.currentDay[1] == Days.day1[1]) {
            Days.day1[0] = Days.currentDay[0]
            Days.day1[1] = Days.currentDay[1]
            Days.day1[2] = Days.currentDay[2]
        }

        else if (Days.currentDay[1] == "") {

        }
        //moves everything up the array and deletes day 7
        //create a for loop that iterates through them all

        else {
            var i = 0
            for (i in 0..2) {
                Days.day7[i] = Days.day6[i]
                Days.day6[i] = Days.day5[i]
                Days.day5[i] = Days.day4[i]
                Days.day4[i] = Days.day3[i]
                Days.day3[i] = Days.day2[i]
                Days.day2[i] = Days.day1[i]
                Days.day1[i] = Days.currentDay[i]
            }
        }


//        for (i in 0..2) {
//            Days.day7[i] = Days.day6[i]
//            Days.day6[i] = Days.day5[i]
//            Days.day5[i] = Days.day4[i]
//            Days.day4[i] = Days.day3[i]
//            Days.day3[i] = Days.day2[i]
//            Days.day2[i] = Days.day1[i]
//            Days.day1[i] = Days.currentDay[i]
//        }
    }

    private fun assignToday() {
        if (Days.day1[2] == "") {
            commentToday.visibility = View.INVISIBLE
        }

        if (Days.day1[0] == "Great") {
            day1Layout.layoutParams.width = 1080
            day1Layout.setBackgroundColor(Color.parseColor("#FFFFEB3B"))
        }

        if (Days.day1[0] == "Happy") {
            day1Layout.layoutParams.width = 900
            day1Layout.setBackgroundColor(Color.parseColor("#FF99CC00"))
        }

        if (Days.day1[0] == "Normal") {
            day1Layout.layoutParams.width = 720
            day1Layout.setBackgroundColor(Color.parseColor("#FF33B5E5"))
        }

        if (Days.day1[0] == "Angry") {
            day1Layout.layoutParams.width = 540
            day1Layout.setBackgroundColor(Color.parseColor("#FFBEBEBE"))
        }

        if (Days.day1[0] == "VAngry") {
            day1Layout.layoutParams.width = 360
            day1Layout.setBackgroundColor(Color.parseColor("#FFCC0000"))
        }
    }

    private fun assignDay2() {
        if (Days.day2[2] == "") {
            comment2DaysAgo.visibility = View.INVISIBLE
        }

        if (Days.day2[0] == "Great") {
            day2Layout.layoutParams.width = 1080
            day2Layout.setBackgroundColor(Color.parseColor("#FFFFEB3B"))
        }

        if (Days.day2[0] == "Happy") {
            day2Layout.layoutParams.width = 900
            day2Layout.setBackgroundColor(Color.parseColor("#FF99CC00"))
        }

        if (Days.day2[0] == "Normal") {
            day2Layout.layoutParams.width = 720
            day2Layout.setBackgroundColor(Color.parseColor("#FF33B5E5"))
        }

        if (Days.day2[0] == "Angry") {
            day2Layout.layoutParams.width = 540
            day2Layout.setBackgroundColor(Color.parseColor("#FFBEBEBE"))
        }

        if (Days.day2[0] == "VAngry") {
            day2Layout.layoutParams.width = 360
            day2Layout.setBackgroundColor(Color.parseColor("#FFCC0000"))
        }
    }

    fun assignDay3() {
        if (Days.day3[2] == "") {
            comment3DaysAgo.visibility = View.INVISIBLE
        }
        if (Days.day3[0] == "Great") {
            day3Layout.layoutParams.width = 1080
            day3Layout.setBackgroundColor(Color.parseColor("#FFFFEB3B"))
        }

        if (Days.day3[0] == "Happy") {
            day3Layout.layoutParams.width = 900
            day3Layout.setBackgroundColor(Color.parseColor("#FF99CC00"))
        }

        if (Days.day3[0] == "Normal") {
            day3Layout.layoutParams.width = 720
            day3Layout.setBackgroundColor(Color.parseColor("#FF33B5E5"))
        }

        if (Days.day3[0] == "Angry") {
            day3Layout.layoutParams.width = 540
            day3Layout.setBackgroundColor(Color.parseColor("#FFBEBEBE"))
        }

        if (Days.day3[0] == "VAngry") {
            day3Layout.layoutParams.width = 360
            day3Layout.setBackgroundColor(Color.parseColor("#FFCC0000"))
        }
    }

    private fun assignDay4() {

        if (Days.day4[2] == "") {
            comment4DaysAgo.visibility = View.INVISIBLE
        }
        if (Days.day4[0] == "Great") {
            day4Layout.layoutParams.width = 1080
            day4Layout.setBackgroundColor(Color.parseColor("#FFFFEB3B"))
        }

        if (Days.day4[0] == "Happy") {
            day4Layout.layoutParams.width = 900
            day4Layout.setBackgroundColor(Color.parseColor("#FF99CC00"))
        }

        if (Days.day4[0] == "Normal") {
            day4Layout.layoutParams.width = 720
            day4Layout.setBackgroundColor(Color.parseColor("#FF33B5E5"))
        }

        if (Days.day4[0] == "Angry") {
            day4Layout.layoutParams.width = 540
            day4Layout.setBackgroundColor(Color.parseColor("#FFBEBEBE"))
        }

        if (Days.day4[0] == "VAngry") {
            day4Layout.layoutParams.width = 360
            day4Layout.setBackgroundColor(Color.parseColor("#FFCC0000"))
        }
    }


    private fun assignDay5() {

        if (Days.day5[2] == "") {
            comment5DaysAgo.visibility = View.INVISIBLE
        }
        if (Days.day5[0] == "Great") {
            day5Layout.layoutParams.width = 1080
            day5Layout.setBackgroundColor(Color.parseColor("#FFFFEB3B"))
        }

        if (Days.day5[0] == "Happy") {
            day5Layout.layoutParams.width = 900
            day5Layout.setBackgroundColor(Color.parseColor("#FF99CC00"))
        }

        if (Days.day5[0] == "Normal") {
            day5Layout.layoutParams.width = 720
            day5Layout.setBackgroundColor(Color.parseColor("#FF33B5E5"))
        }

        if (Days.day5[0] == "Angry") {
            day5Layout.layoutParams.width = 540
            day5Layout.setBackgroundColor(Color.parseColor("#FFBEBEBE"))
        }

        if (Days.day5[0] == "VAngry") {
            day5Layout.layoutParams.width = 360
            day5Layout.setBackgroundColor(Color.parseColor("#FFCC0000"))
        }
    }

    private fun assignDay6() {

        if (Days.day6[2] == "") {
            comment6DaysAgo.visibility = View.INVISIBLE
        }
        if (Days.day6[0] == "Great") {
            day6Layout.layoutParams.width = 1080
            day6Layout.setBackgroundColor(Color.parseColor("#FFFFEB3B"))
        }

        if (Days.day6[0] == "Happy") {
            day6Layout.layoutParams.width = 900
            day6Layout.setBackgroundColor(Color.parseColor("#FF99CC00"))
        }

        if (Days.day6[0] == "Normal") {
            day6Layout.layoutParams.width = 720
            day6Layout.setBackgroundColor(Color.parseColor("#FF33B5E5"))
        }

        if (Days.day6[0] == "Angry") {
            day6Layout.layoutParams.width = 540
            day6Layout.setBackgroundColor(Color.parseColor("#FFBEBEBE"))
        }

        if (Days.day6[0] == "VAngry") {
            day6Layout.layoutParams.width = 360
            day6Layout.setBackgroundColor(Color.parseColor("#FFCC0000"))
        }
    }

    private fun assignDay7() {
        if (Days.day7[2] == "") {
            comment7DaysAgo.visibility = View.INVISIBLE
        }
        if (Days.day7[0] == "Great") {
            day7Layout.layoutParams.width = 1080
            day7Layout.setBackgroundColor(Color.parseColor("#FFFFEB3B"))
        }
        if (Days.day7[0] == "Happy") {
            day7Layout.layoutParams.width = 900
            day7Layout.setBackgroundColor(Color.parseColor("#FF99CC00"))
        }
        if (Days.day7[0] == "Normal") {
            day7Layout.layoutParams.width = 720
            day7Layout.setBackgroundColor(Color.parseColor("#FF33B5E5"))
        }
        if (Days.day7[0] == "Angry") {
            day7Layout.layoutParams.width = 540
            day7Layout.setBackgroundColor(Color.parseColor("#FFBEBEBE"))
        }
        if (Days.day7[0] == "VAngry") {
            day7Layout.layoutParams.width = 360
            day7Layout.setBackgroundColor(Color.parseColor("#FFCC0000"))
        }
    }

    private fun write(writeToFile: String) {
        val filepath = "MyFileStorage"
        val fileName = "Data"
        val fileData1 = writeToFile

        myExternalFile = File(getExternalFilesDir(filepath), fileName)
        try {
            val fileOutPutStream = FileOutputStream(myExternalFile)
            fileOutPutStream.write(fileData1.toByteArray())
            fileOutPutStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private fun turnAllArraysString(): String {
        val fileData = Days.day1[0] + "-" + Days.day1[1] + "-" + Days.day1[2] + "?" +
                Days.day2[0] + "-" + Days.day2[1] + "-" + Days.day2[2] + "?" +
                Days.day3[0] + "-" + Days.day3[1] + "-" + Days.day3[2] + "?" +
                Days.day4[0] + "-" + Days.day4[1] + "-" + Days.day4[2] + "?" +
                Days.day5[0] + "-" + Days.day5[1] + "-" + Days.day5[2] + "?" +
                Days.day6[0] + "-" + Days.day6[1] + "-" + Days.day6[2] + "?" +
                Days.day7[0] + "-" + Days.day7[1] + "-" + Days.day7[2] + "?"
        Toast.makeText(this, fileData, Toast.LENGTH_LONG).show()

        return fileData
    }

    private fun load(): String {
        val filepath = "MyFileStorage"
        val fileName = "Data"
        val stringBuilder: StringBuilder = StringBuilder()
        myExternalFile = File(getExternalFilesDir(filepath), fileName)
        var fileInputStream = FileInputStream(myExternalFile)
        var inputStreamReader = InputStreamReader(fileInputStream)
        val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)
        var text: String? = null //change this so i pass it in
        while ({ text = bufferedReader.readLine(); text }() != null) {
            stringBuilder.append(text)
        }
        fileInputStream.close()
        return stringBuilder.toString()
    }


    private fun turnStringIntoArray() {
        val splitString = load().split("?").toTypedArray()
        Days.day1 = splitString[0].split("-").toTypedArray()
        Days.day2 = splitString[1].split("-").toTypedArray()
        Days.day3 = splitString[2].split("-").toTypedArray()
        Days.day4 = splitString[3].split("-").toTypedArray()
        Days.day5 = splitString[4].split("-").toTypedArray()
        Days.day6 = splitString[5].split("-").toTypedArray()
        Days.day7 = splitString[6].split("-").toTypedArray()
    }
}