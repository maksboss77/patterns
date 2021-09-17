package template.domain

class ToastError(error: Error) : ErrorComponent(error) {

    override fun showError() {
        println(TOAST_ERROR_START)
        println(errorToString())
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