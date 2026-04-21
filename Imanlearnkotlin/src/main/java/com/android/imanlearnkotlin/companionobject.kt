package com.android.imanlearnkotlin
fun main(){
    myclass.myobject.f()
    myclass.f()

}
class myclass{
   companion object myobject{
        fun f(){
            println("f from myobject")
        }
    }

}
