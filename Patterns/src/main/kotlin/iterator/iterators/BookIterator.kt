package iterator.iterators

interface BookIterator<out T> {
    fun nextElement(): T
    fun hasNext(): Boolean
}