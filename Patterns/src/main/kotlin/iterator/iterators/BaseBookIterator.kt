package iterator.iterators

import iterator.Book

abstract class BaseBookIterator : BookIterator {

    protected abstract var books: List<Book>

    private var position = 0

    override fun hasNext(): Boolean {
        return position < books.size
    }

    override fun nextElement(): Book {
        val book = books[position]
        position++
        return book
    }
}