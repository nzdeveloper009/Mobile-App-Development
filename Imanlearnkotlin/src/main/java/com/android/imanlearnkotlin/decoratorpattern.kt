package com.android.imanlearnkotlin

interface DataSource {
    fun writeData(data: String)
}
class FileDataSource : DataSource {

    override fun writeData(data: String) {
        println("Writing data: $data")
    }
}
abstract class DataSourceDecorator(
    protected val source: DataSource
) : DataSource
class EncryptionDecorator(
    source: DataSource
) : DataSourceDecorator(source) {

    override fun writeData(data: String) {

        val encrypted = "Encrypted($data)"

        source.writeData(encrypted)
    }
}
class CompressionDecorator(
    source: DataSource
) : DataSourceDecorator(source) {

    override fun writeData(data: String) {

        val compressed = "Compressed($data)"

        source.writeData(compressed)
    }
}
fun main() {

    var source: DataSource = FileDataSource()

    source = CompressionDecorator(source)

    source = EncryptionDecorator(source)

    source.writeData("Hello World")
}