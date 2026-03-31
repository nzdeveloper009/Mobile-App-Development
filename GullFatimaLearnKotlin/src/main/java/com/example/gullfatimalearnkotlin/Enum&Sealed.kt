package com.example.gullfatimalearnkotlin

fun main()
{
    var today=day.SUNDAY
    println(today)
    println(today.name)
    println(today.ordinal)
    println(today.number)
    println(today.number)
    for(i in day.values())
    {
        println(i)
    }

    val t:tile=Red("Mushroom",22)

    val code:Int=when(t)
    {
        is Red-> t.code* 2
        is Blue -> t.code * 3
        is Green -> t.code* 4


    }
    println(code)

}

enum class day(val number:Int){
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7)
}


sealed class tile
class Red(val Type:String, val code:Int):tile()
class Blue(val Type:String,val code:Int):tile()
class Green(val Type:String,val code:Int):tile()