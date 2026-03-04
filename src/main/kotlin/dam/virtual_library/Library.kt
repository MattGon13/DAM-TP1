package dam.virtual_library

//Classe para criar objetos que representam bibliotecas.
class Library(var name: String) {
    //Objeto que guarda o stock total de todas as bibliotecas
    companion object Stock{
        private var totalNumberOfBooks= 0

        fun getTotalBooksCreated(): Int{
            return totalNumberOfBooks
        }
    }

    private var books= mutableListOf<Book>() //Todos os livros que a biblioteca tem

    //Getter dos livros da biblioteca
    fun getBooks():List<Book>{
        return books
    }

    //Função para dicionar um livro à biblioteca
    fun addBook(book: Book) {
        books.add(book)
        totalNumberOfBooks++
        println("\n ${book.getTitle()} by ${book.getAuthor()} has been added to the library!")
    }

    //Função para requesitar um livro da biblioteca através do seu título
    fun borrowBook(title: String){
        val book= books.filter{it.getTitle() == title} //Obter uma lista dos livros existentes na biblioteca com o título dado
        if(books.isNotEmpty() && book[0].getAvailableCopies() != 0){ //Se foi encontrado um livro com esse título que tem cópias disponíveis, //realizar o processo de requesição.
            val availableCopies= book[0].getAvailableCopies()

            println("$title has been borrowed. Available copies: ${availableCopies - 1}")
            book[0].setAvailableCopies(availableCopies - 1)
        }
        else{
            println("The book $title is not available. Try again later.")
        }
    }

    //Função para devolver um livro requesitado da biblioteca através do seu título
    fun returnBook(title: String){
        val book= books.filter{it.getTitle() == title} //Obter uma lista dos livros existentes na biblioteca com o título dado
        if(books.isNotEmpty()){ //Se o livro em questão existe na livraria, proceder com a devolução
            val availableCopies= book[0].getAvailableCopies()

            println("$title has been returned. Available copies: ${availableCopies + 1}")
            book[0].setAvailableCopies(availableCopies + 1)
        }
        else{
            println("The book $title is not available. Try again later.")
        }
    }

    //Mostrar informação sobre todos os livros da biblioteca
    fun showBooks(){
        println("Books in the library:")
        books.forEach {
            println(it.toString())
        }
    }

    //Procurar por livros através do nome do autor
    fun searchByAuthor(author: String){
        val booksAuthor= books.filter{it.getAuthor() == author}
        booksAuthor.forEach {
            println(it.toString())
        }
    }

}