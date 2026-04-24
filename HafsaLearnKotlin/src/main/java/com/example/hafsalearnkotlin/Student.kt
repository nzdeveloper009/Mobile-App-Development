package com.example.hafsalearnkotlin
// Abstract class: defines a contract for all humans
abstract class WorkableHuman {
    abstract fun work() // abstract method
}

// SchoolStudent class implements the abstract method
class SchoolStudent : WorkableHuman() {
    override fun work() {
        println("Student studies for exams.")
    }
}

// SchoolTeacher class implements the abstract method
class SchoolTeacher : WorkableHuman() {
    override fun work() {
        println("Teacher teaches students in class.")
    }
}

fun main() {
    val humans: List<WorkableHuman> = listOf(SchoolStudent(), SchoolTeacher())

    for (human in humans) {
        human.work()
    }
}
