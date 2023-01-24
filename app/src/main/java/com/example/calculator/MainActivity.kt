package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var one: Button
    private lateinit var two: Button
    private lateinit var three: Button
    private lateinit var four: Button
    private lateinit var five: Button
    private lateinit var six: Button
    private lateinit var seven: Button
    private lateinit var eight: Button
    private lateinit var nine: Button
    private lateinit var zero: Button

    private lateinit var plus: Button
    private lateinit var minus: Button

    private lateinit var clear: Button
    private lateinit var point: Button


    private lateinit var operand: TextView


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        zero = findViewById(R.id.zero)

        plus = findViewById(R.id.plus)
        minus = findViewById(R.id.minus)

        clear = findViewById(R.id.c)
        point = findViewById(R.id.nuqta)

        operand = findViewById(R.id.textView1)



        one.setOnClickListener(){
            operand.text = "1"
        }
        two.setOnClickListener(){
            operand.text = "2"
        }
        three.setOnClickListener(){
            operand.text = "3"
        }
        four.setOnClickListener(){
            operand.text = "4"
        }
        five.setOnClickListener(){
            operand.text = "5"
        }
        six.setOnClickListener(){
            operand.text = "6"
        }
        seven.setOnClickListener(){
            operand.text = "7"
        }
        eight.setOnClickListener(){
            operand.text = "8"
        }
        nine.setOnClickListener(){
            operand.text = "9"
        }
        zero.setOnClickListener(){
            operand.text = "0"
        }

        point.setOnClickListener(){
            operand.text = "."
        }

        plus.setOnClickListener(){
            operand.text = "+"
        }

        minus.setOnClickListener(){
            operand.text = "-"
        }



        clear.setOnClickListener {
            operand.text = " "
        }


    }



}