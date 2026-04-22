package com.example.gullfatimalearnkotlin

fun main()
{
//    var students=listOf<String>("Zainab","Rida","Hajra")
//          println(students.size)
//          println(students.contains("Fatima"))
//        println(students.first())
//           println(students.last())
//            println(students.get(1))
//
//    var nums=mutableListOf<Int>(2,4,6,8,10)
//    var list2=listOf<Int>(1,3,5,7,9)       //immutable
//    nums.add(11)
//
//    nums.addAll(list2)
//   // println(nums)
//
//
    //Maps
    var  num1=mutableMapOf<Int,String>()
    num1.put(1,"Zainab")
    num1.put(2,"Rida")
    num1.put(3,"Hajra")
    num1.put(4,"Fatima")
    for ((k,v) in num1)
    {
        println("$k - $v")
    }

    val temp=mapOf<Int, String>(1 to "Asad", 2 to "Ali", 3 to "Ahmed")
    println(temp.size)
    //temp.put
    println(temp)

}