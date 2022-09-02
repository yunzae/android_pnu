package com.example.a0315
import java.util.*

enum class Year{ Freshman, Sophomore, Junior, Senior }
class Student(var year:Year, var name: String , var id: Int){
    fun print_information(){
        println("YEAR : ${year}, NAME : $name, ID : $id")
    }
}
fun main(){

    var student: MutableList<Student> = mutableListOf()

    student.add(Student(Year.Freshman,"KIM",202011679))
    student.add(Student(Year.Freshman,"WANG",202055028))
    student.add(Student(Year.Sophomore,"KIM",201803049))
    student.add(Student(Year.Junior,"Lee",201646290))
    student.add(Student(Year.Senior,"Hwangbo",201412654))
    var freshman_students = student.filter { it.year==Year.Freshman }

    for(student in freshman_students){
        student.print_information()
    }

}
