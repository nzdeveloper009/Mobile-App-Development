package com.example.hafsalearnkotlin

// Base abstraction: Employee
open class Employee(val name: String) {
    open fun calculatePay(hoursWorked: Int): Double {
        // Default: hourly employee
        val hourlyRate = 20.0
        return hoursWorked * hourlyRate
    }
}

// Subclass 1: Full-time employee
class FullTimeEmployee(name: String) : Employee(name) {
    override fun calculatePay(hoursWorked: Int): Double {
        // Fixed monthly salary regardless of hours
        val monthlySalary = 3000.0
        return monthlySalary
    }
}

// Subclass 2: Contractor
class Contractor(name: String) : Employee(name) {
    override fun calculatePay(hoursWorked: Int): Double {
        val hourlyRate = 40.0
        return hoursWorked * hourlyRate
    }
}

// Subclass 3: Intern
class Intern(name: String) : Employee(name) {
    override fun calculatePay(hoursWorked: Int): Double {
        val stipend = 500.0
        return stipend
    }
}

// Context: Payroll system works with any Employee
fun processPayroll(employee: Employee, hoursWorked: Int) {
    val pay = employee.calculatePay(hoursWorked)
    println("${employee.name} earned $$pay")
}

// Main function
fun main() {
    val hafsa: Employee = FullTimeEmployee("Hafsa")
    val ayesha: Employee = Contractor("Ayesha")
    val maryam: Employee = Intern("Maryam")

    processPayroll(hafsa, 160)   // Hafsa earned $3000.0
    processPayroll(ayesha, 160)  // Ayesha earned $6400.0
    processPayroll(maryam, 160)  // Maryam earned $500.0
}
