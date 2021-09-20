package bridge

import bridge.color.Color

class DialogError(override var color: Color) : Error() {


    override fun show(error: String) {
        println("$error $RETRY")
    }
}

const val RETRY = "Retry?"