package com.example.a03151
import java.util.*

fun main(){
    var account :MyAccount = MyAccount()
    val sc :Scanner = Scanner(System.`in`)

    while(true){
        Interface_Home()
        var str :String = sc.nextLine().toString()
        when(str){
            "I" -> account.Interface_Info()
            "D" -> account.Deposite()
            "W" -> account.Withdraw()
            "E" -> break
        }
    }
}

fun Interface_Home(){
    println("----선택하세요----")
    println("|(I) 계좌정보    |")
    println("|(D) 입금       |")
    println("|(W) 출금       |")
    println("|(E) 종료       |")
    println("---------------")
}

class MyAccount{
    var name :String = "Kim"
    var balance :Int = 0
    var cLevel :CreditLevel = CreditLevel.C
    val sc :Scanner = Scanner(System.`in`)
    var state :Boolean = false

    fun Deposite(){
        println("입금하실 금액을 말하세요.")
        var money :Int = sc.nextLine().toInt()
        this.balance += money
        if(balance >= 0){
            if(this.state == true){
                this.state = false
                println("동결계좌가 열렸습니다.")
            }
            upGrade()
        }
        println("${money} 원을 입금하였습니다. 잔액 : ${this.balance}")
    }

    fun Withdraw(){
        println("출금하실 금액을 말하세요.")
        var money :Int = sc.nextLine().toInt()
        if(this.state == false){
            println("계좌가 마이너스 되었습니다.")
            this.balance -= money
            if(balance < 0){
                downGrade()
            }
            println("${money} 원을 출금하였습니다. 잔액 : ${this.balance}")
        }else{
            println("동결된 계좌에서 출금하실 수 없습니다.")
        }
    }

    fun downGrade(){
        if(this.cLevel != CreditLevel.F){
            when(this.cLevel){
                CreditLevel.A -> {
                    this.cLevel = CreditLevel.B
                    println("신용등급이 'A->B'로 한단계 하락합니다.")
                }
                CreditLevel.B -> {
                    this.cLevel = CreditLevel.C
                    println("신용등급이 'B->C'로 한단계 하락합니다.")
                }
                CreditLevel.C -> {
                    this.cLevel = CreditLevel.D
                    println("신용등급이 'C->D'로 한단계 하락합니다.")
                }
                CreditLevel.D -> {
                    this.cLevel = CreditLevel.E
                    println("신용등급이 'D->E'로 한단계 하락합니다.")
                }
                CreditLevel.E -> {
                    this.cLevel = CreditLevel.F
                    println("신용등급이 'E->F'로 한단계 하락합니다.")
                }
            }
        }else{
            println("최저 등급의 신용을 가지고 있습니다.")
            println("계좌가 동결됩니다.")
            this.state = true
        }
    }

    fun upGrade(){
        if(this.cLevel != CreditLevel.A){
            when(this.cLevel){
                CreditLevel.B -> {
                    this.cLevel = CreditLevel.A
                    println("신용등급이 'B->A'로 한단계 상승합니다.")
                }
                CreditLevel.C -> {
                    this.cLevel = CreditLevel.B
                    println("신용등급이 'C->B'로 한단계 상승합니다.")
                }
                CreditLevel.D -> {
                    this.cLevel = CreditLevel.C
                    println("신용등급이 'D->C'로 한단계 상승합니다.")
                }
                CreditLevel.E -> {
                    this.cLevel = CreditLevel.D
                    println("신용등급이 'E->D'로 한단계 상승합니다.")
                }
                CreditLevel.F -> {
                    this.cLevel = CreditLevel.E
                    println("신용등급이 'F->E'로 한단계 상승합니다.")
                }
            }
        }
    }

    fun Interface_Info(){
        println("계좌정보는 다음과 같습니다")
        println("|이름:   ${this.name}    |")
        println("|계좌잔액    ${this.balance}   |")
        println("|신용등급:   ${this.cLevel}   |")
        println("---------------")
    }

}

enum class CreditLevel{A, B, C, D, E, F}