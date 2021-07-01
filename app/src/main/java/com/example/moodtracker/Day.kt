package com.example.moodtracker

class Day {
    var day1 = arrayOf("", "", "")
    var day2 = arrayOf("", "", "")
    var day3 = arrayOf("", "", "")
    var day4 = arrayOf("", "", "")
    var day5 = arrayOf("", "", "")
    var day6 = arrayOf("", "", "")
    var day7 = arrayOf("", "", "")
    var currentDay = arrayOf("", "", "")

    //Checks to see if the comment is more than 3 characters
    fun minMaxChecker(comment: String): Boolean{
    currentDay[2] = comment
        return !(comment.length < 4 && comment!= "")
    }

}