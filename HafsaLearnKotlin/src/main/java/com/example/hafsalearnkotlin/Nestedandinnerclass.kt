package com.example.hafsalearnkotlin
class University(val name: String) {

    // Nested class: independent, no reference to University
    class Department(val deptName: String) {
        fun info() {
            println("Department: $deptName")
        }
    }

    // Inner class: has reference to University
    inner class Student(val studentName: String) {
        fun introduce() {
            println("Hi, I am $studentName from $name")
        }
    }
}

fun main() {
    // Using Nested class
    val dept = University.Department("Computer Science")
    dept.info()

    // Using Inner class
    val university = University("University of Gujrat")
    val student = university.Student("Hafsa")
    student.introduce()
}
