package com.example.gullfatimalearnkotlin


//withOCP:
interface Readable{
    fun read()
}

interface Writable{
    fun write()
}

class PdfFile:Readable,Writable{
    override fun read(){
        println("Reading pdf file")
    }
    override fun write(){
        println("Writing pdf file")
    }
}

class ReadFile: Readable{
    override fun read(){
        println("Reading text file")
    }
}

class WriteFile: Writable{
    override fun write(){
        println("Writing text file")
    }
}

fun main()
{
    val pdf = PdfFile()
    pdf.read()
    pdf.write()
    val read = ReadFile()
    read.read()
    val write = WriteFile()
    write.write()
}



//without OCP:
//interface  File{
//     fun readFile(){
//        println("Reading file")
//    }
//    fun writeFile(){
//        println("Writing file")
//    }
//}
//
//class ReadFile:File{
//    override fun readFile(){
//        println("Reading pdf file")
//    }
//    override fun writeFile(){
//        throw UnsupportedOperationException("Not supported")
//    }

     //readFile do not include writing data
//}
//
//class WriteFile:File{
//    override fun readFile(){
//        throw UnsupportedOperationException("Not supported")
//    }
//    override fun writeFile(){
//        println("Writing text file")
//    }
//}
//
//fun main(){
//    val read = ReadFile()
//    read.readFile()
//    read.writeFile()
//
//}
