package com.intersofteagles.androidjetpackplayground

import org.junit.Assert.*
import org.junit.Test

class MainActivityTest{


    @Test
    fun testCanAddUp(){
        val mainActivity = MainActivity()
        assertEquals(true,mainActivity.canAddUp(intArrayOf(1,2,4,4),8))
    }

}