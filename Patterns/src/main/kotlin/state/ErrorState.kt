package state

class ErrorState(override val authentication: Authentication) : State {

    override fun login() {
        println("Произошла ошибка. Ввод пароля по новой")
        error()
    }

    override fun password() {
        println("Неверный логин")
        error()
    }

    override fun recoveryPassword() {
        println("Неверный логин")
        error()
    }

    override fun content() {
        println("Необходима авторизация")
        error()
    }

    override fun error() {
        println("На одном из этапров произошла ошибка")
        authentication.state = authentication.loginState
    }
}