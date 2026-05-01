package com.example.hafsalearnkotlin

// ✅ Class 1: Handles user data
data class User(val id: Int, val name: String, val email: String)

// ✅ Class 2: Responsible ONLY for formatting reports
class ReportFormatter {
    fun format(user: User): String {
        return "User Report:\nName: ${user.name}\nEmail: ${user.email}"
    }
}

// ✅ Class 3: Responsible ONLY for saving reports
class ReportSaver {
    fun saveToFile(report: String, filename: String) {
        println("Saving report to $filename...")
        // Imagine writing to a file here
    }
}

// ✅ Class 4: Responsible ONLY for sending reports
class ReportSender {
    fun sendByEmail(report: String, email: String) {
        println("Sending report to $email...")
        // Imagine sending email here
    }
}

// ✅ Main function: Orchestrates the workflow
fun main() {
    val user = User(1, "Hafsa", "Hafsaj@gmail.com")

    val formatter = ReportFormatter()
    val saver = ReportSaver()
    val sender = ReportSender()

    val report = formatter.format(user)
    saver.saveToFile(report, "user_report.txt")
    sender.sendByEmail(report, user.email)
}
