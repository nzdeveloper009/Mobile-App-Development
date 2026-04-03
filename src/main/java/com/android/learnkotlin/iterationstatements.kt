package com.android.learnkotlin

fun main(){
    //***while loop***
    var count= 1
    while(count<=10){      //1
        println("ho")
        count++
    }              //preconditional
    var num=2
    var range=10
    while(range<=10){
        println(num*range)    //2
        range++
    }
//***do while loop***
    var index=1
    do{
        println("hoo")
        index++
    }while(index<=10) //postconditional
//***FOR LOOP****
    for(i in 1..5){
        println("hooo")
    }
    //**step**
    for(i in 1..5 step 2){
        println(i)
    }
    //**until**
    for(i in 1 until 5){
        println (i)
    }
    //**down to**
    for(i in 10 downTo 1){
        println(i)
    }
    val number=2
    for(i in 1..10){
        // println(number.toString()+"X"+i+"="+(number*i))
        println("$number x $i =${number*i}")
    }
}