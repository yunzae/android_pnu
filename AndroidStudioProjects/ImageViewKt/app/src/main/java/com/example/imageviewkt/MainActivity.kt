package com.example.imageviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_toast.setOnClickListener{

            iv_profile.setImageResource(R.drawable.android1) //이미지뷰에 새로운 이미지등록 , 경로설정에서 R은 res
            Toast.makeText(this@MainActivity,"버튼이 클릭 되었습니다.",Toast.LENGTH_SHORT).show()



            }


        }
}