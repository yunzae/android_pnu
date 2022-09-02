package com.example.week7ex3

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
        val t1: TextView = findViewById(R.id.t1)
        val t2: TextView = findViewById(R.id.t2)
        val t3: TextView = findViewById(R.id.t3)
        val t4: TextView = findViewById(R.id.t4)
        var  i:Intent = getIntent()

        t1.setText(i.getStringExtra("name")+"  "+i.getStringExtra("age"))
        t2.setText(i.getStringExtra("num") )
        t3.setText(i.getStringExtra("address") )
        t4.setText(i.getStringExtra("etc") )




        btn.setOnClickListener{
            finish()
        }
    }


}