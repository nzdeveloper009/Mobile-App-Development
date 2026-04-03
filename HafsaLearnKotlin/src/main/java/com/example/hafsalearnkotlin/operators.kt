package com.example.hafsalearnkotlin

//Arithmetic operators
fun main() {
    var i = 15
    var j = 2
    println("Addition=" + i + j)
    println("Subtraction=" + (i - j))
    println("Multiplication=" + i * j)
    println("Division with integer datatype variables=" + i / j)    //Don't show answer in decimal beacuse the variables datatype is int
    println("Diviaion after converting data type to float=" + i.toFloat() / j) //.tofloat is used to change the datatype
    //Modulus operator (%)
    println("Modulus=" + i % j)//Modulus operator is used to get remainder
    //Relational operators
    println("i is greater then j? = " + (i > j))
    println("i is less than j? = " + (i < j))
    println("i is greater or equal to j? = " + (i >= j))
    println("i is less or equal to j? = " + (i <= j))
    println("i equal to j? = " + (i == j))
    //Increment and Decrement operators
    println("shows original value increments afterwards=" + i++) //post increment
    println("post-increment= " + i)
    println("pre-increment= " + ++i)  //pre-increment
    println("Don't decrement beacuse of post-decrement" + i--)  //post-decrement
    println("post-decrement=" + i)
    println("Pre-decrement= " + --i)  //pre-decrement

    //Logical operators
    //AND (&&) returns true if both conditions are true
    // OR (||) returns true if any condition is true
    var attendaceabove75: Boolean = false
    var feepaid = false
    var result: Boolean;
    //AND &&
    var EligibleforExams = attendaceabove75 && feepaid
    println("Both are false so the result of AND(&&) operation is=" + EligibleforExams)
    //OR ||
    EligibleforExams = attendaceabove75 || feepaid
    println("Both are false so the result of OR(||) operation is=" + EligibleforExams)
    attendaceabove75 = true
    // NOT !
    result=!EligibleforExams
    println("The result of NOT operation ="+result)
    //AND &&
    EligibleforExams = attendaceabove75 && feepaid
    println("One is true and the other is false so result of AND(&&) is=" + EligibleforExams) //still false
    //OR ||
    EligibleforExams = attendaceabove75 || feepaid
    println("One is true and the other is false so result of OR(||) is=" + EligibleforExams) //return true beacuse one condition reutrns true
    feepaid = true
    EligibleforExams = attendaceabove75 && feepaid
    println("Both are true so result of AND(&&) is=" + EligibleforExams)  //True beacuse both connditions true
    EligibleforExams = attendaceabove75 || feepaid
    println("Both are true so result of OR(||) is=" + EligibleforExams)
}