package com.example.week4ex6

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var btn1 : Button;
    lateinit var btn2 : Button;
    lateinit var btn3 : Button;
    lateinit var btn4 : Button;
    lateinit var btn5 : Button;
    override fun onCreate(savedInstaceState:Bundle?){
        super.onCreate(savedInstaceState)
        setContentView(R.layout.activity_main)
        title = "직접해보기 6번 문제"
        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)
        btn3 = findViewById<Button>(R.id.btn3)
        btn4 = findViewById<Button>(R.id.btn4)
        btn5 = findViewById<Button>(R.id.btn5)

        btn1.setOnTouchListener{ view, motionEvent ->
            btn2.visibility = View.VISIBLE
            btn1.visibility = View.INVISIBLE
            false
        }
        btn2.setOnTouchListener{ view, motionEvent ->
            btn3.visibility = View.VISIBLE
            btn2.visibility = View.INVISIBLE
            false
        }
        btn3.setOnTouchListener{ view, motionEvent ->
            btn4.visibility = View.VISIBLE
            btn3.visibility = View.INVISIBLE
            false
        }
        btn4.setOnTouchListener{ view, motionEvent ->
            btn5.visibility = View.VISIBLE
            btn4.visibility = View.INVISIBLE
            false
        }
        btn5.setOnTouchListener{ view, motionEvent ->
            btn1.visibility = View.VISIBLE
            btn5.visibility = View.INVISIBLE
            false
        }
    }
}