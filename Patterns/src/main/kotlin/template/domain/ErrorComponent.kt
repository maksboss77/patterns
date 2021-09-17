package template.domain

abstract class ErrorComponent(private val error: Error) {

    fun errorToString():String {
        return "          code: ${error.code} || message: ${error.message} || initializer ${error.initializer}"
    }

    abstract fun showError()

}