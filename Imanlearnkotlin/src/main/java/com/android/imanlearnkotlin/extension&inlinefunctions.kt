package com.android.imanlearnkotlin

fun main(){
println("hell".formatedstring())
    calculatetimeandrun {
        loop(1000)
    }
}
fun String.formatedstring():String{
    return "---------\n$this\n-------"
}
inline fun calculatetimeandrun(fn: ()-> Unit){
    val start:Long= System.currentTimeMillis()
    val end:Long=System.currentTimeMillis()
    println("timetaken ${end-start}")

}
fun loop(n : Long){
    for( i in 1..n){
        //
    }
}
