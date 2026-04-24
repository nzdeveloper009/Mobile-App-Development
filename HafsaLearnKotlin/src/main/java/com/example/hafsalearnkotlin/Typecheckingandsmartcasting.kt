package com.example.hafsalearnkotlin

// Base class
open class Person(val name: String)

// Subclass SmartStudent
class SmartStudent(name: String, val grade: Int) : Person(name)

// Subclass SmartTeacher
class SmartTeacher(name: String, val subject: String) : Person(name)

fun describePerson(person: Person) {
    // Type checking with 'is' and smart casting
    when (person) {
        is SmartStudent -> {
            // Smart cast: person is automatically treated as SmartStudent
            println("${person.name} is a student in grade ${person.grade}.")
        }
        is SmartTeacher -> {
            // Smart cast: person is automatically treated as SmartTeacher
            println("${person.name} is a teacher of ${person.subject}.")
        }
        else -> {
            println("${person.name} is just a person.")
        }
    }
}

fun main() {
    val people: List<Person> = listOf(
        SmartStudent("Ali", 10),
        SmartTeacher("Sara", "Math"),
        Person("John")
    )

    for (p in people) {
        describePerson(p)
    }

    // Example of explicit type check
    val someone: Person = SmartStudent("Mary", 12)
    if (someone is SmartStudent) {
        // Smart cast: no need to manually cast
        println("Smart cast works: ${someone.grade}")
    }
}
