package chainOfResponsibility

abstract class BaseHandler : Handler {

    abstract var nextHandler: Handler?

    override fun check(name: String) {
        val check = valid(name)
        if (check) {
            nextHandler?.check(name)
            if (nextHandler == null) {
                println("Проверка успешна :: $name")
            }
        } else {
            val error = this::class.java.name
            showError(error, name)
        }
    }

    override fun showError(error: String, name: String) {
        println("$error :: $name")
    }
}