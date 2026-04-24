package com.example.hafsalearnkotlin

// Base class
open class Animal {
    open fun speak() {
        println("The animal makes a sound.")
    }
}

// Derived class Dog overriding speak()
class Dog : Animal(), Pet {
    override fun speak() {
        println("Dog says: Woof Woof!")
    }

    override fun play() {
        println("Dog loves to play fetch.")
    }
}

// Derived class Cat overriding speak()
class Cat : Animal(), Pet {
    override fun speak() {
        println("Cat says: Meow Meow!")
    }

    override fun play() {
        println("Cat enjoys chasing laser pointers.")
    }
}

// Interface to demonstrate polymorphism with multiple types
interface Pet {
    fun play()
}

// Function to show polymorphism in action
fun showPolymorphism(animals: List<Animal>) {
    for (animal in animals) {
        // Dynamic dispatch: correct method is called based on object type
        animal.speak()
    }
}

// Main function to run the demo
fun main() {
    // Create objects of Dog and Cat
    val dog: Animal = Dog()
    val cat: Animal = Cat()

    // Store them in a list of Animal
    val animals: List<Animal> = listOf(dog, cat)

    println("=== Demonstrating Polymorphism with speak() ===")
    showPolymorphism(animals)

    println("\n=== Demonstrating Polymorphism with interface Pet ===")
    val pets: List<Pet> = listOf(Dog(), Cat())
    for (pet in pets) {
        pet.play()
    }
}
