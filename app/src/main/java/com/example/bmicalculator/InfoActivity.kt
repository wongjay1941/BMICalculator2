package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bmicalculator.databinding.ActivityInfoBinding

//To eliminate the use of findViewByID method, no need to use it
//lateinit = late initialize, var = variable
private lateinit var binding: ActivityInfoBinding

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Associate view(s) to code
        binding = ActivityInfoBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_info)
        setContentView(binding.root)

        //Using binding will save the steps to declare variables, using methods, etc
        binding.buttonClose.setOnClickListener{
            finish()// Close the activity
        }
    }
}