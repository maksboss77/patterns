package iterator.iterators

import iterator.Book

class NameIterator(override var books: List<Book>) : BaseBookIterator() {

    init {
        books = books.sortedBy {
            it.name
        }
    }
}