package dam.virtual_library

class Library {
    companion object Stock{
        private var totalNumberOfBooks= 0

        fun getTotalBooksCreated(): Int{
            return totalNumberOfBooks
        }
    }

    private var books= mutableListOf<Book>()

    fun getBooks():List<Book>{
        return books
    }

    fun addBook(book: Book) {
        books.add(book)
        totalNumberOfBooks++
    }

    fun borrowBook(title: String){
        val book= books.filter{it.getTitle() == title}
        if(books.isNotEmpty() && book[0].getAvailableCopies() != 0){
            val availableCopies= book[0].getAvailableCopies()
            book[0].setAvailableCopies(availableCopies - 1)

            println("Book borrowed. Available copies: $availableCopies")
        }
        println("That book is not available. Try again later.")
    }

    fun showBooks(){
        println("Books in the library:")
        books.forEach {
            //println("${it.getTitle()} by ${it.getAuthor()} (${it.getPublicationYear()}): ${it.getAvailableCopies()} available copies.")
            println(it.toString())
        }
    }

    fun searchByAuthor(author: String){
        val booksAuthor= books.filter{it.getAuthor() == author}
        booksAuthor.forEach {
            //println("${it.getTitle()} by ${it.getAuthor()} (${it.getPublicationYear()}): ${it.getAvailableCopies()} available copies.")
            println(it.toString())
        }
    }

}