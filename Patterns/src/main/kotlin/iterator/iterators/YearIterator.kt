package iterator.iterators

import iterator.Book


class YearIterator(override var books: List<Book>) : BaseBookIterator() {

    init {
        books = books.sortedBy {
            it.year
        }
    }
}