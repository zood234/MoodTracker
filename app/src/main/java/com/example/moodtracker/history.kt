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










    
    fun convertArraysToString(){
        var day1 = arrayOf("Happy", "03/06/21", "Not Worked")
        var day2 = arrayOf("Sad", "03/06/21", "Really  Sad today")
        var day3 = arrayOf("Angry", "03/06/21", "Really  Angry today")
        var day4 = arrayOf("Happy", "03/06/21", "Really  Happy today")
        var day5 = arrayOf("Happy", "03/06/21", "Really  Happy today")
        var day6 = arrayOf("Happy", "03/06/21", "Really  Happy today")
        var day7 = arrayOf("Happy", "03/06/21", "Really  Happy today")

        //write("dsa")


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