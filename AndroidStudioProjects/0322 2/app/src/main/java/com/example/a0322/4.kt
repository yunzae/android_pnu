package com.example.a0322

fun change(str:String):String{
    var eror : Int = 0
    var yes = arrayListOf<Char>()
    var no = arrayListOf<Char>()
    for (s in str) {
        val num: Int = s.toInt()
        var new_num: Int = (num - 32)
        if (new_num > 64 && new_num < 91) {
            yes.add(s.toUpperCase())

        } else {
            no.add(s)
            eror = 1
        }
    }
    if (eror>0){
        return "error with : ${no.joinToString("")}"
    }
    else{

        return yes.joinToString("")
    }




}


fun main(){
    var a = "abcd"
    println(change(a))

    var b = "EfgH"
    println(change(b))

    var c = "!@%$"
    println(change(c))
}