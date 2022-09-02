package com.example.week11ex1_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val db: FirebaseFirestore = FirebaseFirestore.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        readBtn.setOnClickListener{
            readFirebase()
        }

        writeBtn.setOnClickListener{
            var Name : String
            var Email: String
            var Age : Int

            if(name.length()==0) Name = "null" else Name = name.text.toString()
            if(email.length()==0) Email = "null" else Email = email.text.toString()
            if(age.length()==0) Age = 0 else Age = age.text.toString().toInt()

            writeFirebase(Name, Email, Age)

        }

    }
    fun readFirebase()
    {
        db.collection("user")
            .get()
            .addOnSuccessListener {
                    result ->

                for (document in result)
                output1.append("${document.data}\n")
            }
    }
    fun writeFirebase(Name: String, Email:String,Age:Int)
    {
        val user = mapOf(
            "name" to Name,
            "email" to Email,
            "age" to Age
        )
        val colRef: CollectionReference = db.collection("users")
        val docRef: Task<DocumentReference> = colRef.add(user)
        docRef.addOnSuccessListener{
                documentReference -> output1.append("Success : " + "${documentReference.id}\n")
        }
        docRef.addOnFailureListener{
            output1.append("Failure \n")
        }

    }
}