package com.example.moodtracker


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class DayTest {

    @Test
    fun commentLessThanThreeCharacters() {
        val result =Days.minMaxChecker("dss")
        assertThat(result).isFalse()
    }

}