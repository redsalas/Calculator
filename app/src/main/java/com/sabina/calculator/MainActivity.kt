package com.sabina.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var _valueOne: Float = 0.0f
    var _valuteTwo: Float = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val display: TextView = findViewById(R.id.display)

        // Number
        one.setOnClickListener {
            display.text = display.text.toString() + "1"
        }

        two.setOnClickListener {
            display.text = display.text.toString() + "2"
        }

        three.setOnClickListener {
            display.text = display.text.toString() + "3"
        }

        four.setOnClickListener {
            display.text = display.text.toString() + "4"
        }

        five.setOnClickListener {
            display.text = display.text.toString() + "5"
        }

        six.setOnClickListener {
            display.text = display.text.toString() + "6"
        }

        seven.setOnClickListener {
            display.text = display.text.toString() + "7"
        }

        eight.setOnClickListener {
            display.text = display.text.toString() + "8"
        }

        nine.setOnClickListener {
            display.text = display.text.toString() + "9"
        }

        zero.setOnClickListener {
            display.text = display.text.toString() + "0"
        }

        //Functions
        clear.setOnClickListener {
            display.text = ""
        }
    }
}