package strategy.domain

class ToastShowStrategy : ShowStrategy {
    override fun show(text: String) {
        println(TOAST_ERROR_START)
        println(text)
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