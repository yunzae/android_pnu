package com.example.a002_4_201824446_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText;
    lateinit var edit2 : EditText;

    lateinit var btnAdd : Button;
    lateinit var btnSub : Button;
    lateinit var btnMul : Button;
    lateinit var btnDiv : Button;
    lateinit var btnleft :Button
    lateinit var btnchange:Button
    lateinit var textResult : TextView;
    lateinit var num1 : String;
    lateinit var num2 : String;
    var result : Int? =null
    var count : Int = 0
    var temp :String =""
    override fun onCreate(savedInstaceState:Bundle?){
        super.onCreate(savedInstaceState)
        setContentView(R.layout.activity_main)
        title = "${count}회 계산기"

        edit1 = findViewById<EditText>(R.id.Edit1)
        edit2 = findViewById<EditText>(R.id.Edit2)

        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnSub = findViewById<Button>(R.id.BtnSub)
        btnMul = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.Btndiv)
        btnleft = findViewById<Button>(R.id.Btnleft)
        btnchange = findViewById<Button>(R.id.Btnchange)
        textResult = findViewById<TextView>(R.id.TextResult)


        btnDiv.setOnTouchListener{ view, motionEvent ->
            count+=1
            title = "${count}회 계산기"
            try {
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = Integer.parseInt(num1) / Integer.parseInt(num2)
            } catch (e: Exception) {

            }
            edit1.setText(result.toString())
            edit2.setText("")
            textResult.text = "계산 결과 : "+result.toString()
            false
        }
        btnMul.setOnTouchListener{ view, motionEvent ->
            count+=1
            title = "${count}회 계산기"
            try {
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = Integer.parseInt(num1) * Integer.parseInt(num2)
            } catch (e: Exception) {

            }
            edit1.setText(result.toString())
            edit2.setText("")
            textResult.text = "계산 결과 : "+result.toString()
            false
        }
        btnSub.setOnTouchListener{ view, motionEvent ->
            count+=1
            title = "${count}회 계산기"
            try {
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = Integer.parseInt(num1) - Integer.parseInt(num2)
            } catch (e: Exception) {

            }
            edit1.setText(result.toString())
            edit2.setText("")
            textResult.text = "계산 결과 : "+result.toString()
            false
        }
        btnAdd.setOnTouchListener{ view, motionEvent ->
            count+=1
            title = "${count}회 계산기"
            try {
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = Integer.parseInt(num1) + Integer.parseInt(num2)
            } catch (e: Exception) {

            }
            edit1.setText(result.toString())
            edit2.setText("")
            textResult.text = "계산 결과 : "+result.toString()
            false
        }
        btnleft.setOnTouchListener{ view, motionEvent ->
            count+=1
            title = "${count}회 계산기"
            try {
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = Integer.parseInt(num1) % Integer.parseInt(num2)
                edit1.text
            } catch (e: Exception) {

            }

            textResult.text = "계산 결과 : "+result.toString()

            edit1.setText(result.toString())
            edit2.setText("")
            false
        }

        btnchange.setOnTouchListener{ view, motionEvent ->
            count+=1
            title = "${count}회 계산기"
            try {
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
            } catch (e: Exception) {

            }


            temp = edit1.text.toString()
            edit1.text=edit2.text
            edit2.setText(temp)

            false
        }



    }
}
