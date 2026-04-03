package com.example.gullfatimalearnkotlin

fun main() {
    println("Hello Gull".formatting())
    calculateTime { loop(1000000) }

}
//extension function
//can't access private variables of class in Extension function
    fun String.formatting(): String{
        return ".....................\n$this\n.............."
    }



inline fun calculateTime(fn:()->Unit)
{
    val start=System.currentTimeMillis()
    fn()
    val end=System.currentTimeMillis()
    println("Time Taken  ${end- start} ms")
}

fun loop(n: Long)
{
    for(i in 1..n)
    {

    }
}
