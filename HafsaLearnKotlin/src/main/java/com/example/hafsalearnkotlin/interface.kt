package com.example.hafsalearnkotlin
// Define an interface
interface Worker {
    // Abstract method: must be implemented
    fun doWork()

    // Property in interface
    val role: String

    // Default method: optional to override
    fun info() {
        println("Role: $role")
    }
}

// InterfaceStudent class implements Worker
class InterfaceStudent : Worker {
    override val role: String = "Student"

    override fun doWork() {
        println("Student studies for exams.")
    }
}

// InterfaceTeacher class implements Worker
class InterfaceTeacher : Worker {
    override val role: String = "Teacher"

    override fun doWork() {
        println("Teacher teaches students.")
    }

    // Override default method
    override fun info() {
        println("Teacher has the role: $role")
    }
}

// Doctor class implements Worker
class Doctor : Worker {
    override val role: String = "Doctor"

    override fun doWork() {
        println("Doctor treats patients.")
    }
}

// Another interface to show multiple inheritance
interface Person {
    fun introduce()
}

// Engineer implements two interfaces
class Engineer : Worker, Person {
    override val role: String = "Engineer"

    override fun doWork() {
        println("Engineer designs and builds systems.")
    }

    override fun introduce() {
        println("Hello, I am an Engineer.")
    }
}

fun main() {
    // Polymorphism: Worker reference can point to different classes
    val workers: List<Worker> = listOf(InterfaceStudent(), InterfaceTeacher(), Doctor(), Engineer())

    println("=== Demonstrating interface polymorphism ===")
    for (worker in workers) {
        worker.info()   // Calls default or overridden version
        worker.doWork() // Calls the correct implementation
        println("-----------")
    }

    // Demonstrating multiple interfaces
    val engineer = Engineer()
    engineer.introduce()
    engineer.doWork()
}
