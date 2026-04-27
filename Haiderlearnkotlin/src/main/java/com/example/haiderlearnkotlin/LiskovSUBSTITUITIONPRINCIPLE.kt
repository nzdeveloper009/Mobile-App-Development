package com.example.haiderlearnkotlin


open class Animal_Wrong {
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

class Fish_Wrong : Animal_Wrong() {
    override fun makeSound() {
        // Fish don't make sounds! Forces us to throw an error ❌
        throw UnsupportedOperationException("Fish can't make sounds! 💥")
    }
}

fun playSound_Wrong(animal: Animal_Wrong) {
    animal.makeSound() // 💥 Crashes if animal is a Fish
}


open class Animal(val name: String) {
    open fun eat() {
        println("$name is eating")
    }
}


interface SoundMaker {
    fun makeSound()
}


class Dog(name: String) : Animal(name), SoundMaker {
    override fun makeSound() = println("$name says: Woof! 🐶")
}


class Cat(name: String) : Animal(name), SoundMaker {
    override fun makeSound() = println("$name says: Meow! 🐱")
}


class Fish(name: String) : Animal(name)


fun playSound(animal: SoundMaker) {
    animal.makeSound() // Always safe ✅
}


fun main() {
    println("=== Liskov Substitution Principle ===\n")

    val dog = Dog("Rex")
    val cat = Cat("Whiskers")
    val fish = Fish("Nemo")

    println("--- All animals eat ---")
    dog.eat()
    cat.eat()
    fish.eat()

    println("\n--- Only sound makers make sounds ---")
    playSound(dog)
    playSound(cat)

}

