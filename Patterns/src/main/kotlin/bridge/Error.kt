package bridge

import bridge.color.Color

abstract class Error {

    abstract var color: Color

    open fun show(error: String) {
        println("пусто")
    }

}