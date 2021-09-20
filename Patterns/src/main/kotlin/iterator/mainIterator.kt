package iterator

import iterator.iterators.AuthorIterator
import iterator.iterators.BaseBookIterator
import iterator.iterators.NameIterator
import iterator.iterators.YearIterator

//
//import iterator.iterators.AuthorIterator
//import iterator.iterators.BookIterator
//import iterator.iterators.NameIterator
//import iterator.iterators.YearIterator

/**
 *
 * у нас есть последовательность (список) книг, у книги есть поля название, автор и год издания
 * Нужно сделать итераторы, КОТОРЫ БУДУ ВЫДАВАТЬ СПИСОК ПО РАЗНЫМ названиям, авторам и год издания
 *
 * */

fun main() {

    val books = Book.DEFAULT_LIST
    println(books)

    val yearIterator = YearIterator(books)
    yearIterator.show(YEAR_SORTED)
    println(books)

    val nameIterator = NameIterator(books)
    nameIterator.show(NAME_SORTED)
    println(books)

    val authorIterator = AuthorIterator(books)
    authorIterator.show(AUTHOR_SORTED)
    println(books)

}

private fun BaseBookIterator.show(sortedName: String) {
    println(sortedName)
    while (this.hasNext()) {
        val element = nextElement()
        println(element.name + SPLIT + element.author + SPLIT + element.year)
    }
    println()
}

private const val SPLIT = " || "
private const val NAME_SORTED = "NAME SORTED"
private const val AUTHOR_SORTED = "AUTHOR SORTED"
private const val YEAR_SORTED = "YEAR SORTED"