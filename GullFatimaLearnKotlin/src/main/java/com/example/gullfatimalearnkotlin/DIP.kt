package com.example.gullfatimalearnkotlin


interface ReportSaver{
    fun save()
}

class PdfSaver : ReportSaver{

    override fun save() {
        println("Saving PDF")
    }
}

class ExcelSaver : ReportSaver{

    override fun save() {
        println("Saving Excel")
    }
}

class ReportGen(private val reportSaver: ReportSaver){
    fun generatingReport() {
        println("Generating Report")
        reportSaver.save()
    }

}

fun main(){
    val reportGen = ReportGen(ExcelSaver())
    reportGen.generatingReport()
    val reportGen1 = ReportGen(PdfSaver())
    reportGen1.generatingReport()
}



//open class PDFSaver{
//    fun saveReport(){
//        println("Saving PDF Report")
//    }
//
//}
//
//class ReportGen:PDFSaver(){
//
//    private val pdf = PDFSaver()    //coupling...direct dependency
//
//    fun generateReport() {
//        println("Generating report...")
//        pdf.saveReport()
//    }
//}




