package com.android.imanlearnkotlin
fun main(){
    val iphone=iphone()
    iphone.display()
    val generalmobile=Mobile("general")
    generalmobile.display()
}
open class Mobile(val type:String) {
   open  val name: String = ""
   open val size: Int = 5
    fun makecall() = println("calling from mobile")
    fun poweoff() = println("shutting down")
  open  fun display() = println("simple mobile display")
}
class iphone: Mobile("smartphone"){
    override val name: String="iphone"
    override fun display()=println("iphone display")
}