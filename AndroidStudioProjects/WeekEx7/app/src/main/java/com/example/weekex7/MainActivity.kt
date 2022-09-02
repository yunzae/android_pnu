package com.example.weekex7

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var btnR : Button
    lateinit var btnL : Button
    lateinit var img :ImageView
    var num = 0
    var arr = arrayListOf(R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m)
    override fun onCreate(savedInstaceState: Bundle?){
        super.onCreate(savedInstaceState)
        setContentView(R.layout.activity_main)
        title = "동물 갤러리"
        btnR = findViewById<Button>(R.id.btnR)
        btnL = findViewById<Button>(R.id.btnL)
        img = findViewById<ImageView>(R.id.imgView)


        btnR.setOnTouchListener{ view, motionEvent ->
            if (num<10) {
                num += 1
                img.setImageResource(arr[num])
            }
            false
        }
        btnL.setOnTouchListener{ view, motionEvent ->
            if (num>0) {
                num -= 1
                img.setImageResource(arr[num])
            }
            false
        }

    }
}