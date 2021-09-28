package com.example.buttonsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var numberSh: TextView
    private lateinit var Plus: Button
    private lateinit var Minus: Button
    private var control:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberSh = findViewById (R.id.numberChange)
        Plus = findViewById(R.id.Plus)
        Minus = findViewById(R.id.Minus)
        Plus.setOnClickListener{
         plus(true)
        }
        Minus.setOnClickListener{
           plus(false)
        }
    }
    fun plus(add: Boolean){
        if(add){
            control++
        }
        else{
            control--
        }
        numberSh.text = control.toString()
    }
}