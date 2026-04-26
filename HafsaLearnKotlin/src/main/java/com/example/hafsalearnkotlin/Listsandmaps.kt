package com.example.hafsalearnkotlin
fun main() {
    // A List of student names
    val students = listOf("Ali", "Sara", "Ahmed", "Fatima")

    // A Map of student names to their scores
    val scores = mapOf(
        "Ali" to 85,
        "Sara" to 92,
        "Ahmed" to 76,
        "Fatima" to 89
    )

    // Iterate through the list and print each student's score from the map
    for (student in students) {
        val score = scores[student] ?: "No score found"
        println("$student scored: $score")
    }

    // Example of updating a mutable map
    val mutableScores = scores.toMutableMap()
    mutableScores["Ahmed"] = 80  // Update Ahmed's score
    println("Updated scores: $mutableScores")
}
