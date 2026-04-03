package com.android.learnkotlin


fun main(){
    var arr0= arrayOf("one","two","three")
    var arr1= arrayOf(1,2,3)
    for( (i ,e )in arr0.withIndex()){
        println("$i - $e")
    }
    println(arr1[0])
    println(arr1.get(2))
}