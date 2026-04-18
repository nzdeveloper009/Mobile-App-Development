package com.example.gullfatimalearnkotlin

class Student(val name: String, val id: Int)
{
}

//Each class has single responsibility
class StudentRepository{

    fun save(student: Student){
        println("Saving ${student.name} to DB")
    }
}
class ReportGenerator{

    fun generate(student: Student){
        println("Report for ${student.name}")
    }
}

fun main(){
    val student = Student("Ali", 101)

    val repo = StudentRepository()
    repo.save(student)

    val report = ReportGenerator()
    report.generate(student)
}