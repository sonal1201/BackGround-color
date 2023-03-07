package com.examp.radiobuttons

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var linear : LinearLayout
    lateinit var red : RadioButton
    lateinit var blue : RadioButton
    lateinit var black : RadioButton
    lateinit var gray : RadioButton
    lateinit var button : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linear = findViewById(R.id.linear)
        red = findViewById(R.id.red)
        blue = findViewById(R.id.blue)
        black = findViewById(R.id.black)
        gray = findViewById(R.id.gray)
        button =findViewById(R.id.button)

        button.setOnClickListener {
            if(red.isChecked){
                linear.setBackgroundColor(Color.RED)
            }
            else if(blue.isChecked){
                linear.setBackgroundColor(Color.BLUE)
            }
            else if(black.isChecked){
                linear.setBackgroundColor(Color.BLACK)
            }
            else if(gray.isChecked){
                linear.setBackgroundColor(Color.GRAY)
            }
        }
    }
}