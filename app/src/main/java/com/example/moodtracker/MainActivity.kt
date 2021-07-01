package com.example.moodtracker

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.io.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.io.File

internal var myExternalFile: File? = null
var Days = Day()
var y1 = 1f
var y2 = 1f
var scrollUp = false
var scrollDown = false

class MainActivity : AppCompatActivity() {
    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        assignCurrentDate()
        Days.currentDay[0] = "Normal"  //assigns the the day to normal as default
        turnStringIntoArray()
        write(turnAllArraysString())
        historyIV.setOnClickListener {
            val intent = Intent(this, History::class.java)
            startActivity(intent)
        }
        //launches comment button
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

    //Lets the user move to diffrent activitys
    override fun onTouchEvent(touchevent: MotionEvent): Boolean {
        when (touchevent.action) {
            MotionEvent.ACTION_DOWN -> {
                y1 = touchevent.y
            }
            MotionEvent.ACTION_UP -> {
                y2 = touchevent.y

                if (y1 < y2) {
                    scrollUp
                    val i = Intent(this@MainActivity, BadMood::class.java)
                    startActivity(i)
                }
                if (y1 > y2) {
                    !scrollDown
                    val i = Intent(this@MainActivity, GoodMood::class.java)
                    startActivity(i)
                }
            }
        }
        return false
    }

    //gets current date and formats it to British date standards
    private fun assignCurrentDate() {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        Days.currentDay[1] = current.format(formatter)
        //  Toast.makeText(this, Days.currentDay[1], Toast.LENGTH_LONG).show()
    }

    //Loads file and then returns it back as a string
    private fun load(): String {
        val filepath = "MyFileStorage"
        val fileName = "Data"
        val stringBuilder: StringBuilder = StringBuilder()
        myExternalFile = File(getExternalFilesDir(filepath), fileName)
        val fileInputStream = FileInputStream(myExternalFile)
        val inputStreamReader = InputStreamReader(fileInputStream)
        val bufferedReader = BufferedReader(inputStreamReader)
        var text: String? = null
        var file = File(fileName)
        var fileExists = file.exists()



        while ({ text = bufferedReader.readLine(); text }() != null) {
            stringBuilder.append(text)
        }
        fileInputStream.close()
        return stringBuilder.toString()
    }


    //Puts the long string into the relevant arrays
    private fun turnStringIntoArray() {


        try {
            val splitString = load().split("?").toTypedArray()
            Days.day1 = splitString[0].split("-").toTypedArray()
            Days.day2 = splitString[1].split("-").toTypedArray()
            Days.day3 = splitString[2].split("-").toTypedArray()
            Days.day4 = splitString[3].split("-").toTypedArray()
            Days.day5 = splitString[4].split("-").toTypedArray()
            Days.day6 = splitString[5].split("-").toTypedArray()
            Days.day7 = splitString[6].split("-").toTypedArray()

        } catch (e: IOException) {
            e.printStackTrace()

        }
    }


    //Turns all the arrays into a string
    private fun turnAllArraysString(): String {

        return Days.day1[0] + "-" + Days.day1[1] + "-" + Days.day1[2] + "?" +
                Days.day2[0] + "-" + Days.day2[1] + "-" + Days.day2[2] + "?" +
                Days.day3[0] + "-" + Days.day3[1] + "-" + Days.day3[2] + "?" +
                Days.day4[0] + "-" + Days.day4[1] + "-" + Days.day4[2] + "?" +
                Days.day5[0] + "-" + Days.day5[1] + "-" + Days.day5[2] + "?" +
                Days.day6[0] + "-" + Days.day6[1] + "-" + Days.day6[2] + "?" +
                Days.day7[0] + "-" + Days.day7[1] + "-" + Days.day7[2] + "?"
    }

    //Writes a string into file
    private fun write(writeToFile: String) {
        val filepath = "MyFileStorage"
        val fileName = "Data"

        myExternalFile = File(getExternalFilesDir(filepath), fileName)
        try {
            val fileOutPutStream = FileOutputStream(myExternalFile)
            fileOutPutStream.write(writeToFile.toByteArray())
            fileOutPutStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }



}