package com.example.week7ex2

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
        val ev = findViewById<EditText>(R.id.ev_sub)
        val res: TextView = findViewById(R.id.res_sub)
        var  i:Intent = getIntent()
        res.setText(i.getStringExtra("data"))


        btn.setOnClickListener{
            if (ev.text.isEmpty()){
                Toast.makeText(this,"값을 입력해주세요",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val data:String = ev.text.toString()
            var  i:Intent = getIntent()
            i.putExtra("data",data)
            setResult(Activity.RESULT_OK, i);



            finish()
        }
    }


}