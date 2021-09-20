package iterator.iterators

import iterator.Book

interface BookIterator {
    fun nextElement(): Book
    fun hasNext(): Boolean
}