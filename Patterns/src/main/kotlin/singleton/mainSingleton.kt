package singleton

/**
 *
 * Выдавала один и тот же объект 10 раз. 11 объект - это новый.
 *
 * */

fun main() {

    for (index in 1..30) {
        val singleton = Singleton.getInstance()
        println("Connection: ${singleton.getGlobalIndexConnected()}.${singleton.getIndexConnected()}")
    }


}