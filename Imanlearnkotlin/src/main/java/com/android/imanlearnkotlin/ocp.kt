package com.android.imanlearnkotlin
interface Report {
    fun generate()
}
class PdfReport : Report {
    override fun generate() {
        println("Generating PDF report")
    }
}
class ExcelReport : Report {
    override fun generate() {
        println("Generating Excel report")
    }
}
class WordReport : Report {
    override fun generate() {
        println("Generating Word report")
    }
}
class ReportService(private val report: Report) {
    fun createReport() {
        report.generate()
    }
}
fun main() {
    val pdf = ReportService(PdfReport())
    pdf.createReport()

    val excel = ReportService(ExcelReport())
    excel.createReport()

    val word = ReportService(WordReport())
    word.createReport()
}