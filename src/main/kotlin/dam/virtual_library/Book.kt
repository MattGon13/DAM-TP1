package dam.virtual_library

abstract class Book(private var title: String, private var author: String, private var publicationYear: Int, private var availableCopies: Int){
    init {
        println("$title by $author has been created!")
    }

    override fun toString(): String{
        return "$title by $author ($publicationYear - ${getPublicationYear()}): $availableCopies available copies."
    }

    abstract fun getStorageInfo()

    fun getTitle(): String{
        return title
    }

    fun getAuthor(): String{
        return author
    }

    fun getPublicationYear(): String{
        when{
            publicationYear < 1980 -> return "Classic"
            publicationYear in 1980..2010 -> return "Modern"
            else -> return "Contemporary"
        }
    }

    fun getAvailableCopies(): Int{
        return availableCopies
    }

    fun setTitle(title: String){
        this.title = title
    }

    fun setAuthor(author: String){
        this.author = author
    }

    fun setPublicationYear(publicationYear: Int){
        this.publicationYear = publicationYear
    }

    fun setAvailableCopies(availableCopies: Int){
        when{
            availableCopies < 0 -> println("There can't be a negative number of copies.")
            availableCopies == 0 -> println("Warning: Book is now out of stock!")
            else -> this.availableCopies = availableCopies
        }
    }

}