package com.android.imanlearnkotlin

fun main() {
    val direction = Direction.EAST
    when (direction) {
        Direction.NORTH -> println("Going North")
        Direction.SOUTH -> println("Going South")
        Direction.EAST -> println("Going East")
        Direction.WEST -> println("Going West")
    }
    val result: Result = Success("Data Loaded Successfully")

    when (result) {
        is Success -> println("Success: ${result.message}")
        is Error -> println("Error: ${result.error}")
        Loading -> println("Loading...")
    }
}
enum class Direction {
    NORTH, SOUTH, EAST, WEST
}
sealed class Result

class Success(val message: String) : Result()
class Error(val error: String) : Result()
object Loading : Result()


