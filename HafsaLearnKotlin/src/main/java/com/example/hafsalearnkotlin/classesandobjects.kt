package com.example.hafsalearnkotlin
class Student(private var name: String, private var age: Int) {
    // Getter for name
    fun getName(): String {
        return name
    }
    // Setter for name
    fun setName(newName: String) {
        name = newName
    }
    // Getter for age
    fun getAge(): Int {
        return age
    }
    // Setter for age
    fun setAge(newAge: Int) {
        if (newAge > 0) {
            age = newAge
        } else {
            println("Age must be positive!")
        }
    }
    // Method to display info
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

//Class with constructor and methods
class Course(private var title: String, private var duration: Int) {

    fun getTitle(): String {
        return title
    }

    fun setTitle(newTitle: String) {
        title = newTitle
    }

    fun getDuration(): Int {
        return duration
    }

    fun setDuration(newDuration: Int) {
        duration = newDuration
    }

    fun showCourse() {
        println("Course: $title, Duration: $duration weeks")
    }
}

fun main() {
    // Create Student object using constructor
    val student1 = Student("Ali", 20)

    // Use getters and setters
    println("Student name: ${student1.getName()}")
    student1.setName("Ahmed")
    student1.setAge(21)
    student1.displayInfo()

    // Create Course object
    val course1 = Course("Kotlin Basics", 1)
    println("Course title: ${course1.getTitle()}")
    course1.setDuration(2)
    course1.showCourse()
}
