package com.example.moodtracker


import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.moodtracker.view.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


class DayTestUI {


    @RunWith(AndroidJUnit4::class)
    @LargeTest
    class MoodTrackerTest {

        private lateinit var stringToBetyped: String

        @get:Rule
        var activityRule: ActivityScenarioRule<MainActivity> =
            ActivityScenarioRule(MainActivity::class.java)

        @Before
        fun initValidString() {
            // Specify a valid string.
            stringToBetyped = "Espresso"
        }

        @Test
        fun checkSwipeUp() {
            y1 = 2.2f
            y2 = 4.2f
            if (y1 < y2) {
                assert(goodMood)
            }
        }


        @Test
        fun checkSwipeDown() {
            y1 = 7.2f
            y2 = 4.2f
            if (y1 < y2) {
                assert(worseMood)
            }


        }


    }
}