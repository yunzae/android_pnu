package com.example.week7ex4

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val photo: ImageView = findViewById(R.id.iv_photo)
        val btn:Button = findViewById(R.id.btn_main)
        val ev_name:EditText = findViewById<EditText>(R.id.ev_name)
        val ev_age:EditText = findViewById<EditText>(R.id.ev_age)
        val ev_num:EditText = findViewById<EditText>(R.id.ev_num)
        val ev_address:EditText = findViewById<EditText>(R.id.ev_address)
        val ev_etc:EditText = findViewById<EditText>(R.id.ev_etc)
        photo.isClickable = true
        photo.setOnClickListener{
            openGallery()
        }


        btn.setOnClickListener{
            if ( ev_name.text.isEmpty() || ev_age.text.isEmpty() || ev_num.text.isEmpty() ||ev_address.text.isEmpty() ||ev_etc.text.isEmpty()){
                Toast.makeText(this,"모든 칸을 입력해주세요",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val data_name:String = ev_name.text.toString()
            val data_age:String = ev_age.text.toString()
            val data_num:String = ev_num.text.toString()
            val data_address:String = ev_address.text.toString()
            val data_etc:String = ev_etc.text.toString()
            val bitmap = data!!.getParcelableExtra<Bitmap>("name")
            val intent = Intent(this,SubActivity::class.java)
            val resize = resizeBitmap(bitmap,300,300 )
            intent.putExtra("image",resize)
            intent.putExtra("name",data_name)
            intent.putExtra("age",data_age)
            intent.putExtra("num",data_num)
            intent.putExtra("address",data_address)
            intent.putExtra("etc",data_etc)

            ev_name.text = null
            ev_age.text = null
            ev_num.text = null
            ev_address.text = null
            ev_etc.text = null
            startActivity(intent)
        }

    }
    private fun openGallery(){
        val intent: Intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.setType("image/*")
        startActivityForResult(intent,GALLERY)
    }

    private fun resizeBitmap(bitmap:Bitmap,width:Int,height:Int):Bitmap{
        return Bitmap.createScaledBitmap(
            bitmap, height,width, false
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            when(requestCode){
                GALLERY->{
                    var ImageData: Uri? = data?.data
                    try{
                        val bitamp = MediaStore.Images.Media.getBitmap(contentResolver,ImageData)
                        val pt:ImageView = findViewById(R.id.iv_photo)
                        pt.setImageBitmap(bitmap)
                    }catch (e: Exception){
                        e.printStackTrace()
                    }
                }
            }
        }
    }

}