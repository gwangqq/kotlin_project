package com.example.kotlin_project

class Book private constructor(val id: Int, val name: String){

    companion object BookFactory : IdProvider{

        val myBook = "new book"
        fun create() = Book(0, myBook)
        override fun getId(): Int {
            return 666
        }
    }
}

interface IdProvider{
    fun getId() : Int
}

fun main(){
    val book = Book.create()

    val bookId = Book.getId()
    println("${book.id} ${book.name}")
}