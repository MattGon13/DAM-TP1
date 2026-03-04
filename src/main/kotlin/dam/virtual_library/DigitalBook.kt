package dam.virtual_library

//Classe que cria objetos que representam livros digitais
class DigitalBook(private var title: String, private var author: String, private var publicationYear: Int, private var availableCopies: Int, private var fileSize: Double, private var format: String):
    Book(title, author, publicationYear, availableCopies) {

    //Função que mostra informações sobre um livro digital em forma de string
    override fun toString(): String{
        val basicInfo= super.toString()
        return "$basicInfo \n File size: $fileSize MB Format: $format"
    }

    //Getters e setters

    override fun getStorageInfo() {
        println("Stored digitally: $fileSize MB / Format: $format")
    }

    fun getfileSize(): Double {
        return fileSize
    }

    fun getFormat(): String {
        return format
    }

    fun setfileSize(fileSize: Double) {
        this.fileSize = fileSize
    }

    fun setFormat(format: String) {
        this.format = format
    }

}