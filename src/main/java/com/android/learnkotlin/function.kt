package com.android.learnkotlin

fun main(){
    val result=sub(10,5)
    println(result)
    checkno(17)

}
fun sub(no1: Int, no2:Int): Int
{
    val sub=no1-no2
    return sub
}
fun checkno(no1:Int){
    val result= if (no1%2 == 0) "even" else "odd"
    println(result)

}