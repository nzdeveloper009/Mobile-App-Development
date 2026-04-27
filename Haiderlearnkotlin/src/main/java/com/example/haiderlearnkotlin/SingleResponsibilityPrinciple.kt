package com.example.haiderlearnkotlin

// ❌ WRONG

class Student_Wrong {
    var name: String = "Ali"

    fun getStudentInfo(): String {
        return "Student: $name"
    }

    fun saveToDatabase() {
        // saving to DB — not Student's job!
        println("Saving $name to database...")
    }

    fun printReport() {
        //  printing — not Student's job!
        println("Printing report for $name...")
    }
}


// Correct

// Hold student data
class Student(val name: String, val grade: Int)

//  Save student to database
class StudentRepository {
    fun save(student: Student) {
        println("💾 Saving ${student.name} to database...")
    }
}

//  Print student report
class StudentPrinter {
    fun print(student: Student) {
        println("🖨️ Printing report for ${student.name}, Grade: ${student.grade}")
    }
}


fun main() {
    println("Single Responsibility Principle \n")

    val student = Student(name = "Ali", grade = 90)
    val repository = StudentRepository()
    val printer = StudentPrinter()

    repository.save(student)
    printer.print(student)


}


