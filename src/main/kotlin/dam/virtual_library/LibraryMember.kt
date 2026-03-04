package org.example.dam.virtual_library

import dam.virtual_library.Book

/**
 * Classe que guarda informações sobre cada membro da biblioteca.
 */
data class LibraryMember(private var name: String, private var membershipId: String, ) {
    init {
        println("A new member called $name has joined the library")
    }
    private var borrowedBooks= mutableListOf<Book>() //livros requisitados pleo membro atualmente

    //Getters e setters
    fun getName(): String{
        return name
    }

    fun getMembershipId(): String{
        return membershipId
    }

    fun getBorrowedBooks(): List<Book>{
        return borrowedBooks
    }

    fun setName(name: String){
        this.name = name
    }

    fun setMembershipId(membershipId: String){
        this.membershipId = membershipId
    }

    //Adicionar um livro aos livros requesitados atualmente. Usar quando o membro requesitar um livro.
    fun addBorrowedBook(book: Book){
        borrowedBooks.add(book)
        println("${book.getTitle()} by ${book.getAuthor()} has been borrowed.")
    }

    //Remover um livro dos livros requesitados atualmente. Usar quando um membro devolver um livro requesitado.
    fun removeBorrowedBook(book: Book){
        borrowedBooks.remove(book)
        println("${book.getTitle()} by ${book.getAuthor()} has been returned.")
    }

}