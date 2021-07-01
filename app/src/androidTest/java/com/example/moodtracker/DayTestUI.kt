package com.example.moodtracker

import androidx.test.espresso.Espresso.onView
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Assert

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
                assert(scrollUp)
            }
        }

        @Test
        fun checkSwipeDown() {
            y1 = 7.2f
            y2 = 4.2f
            if (y1 < y2) {
                assert(scrollDown)
            }


        }


    }
}