package state

class PasswordState(override val authentication: Authentication) : State {

    override fun login() {
        println("Возвращаюсь на форму ввода логина...")
        authentication.state = authentication.loginState
    }

    override fun password() {
        println("Ввел пароль...")
        authentication.state = authentication.contentState
    }

    override fun recoveryPassword() {
        println("Нажимаю восстановить пароль...")
        authentication.state = authentication.recoveryPasswordState
    }

    override fun content() {
        println("Для начала введите пароль")
    }

    override fun error() {
        println("Неверный пароль")
        authentication.state = authentication.errorState
    }
}