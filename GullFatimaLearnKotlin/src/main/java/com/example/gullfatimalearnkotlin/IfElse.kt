package com.example.gullfatimalearnkotlin

fun main()
{
    var marks= 87
    if(marks >50)
    {
        println("Pass")
    }
    else
    {
        println("Failed")
    }

    //Experssion
    var result=if(marks>50)"Pass" else "Failed"
    println(result)

    var remarks= if(marks>50 && marks<80)
    {
        "Average"
    }
    else if(marks>=80)
    {
        "outstanding"
    }
    else
    {
        "Failed"
    }
    println(remarks)

}
