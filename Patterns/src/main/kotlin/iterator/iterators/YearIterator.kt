package iterator.iterators

import iterator.Book

class YearIterator(private var books: List<Book>) : BookIterator<Book> {

    private var position = 0

    init {
        books = books.sortedBy {
            it.year
        }
    }

    override fun hasNext(): Boolean {
        return position < books.size
    }

    override fun nextElement(): Book {
        val book = books[position]
        position++
        return book
    }
}