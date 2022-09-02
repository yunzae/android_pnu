package com.example.a002_7_201824446_

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        val btn:Button = findViewById(R.id.btn_sub)
        val t1: EditText = findViewById(R.id.kname)
        val t2: EditText = findViewById(R.id.ename)
        val t3: EditText = findViewById(R.id.num)
        val t4: EditText = findViewById(R.id.email)
        val t5: EditText = findViewById(R.id.addr)

        var  i:Intent = getIntent()

        t1.setText(i.getStringExtra("kname"))
        t2.setText(i.getStringExtra("ename") )
        t3.setText(i.getStringExtra("num") )
        t4.setText(i.getStringExtra("email") )
        t5.setText(i.getStringExtra("addr") )




        btn.setOnClickListener{
            finish()
        }
    }


}