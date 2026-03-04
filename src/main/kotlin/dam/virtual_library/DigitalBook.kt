package dam.virtual_library

class DigitalBook(private var title: String, private var author: String, private var publicationYear: Int, private var availableCopies: Int, private var fileSize: Int, private var format: String):
    Book(title, author, publicationYear, availableCopies) {

    override fun toString(): String{
        val basicInfo= super.toString()
        return "$basicInfo \n File size: $fileSize MB Format: $format"
    }

    override fun getStorageInfo() {
        println("Stored digitally: $fileSize MB / Format: $format")
    }

    fun getfileSize(): Int {
        return fileSize
    }

    fun getFormat(): String {
        return format
    }

    fun setfileSize(fileSize: Int) {
        this.fileSize = fileSize
    }

    fun setFormat(format: String) {
        this.format = format
    }

}