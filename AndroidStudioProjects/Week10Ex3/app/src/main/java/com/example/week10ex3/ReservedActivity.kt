package com.example.week10ex3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.posterImageView
import kotlinx.android.synthetic.main.activity_reserved.*
import java.io.Serializable


data class ReservedMovie(
    val _id:Int?,
    val name:String?,
    val poster_image:String?,
    val director: String?,
    val synopsis: String?,
    val reserved_time: String?
): Serializable

class ReservedActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserved)

        processIntent(intent)
        btnclose.setOnClickListener{
            finish()
        }
    }
    fun processIntent(intent: Intent?){
        val movies = intent?.getSerializableExtra("movies") as ArrayList<ReservedMovie>?
        val movie = movies?.get(0)
        if (movie!=null){
            posterImageView.setImageURI(Uri.parse(movie.poster_image))
            inpu1.setText(movie.name)
            inpu2.setText(movie.director)
            inpu3.setText(movie.synopsis)
            inpu4.setText(movie.reserved_time)
        }
    }

}