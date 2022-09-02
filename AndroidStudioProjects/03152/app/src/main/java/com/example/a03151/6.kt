package com.example.a03151

fun main(){
    var calculator = Calculator()
    calculator.cal(1.0, 2.0, "add")
    calculator.print_calculated_number()
    calculator.cal(1.0, 10.0, "subtract")
    calculator.print_calculated_number()
    calculator.cal(1.0, 0.0, "division")
    calculator.print_calculated_number()
    calculator.cal(1.0, 10.0, "division")
    calculator.print_calculated_number()
    calculator.cal(1.0, 10.0, "multiple")
    calculator.print_calculated_number()
    println("--------------------")
    calculator.load()
}

class Calculator {
    var resultLast :Double = 0.0
    var resultList = arrayListOf<Double>()

    fun add(a: Double, b: Double) {
        this.resultLast = a + b
        this.resultList.add(this.resultLast)
    }

    fun subtract(a: Double, b: Double) {
        this.resultLast = a - b
        this.resultList.add(this.resultLast)
    }

    fun division(a: Double, b: Double) {
        if(b != 0.0){
            this.resultLast = a / b
            this.resultList.add(this.resultLast)
        }
        else
            println("ERROR : number can not be divided with zero.")
    }

    fun multiple(a: Double, b: Double) {
        this.resultLast = a * b
        this.resultList.add(this.resultLast)
    }


    fun load() {
        for(i in 0..resultList.size-1 step(1)){
            println(resultList.get(i))
        }
    }

    fun cal(num1: Double, num2: Double, command: String) {
        when(command){
            "add" -> add(num1, num2)
            "subtract" -> subtract(num1, num2)
            "division" -> division(num1, num2)
            "multiple" -> multiple(num1, num2)
        }
    }

    fun print_calculated_number() {
        println(this.resultLast)
    }
}
