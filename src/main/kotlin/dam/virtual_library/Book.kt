package dam.virtual_library

//Classe que representa um livro, contendo informações sobre o mesmo.
abstract class Book(private var title: String, private var author: String, private var publicationYear: Int, private var availableCopies: Int){
    init { //Notifica o utilizador sempre que um livro foi criado com sucesso
        println("\n $title by $author has been created!")
    }

    //Função que fornece todas as informações sobre o livro
    override fun toString(): String{
        return "\n $title by $author ($publicationYear - ${getPublicationYear()}): $availableCopies available copies."
    }

    //Getters e setters
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
            availableCopies == 0 -> {
                println("Warning: The book $title by $author is now out of stock!")
                this.availableCopies = availableCopies
            }
            else -> this.availableCopies = availableCopies
        }
    }

}