package com.example.moodtracker

import android.content.Intent
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

internal var myExternalFile: File? = null

val Days = Day()
var x1 = 1f
var y1 = 1f
var x2 = 1f
var y2 = 1f


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        assignCurrentDate()
        Days.currentDay[0] = "Normal"
        turnStringIntoArray()
        write(turnAllArraysString())
        historyIV.setOnClickListener {
            val intent = Intent(this, History::class.java)
            startActivity(intent)
        }

        // Toast.makeText(this, load(), Toast.LENGTH_LONG).show()

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
                    val i = Intent(this@MainActivity, GoodMood::class.java)
                    startActivity(i)
                }
                if (y1 > y2) {
                    val i = Intent(this@MainActivity, BadMood::class.java)
                    startActivity(i)
                }
            }
        }
        return false
    }

    private fun assignCurrentDate() {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        Days.currentDay[1] = current.format(formatter)
        //   Toast.makeText(this, Days.currentDay[1].toString(), Toast.LENGTH_LONG).show()
    }

    private fun load(): String {
        val filepath = "MyFileStorage"
        val fileName = "Data"
        val stringBuilder: StringBuilder = StringBuilder()
        myExternalFile = File(getExternalFilesDir(filepath), fileName)
        //  if(fileName.toString()!=null && fileName.toString().trim()!=""){
        var fileInputStream = FileInputStream(myExternalFile)
        var inputStreamReader = InputStreamReader(fileInputStream)
        val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)
        var text: String? = null //change this so i pass it in
        while ({ text = bufferedReader.readLine(); text }() != null) {
            stringBuilder.append(text)
        }
        fileInputStream.close()

        //   }
        // Toast.makeText(this, stringBuilder.toString(), Toast.LENGTH_LONG).show()
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
        Days.day6 = splitString[6].split("-").toTypedArray()
    }


    private fun turnAllArraysString(): String {
        val fileData = Days.day1[0] + "-" + Days.day1[1] + "-" + Days.day1[2] + "?" +
                Days.day2[0] + "-" + Days.day2[1] + "-" + Days.day2[2] + "?" +
                Days.day3[0] + "-" + Days.day3[1] + "-" + Days.day3[2] + "?" +
                Days.day4[0] + "-" + Days.day4[1] + "-" + Days.day4[2] + "?" +
                Days.day5[0] + "-" + Days.day5[1] + "-" + Days.day5[2] + "?" +
                Days.day6[0] + "-" + Days.day6[1] + "-" + Days.day6[2] + "?" +
                Days.day7[0] + "-" + Days.day7[1] + "-" + Days.day7[2] + "?"

        return fileData
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
        //    Toast.makeText(applicationContext,"data save", Toast.LENGTH_SHORT).show()
        //Toast.makeText(this, fileData1, Toast.LENGTH_LONG).show()
    }

}