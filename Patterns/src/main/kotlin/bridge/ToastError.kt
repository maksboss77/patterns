package bridge

import bridge.color.Color

class ToastError(override var color: Color) : Error() {

    override fun show(error: String) {
        println(TOAST_ERROR_START)
        println(error)
        println(TOAST_ERROR_END)
    }

}

const val TOAST_ERROR_START = """
     _______________________________________________________________
    [                                                               ]
    [                                                               ]
"""

const val TOAST_ERROR_END = """
    [                                                               ] 
    [_______________________________________________________________]
"""