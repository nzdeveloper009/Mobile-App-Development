package com.example.gullfatimalearnkotlin

fun main() {

    val icontainer=conatiner("Gull")
    println(icontainer.getValue())
    icontainer.setValue("Amal")
    val num=conatiner(123)
    println(num.getValue())

    add(1,2,4,5,22,2,2,9)

}

class conatiner<T>(var data:T)
{
    fun setValue(value:T)
    {
       data=value
    }
    fun getValue():T
    {
        return data
    }

}
fun add(vararg values:Int )
{
    var sum:Int=0
    for(i in values){
        sum+=i
    }
    println(sum)

}