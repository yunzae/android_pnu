package com.example.a03151
import java.util.*

fun main(){
    var num = 0
    var pairList :MutableList<Int> = mutableListOf()

    val sc :Scanner = Scanner(System.`in`)
    num = sc.nextLine().toInt()

    for(i :Int in 0..num-1 step(1)){
        var temp = sc.nextLine().toInt()
        pairList.add(temp)
    }

    for(i :Int in 0..num-1 step(1)){
        var tempList = arrayListOf<Int>()
        var _num :Int = pairList.get(i)
        var j = 1

        while(j <= _num/2){
            if(j < (_num-j)){
                tempList.add(j)
                tempList.add(_num - j)
            }
            j++
        }

        print("Pairs for " + pairList.get(i) + " : ")
        if(tempList.size >= 1){
            for(k in 0..(tempList.size/2) step(2)){
                if(k != 0)
                    print(',')
                print("(" + tempList.get(k) + " " + tempList.get(k+1) + ")")
            }
        }
        println()
    }

}