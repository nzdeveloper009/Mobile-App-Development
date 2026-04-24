package com.example.hafsalearnkotlin

// Base class
open class Person(val name: String)

// Subclass Student
class Student(name: String, val grade: Int) : Person(name)

// Subclass Teacher
class Teacher(name: String, val subject: String) : Person(name)

fun describePerson(person: Person) {
    // Type checking with 'is' and smart casting
    when (person) {
        is Student -> {
            // Smart cast: person is automatically treated as Student
            println("${person.name} is a student in grade ${person.grade}.")
        }
        is Teacher -> {
            // Smart cast: person is automatically treated as Teacher
            println("${person.name} is a teacher of ${person.subject}.")
        }
        else -> {
            println("${person.name} is just a person.")
        }
    }
}

fun main() {
    val people: List<Person> = listOf(
        Student("Ali", 10),
        Teacher("Sara", "Math"),
        Person("John")
    )

    for (p in people) {
        describePerson(p)
    }

    // Example of explicit type check
    val someone: Person = Student("Mary", 12)
    if (someone is Student) {
        // Smart cast: no need to manually cast
        println("Smart cast works: ${someone.grade}")
    }
}
