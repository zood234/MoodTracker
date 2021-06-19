package com.example.moodtracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.*
internal var myExternalFile: File?=null

val Days = days()
var x1 = 1f
var y1 = 1f
var x2 = 1f
var y2 = 1f




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        historyIV.setOnClickListener {
            val intent = Intent(this, history::class.java)
            startActivity(intent)

        }

    }

    override fun onTouchEvent(touchevent: MotionEvent): Boolean {
//        val History = history()
//        History.write("Holy Crap This worked what now")
//     History.load()

//        val GoodMood = goodMood()
//        GoodMood.test()

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
        val filepath = "MyFileStorage"
        val fileName ="Data"
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
        val filepath = "MyFileStorage"
        val fileName ="Data"
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