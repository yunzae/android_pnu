package com.example.intentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        if (intent.hasExtra("msg"))
        {
            tv_getMsg.text = intent.getStringExtra("msg")//서브액티비티에 존재하는 텍스트뷰에다가 HelloWorld가 넘겨져 옴.

        }
    }
}