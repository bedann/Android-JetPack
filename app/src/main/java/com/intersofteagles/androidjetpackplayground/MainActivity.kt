package com.intersofteagles.androidjetpackplayground

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.intersofteagles.androidjetpackplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.user = User("Jack", "Reacher", "Male")

    }


    //This function checks if any two numbers in the array provided can add up to the specified sum
    public fun canAddUp(numbers:IntArray, sum:Int):Boolean{
        numbers.forEachIndexed { index, x ->
            numbers.forEachIndexed { index2, y ->
                if(index2 != index){
                    val result = x + y
                    if(result == sum)return true
                }
            }
        }
        return false
    }

}
