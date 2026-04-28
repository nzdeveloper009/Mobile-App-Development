package com.example.gullfatimalearnkotlin



//By-default invariance is enabled. means even though Shark is fish but fishCollection<shark> is !=
//fishCollection<fish>

open class Fish
class Shark : Fish()
class Tuna : Fish()

class FishCollection< T>(val b: T)

fun showFish(b: FishCollection<Fish>) {
    println(b.b)
}

fun main() {
    val sharkCollection: FishCollection<Shark> =
        FishCollection(Shark())
     val fishCollection: FishCollection<Fish> =
        FishCollection(Fish())
    showFish(fishCollection)
   // showFish(sharkCollection)
    //error because fishCollection<fish> is not equal to fishCollection<shark>
   //function is expecting fishCollection<fish> but got fishCollection<shark>

}


open class Fruits{
}

class Apple(val name:String):Fruits()
{
}


//covariance: out-means it is producer class it can be read but not written
//compiler allow us box<apple> to be assigned to box<fruits>
class Box<out T>(val a : T)

fun show(b: Box <Fruits>){
    println(b)

}

