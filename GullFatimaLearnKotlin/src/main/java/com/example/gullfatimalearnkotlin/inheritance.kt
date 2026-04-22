package com.example.gullfatimalearnkotlin

fun main() {
    var s1=studentsINHERIT("Asad", 19,"24011519-010",24,4)
    s1.display()
    var t1=TeacherINHERIT("Gull",20)
    t1.ID=111
    t1.department="CS"
    t1.display()
}
class studentsINHERIT( name:String, age:Int, RollNo:String, batch:Int, semester:Int): PERSON(name,age)
{
    var RollNo:String=RollNo
    var batch:Int=batch
    var semester:Int=semester
    fun display()
    {
        println("Name: $name")
        println("Age: $age")
        println("RollNo: $RollNo")
        println("Batch: $batch")
        println("Semester: $semester")
    }

}

class TeacherINHERIT(name:String, age:Int): PERSON(name,age){
    var ID:Int=0
    var department:String=""
    fun display()
    {
        println("Name: $name")
        println("Age: $age")
        println("ID: $ID")
        println("Department: $department")

    }

}
