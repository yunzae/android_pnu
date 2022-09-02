package com.example.ex7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {

    lateinit var edittext: EditText;
    lateinit var button_0: Button; lateinit var button_1: Button; lateinit var button_2: Button;
    lateinit var button_3: Button; lateinit var button_4: Button; lateinit var button_5: Button;
    lateinit var button_6: Button; lateinit var button_7: Button; lateinit var button_8: Button;
    lateinit var button_9: Button; lateinit var button_asterisk: Button; lateinit var button_hash: Button;
    lateinit var button_s1: Button; lateinit var button_s2: Button; lateinit var button_s3: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edittext = findViewById(R.id.edittext)
        button_0 = findViewById(R.id.button_0)
        button_1 = findViewById(R.id.button_1)
        button_2 = findViewById(R.id.button_2)
        button_3 = findViewById(R.id.button_3)
        button_4 = findViewById(R.id.button_4)
        button_5 = findViewById(R.id.button_5)
        button_6 = findViewById(R.id.button_6)
        button_7 = findViewById(R.id.button_7)
        button_8 = findViewById(R.id.button_8)
        button_9 = findViewById(R.id.button_9)
        button_asterisk = findViewById(R.id.button_asterisk)
        button_hash = findViewById(R.id.button_hash)
        button_s1 = findViewById(R.id.button_s1)
        button_s2 = findViewById(R.id.button_s2)
        button_s3 = findViewById(R.id.button_s3)
        var count :Int = 0

        button_0.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "0"
            edittext.setText(tempString)
            count++
        }
        button_1.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "1"
            edittext.setText(tempString)
            count++
        }
        button_2.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "2"
            edittext.setText(tempString)
            count++
        }
        button_3.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "3"
            edittext.setText(tempString)
            count++
        }
        button_4.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "4"
            edittext.setText(tempString)
            count++
        }
        button_5.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "5"
            edittext.setText(tempString)
            count++
        }
        button_6.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "6"
            edittext.setText(tempString)
            count++
        }
        button_7.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "7"
            edittext.setText(tempString)
            count++
        }
        button_8.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "8"
            edittext.setText(tempString)
            count++
        }
        button_9.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "9"
            edittext.setText(tempString)
            count++
        }
        button_asterisk.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "*"
            edittext.setText(tempString)
            count++
        }
        button_hash.setOnClickListener{
            var tempString :String = edittext.text.toString()
            if(count==3 || (count!=0 && count!=4 && count%4==3)){
                tempString += "-"
            }
            tempString += "#"
            edittext.setText(tempString)
            count++
        }

        button_s3.setOnClickListener{
            try{
                var tempString :String = edittext.text.toString()
                var len = tempString.length
                if(len > 1 && tempString[len-2].equals('-')){
                    edittext.setText(tempString.substring(0,len-2))
                }else{
                    edittext.setText(tempString.substring(0,len-1))
                }
                count--
            }catch(e: Exception){ }
        }

    }

}
