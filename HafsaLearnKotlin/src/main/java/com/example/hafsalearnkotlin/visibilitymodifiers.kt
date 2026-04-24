package com.example.hafsalearnkotlin

// By default, classes and functions are 'public' if no modifier is specified
open class Human(val name: String) {

    // Public property (default) – accessible everywhere
    val publicInfo: String = "I am visible everywhere."

    // Private property – accessible only inside this class
    private val privateInfo: String = "Only inside Human."

    // Protected property – accessible inside this class and subclasses
    protected val protectedInfo: String = "Visible in Human and subclasses."

    // Internal property – accessible anywhere in the same module
    internal val internalInfo: String = "Visible within the same module."

    // Public method
    fun showPublic() {
        println(publicInfo)
    }

    // Private method
    private fun showPrivate() {
        println(privateInfo)
    }

    // Protected method
    protected fun showProtected() {
        println(protectedInfo)
    }

    // Internal method
    internal fun showInternal() {
        println(internalInfo)
    }

    // Demonstrating access inside the class
    fun demoAccess() {
        showPublic()
        showPrivate()
        showProtected()
        showInternal()
    }
}

// Subclass to demonstrate 'protected'
class Student(name: String) : Human(name) {
    fun studentAccess() {
        // Can access public
        println(publicInfo)

        // Cannot access private (error if uncommented)
        // println(privateInfo)

        // Can access protected
        println(protectedInfo)

        // Can access internal
        println(internalInfo)
    }
}

fun main() {
    val human = Human("Ali")
    val student = Student("Sara")

    println("=== Access from main ===")
    // Public accessible
    println(human.publicInfo)

    // Internal accessible (same module)
    println(human.internalInfo)

    // Private not accessible (error if uncommented)
    // println(human.privateInfo)

    // Protected not accessible directly (error if uncommented)
    // println(human.protectedInfo)

    println("\n=== Access inside Human class ===")
    human.demoAccess()

    println("\n=== Access inside Student subclass ===")
    student.studentAccess()
}
