package com.example.hafsalearnkotlin

// Base class
open class PersonBase(val name: String)

// Subclass SmartStudent
class SmartStudent(name: String, val grade: Int) : PersonBase(name)

// Subclass SmartTeacher
class SmartTeacher(name: String, val subject: String) : PersonBase(name)

fun describePerson(person: PersonBase) {
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
    val people: List<PersonBase> = listOf(
        SmartStudent("Ali", 10),
        SmartTeacher("Sara", "Math"),
        PersonBase("John")
    )

    for (p in people) {
        describePerson(p)
    }

    // Example of explicit type check
    val someone: PersonBase = SmartStudent("Mary", 12)
    if (someone is SmartStudent) {
        // Smart cast: no need to manually cast
        println("Smart cast works: ${someone.grade}")
    }
}
