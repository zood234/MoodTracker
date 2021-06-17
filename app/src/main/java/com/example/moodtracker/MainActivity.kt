package com.example.moodtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast
import java.io.*

var x1 = 1f
var y1 = 1f
var x2 = 1f
var y2 = 1f
val fileName ="Data"
internal var myExternalFile: File?=null
private val filepath = "MyFileStorage"

var day1 = arrayOf("Happy", "03/06/21", "Not Worked")
var day2 = arrayOf("Sad", "03/06/21", "Really  Sad today")
var day3 = arrayOf("Angry", "03/06/21", "Really  Angry today")
var day4 = arrayOf("Happy", "03/06/21", "Really  Happy today")
var day5 = arrayOf("Happy", "03/06/21", "Really  Happy today")
var day6 = arrayOf("Happy", "03/06/21", "Really  Happy today")
var day7 = arrayOf("Happy", "03/06/21", "Really  Happy today")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onTouchEvent(touchevent: MotionEvent): Boolean {
        write("Holy Crap This worked what now")
        load()
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

    fun load() : String{
        val stringBuilder: StringBuilder = StringBuilder()
        myExternalFile = File(getExternalFilesDir(filepath),fileName)
        if(fileName.toString()!=null && fileName.toString().trim()!=""){
            var fileInputStream = FileInputStream(myExternalFile)
            var inputStreamReader: InputStreamReader = InputStreamReader(fileInputStream)
            val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)
            var text: String? = null //change this so i pass it in
            while ({ text = bufferedReader.readLine(); text }() != null) {
                stringBuilder.append(text)
            }
            fileInputStream.close()

        }
        Toast.makeText(this, stringBuilder.toString(), Toast.LENGTH_LONG).show()
        return stringBuilder.toString()
    }

    fun write(writeToFile: String){
        val stringBuilder: StringBuilder = StringBuilder()
        val fileData1 = writeToFile


        myExternalFile = File(getExternalFilesDir(filepath), fileName)
        try {
            val fileOutPutStream = FileOutputStream(myExternalFile)
            fileOutPutStream.write(fileData1.toString().toByteArray())
            fileOutPutStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        //    Toast.makeText(applicationContext,"data save", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, stringBuilder.toString(), Toast.LENGTH_LONG).show()
    }



}