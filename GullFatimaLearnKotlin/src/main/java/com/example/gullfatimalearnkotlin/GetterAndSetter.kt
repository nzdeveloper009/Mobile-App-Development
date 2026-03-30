package com.example.gullfatimalearnkotlin

fun main() {
    var emp1= Employee()
    emp1.name="Gull"
    emp1.age=-1
    emp1.ID=111
    var emp2= Employee()
    emp2.name="Riya"
    emp2.age=20
    emp2.ID=101
    emp2.display()
    emp1.display()
}
class Employee(){
    var name:String=""
        get()
        {
            return field.uppercase()
        }

    var age:Int=-1
        set(value)
        {
            if(value > 0)
            {
                field=value
            }
            else
            {
                println("Age can't be negative")
            }
        }

    var ID:Int=0
        set(value)
        {
            if(value > 100)
            {
                field=value
            }
            else
            {
                println("ID can't be less than 100")
            }
        }
    fun display()
    {
        println("ID: $ID")
        println("Name: $name")
        println("Age: $age")
    }

}