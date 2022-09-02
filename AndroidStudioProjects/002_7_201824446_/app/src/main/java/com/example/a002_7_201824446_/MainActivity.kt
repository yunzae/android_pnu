package com.example.a002_7_201824446_


import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button = findViewById(R.id.btn_main)
        val ev_kname:EditText = findViewById<EditText>(R.id.ev_kname)
        val ev_email:EditText = findViewById<EditText>(R.id.ev_email)
        val ev_num:EditText = findViewById<EditText>(R.id.ev_num)
        val ev_ename:EditText = findViewById<EditText>(R.id.ev_ename)
        val ev_addr:EditText = findViewById<EditText>(R.id.ev_addr)


        btn.setOnClickListener{

            val data_kname:String = ev_kname.text.toString()
            val data_ename:String = ev_ename.text.toString()
            val data_num:String = ev_num.text.toString()
            val data_email:String = ev_email.text.toString()
            val data_addr:String = ev_addr.text.toString()

            val intent = Intent(this,SubActivity::class.java)

            intent.putExtra("kname",data_kname)
            intent.putExtra("ename",data_ename)
            intent.putExtra("num",data_num)
            intent.putExtra("email",data_email)
            intent.putExtra("addr",data_addr)


            startActivity(intent)
        }
    }



}