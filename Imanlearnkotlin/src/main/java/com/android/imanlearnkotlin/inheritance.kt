package com.android.imanlearnkotlin

fun main() {
    // Object of Chair
    val chair = Chair()
    chair.type = "Dining Chair"
    chair.material = "Oak Wood"
    chair.showDetails()

    println()

    // Object of Table
    val table = Table()
    table.type = "Coffee Table"
    table.material = "Teak Wood"
    table.showDetails()
}

// Parent class
open class WoodenFurniture {
    var type: String = "Generic Furniture"
    var material: String = "Unknown Wood"

    // Function to show furniture type
    open fun showType() {
        println("Furniture Type: $type")
    }

    // Function to show material
    fun showMaterial() {
        println("Material: $material")
    }

    // Combined function
    fun showDetails() {
        showType()
        showMaterial()
    }
}

// Child class Chair
class Chair : WoodenFurniture() {
    var hasArmRest: Boolean = true

    // Overriding showType
    override fun showType() {
        println("This is a Chair: $type")
    }
}

// Child class Table
class Table : WoodenFurniture() {
    var shape: String = "Rectangle"

    // Overriding showType
    override fun showType() {
        println("This is a Table: $type")
    }
}