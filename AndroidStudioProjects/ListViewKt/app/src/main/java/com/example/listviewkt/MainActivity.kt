package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.android, "윤드로이드","28","안녕하세요"),
        User(R.drawable.android, "자바","21","안녕굿요"),
        User(R.drawable.android, "자바스크립트","22","메렁"),
        User(R.drawable.android, "코틀린","18","어렵네"),
        User(R.drawable.android, "스위프트","43","에휴"),
        User(R.drawable.android, "안드로이드","43","안귀찬요"),
        User(R.drawable.android, "리액트네이티브","13","ㅠㅠ"),
        User(R.drawable.android, "윤드로이드","28","ㅎㅎ"),
        User(R.drawable.android, "윤드로이드","28","안녕하세요")
        )



    override fun onCreate(savedInstanceState: Bundle?) {// 액티비티의 실행 시작 시점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val item = arrayOf("사과","배","딸기","키위","윤드로이드" )
//        //context란 한 액티비티의 모든 정보를 담고있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)
        val Adapter = UserAdapter(this,UserList)
        listView.adapter = Adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this,selectItem.name, Toast.LENGTH_SHORT).show()


        }



    }
}