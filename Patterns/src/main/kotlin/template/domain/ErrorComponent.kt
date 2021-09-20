package template.domain

abstract class ErrorComponent(private val error: Error) {

    fun errorToString():String {
        return "          code: ${error.code} || message: ${error.message} || initializer ${error.initializer}"
    }

    fun checkError(a: Int, b: Int) {
        try {
            val result = a / b
            println(result)
        } catch (e: Throwable) {
            showError()
        }
    }

    abstract fun showError()

}