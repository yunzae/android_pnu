package com.example.a0322
import java.lang.Exception
import java.util.*


fun main(){
    var VM :MyVM = MyVM()


    Interface_Home()
    VM.getMenu()

}

fun Interface_Home(){
    println("===========MENU===========")
    println("|(1) 참깨라면  - 1,000원  |")
    println("|(2) 햄버거    - 1,500원  |")
    println("|(3) 콜라     -   800원  |")
    println("|(4) 핫바     - 1,200원  |")
    println("|(5) 초코우유  - 1,500원  |")
    println("Choose menu: ")
}

class MyVM{
    var menu :String? = ""
    var money :Int = 0
    var price :Int = 0
    val sc :Scanner = Scanner(System.`in`)



    fun getChange() :String? {

        if (this.money >= this.price) {
            this.money -= this.price
            println("감사합니다. 잔돈반환: ${this.money}")
            return "pass"
        }
        else {
            return null

        }
    }


    fun getCoin() :String? {
        println("Insert coin")
        var str: String = sc.nextLine().toString()
        try {
            this.money = str.toInt()
        } catch (e: Exception) {
            println("돈을 넣지 않았습니다.")
            return null
        }
        println("${money}를 넣었습니다.")
        if (getChange() == null){
            println("현금이 부족합니다.")
        }
        return "pass"
    }

    fun getMenu(){
        var str :String = sc.nextLine().toString()

        when(str){
            "1" -> {
                this.menu = "참깨라면"
                this.price = 1000
            }
            "2" -> {
                this.menu = "햄버거"
                this.price = 1500
            }
            "3" -> {
                this.menu = "콜라"
                this.price = 800
            }
            "4" -> {
                this.menu = "핫바"
                this.price = 1200
            }
            "5" -> {
                this.menu = "초코우유"
                this.price = 1500
            }
            else -> {
                this.menu = null
            }
        }
        if (this.menu ==null){
            println("아무것도 선택하지 않았습니다.")
            println("다시 선택해주세요.")
            Interface_Home()
            getMenu()
        }
        else {
            println(this.menu + "가 선택되었습니다.")
            while(getCoin()== null){
                println("다시 돈을 넣어주세요")
            }
        }
    }



}