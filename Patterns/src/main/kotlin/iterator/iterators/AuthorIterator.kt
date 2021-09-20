package iterator.iterators

import iterator.Book

class AuthorIterator(override var books: List<Book>) : BaseBookIterator() {

    init {
        books = books.sortedBy {
            it.author
        }
    }
}