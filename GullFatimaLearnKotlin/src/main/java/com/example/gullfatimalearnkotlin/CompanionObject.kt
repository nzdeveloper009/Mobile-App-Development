package com.example.gullfatimalearnkotlin

class user{
    companion object
    {
        var totalUser=0
    }
    init{
        totalUser++
    }
}

class student
{
    var rollno=0
    companion object
    {
        var counter=0
    }
    init {
        counter++
        rollno=counter
    }

}

fun main()
{
    var u1=user()
    var u2=user()
    var u3=user()
    println(user.totalUser)

    var s1=student()
    var s2=student()
    var s3=student()
    println(student.counter)
    println(s1.rollno)
    println(s2.rollno)
    println(s3.rollno)

}