package iterator.iterators

import iterator.Book

class AuthorIterator(private var books: List<Book>) : BookIterator<Book> {

    private var position = 0

    init {
        books = books.sortedBy {
            it.author
        }
    }

    override fun hasNext(): Boolean {
        return position < books.size //TODO: null надо обрабатывать? + возможно сделать абстрактный, а не интерфейс
    }

    override fun nextElement(): Book {
        val book = books[position]
        position++
        return book
    }
}