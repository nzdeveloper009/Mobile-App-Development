package com.example.hafsalearnkotlin
// Abstract class: defines a contract for all humans
abstract class Human {
    abstract fun work() // abstract method
}

// SchoolStudent class implements the abstract method
class SchoolStudent : Human() {
    override fun work() {
        println("Student studies for exams.")
    }
}

// SchoolTeacher class implements the abstract method
class SchoolTeacher : Human() {
    override fun work() {
        println("Teacher teaches students in class.")
    }
}

fun main() {
    val humans: List<Human> = listOf(SchoolStudent(), SchoolTeacher())

    for (human in humans) {
        human.work()
    }
}
