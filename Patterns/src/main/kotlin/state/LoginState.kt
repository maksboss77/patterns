package state

class LoginState(override val authentication: Authentication) : State {

    override fun login() {
        println("Ввел логин...")
        authentication.state = authentication.passwordState
    }

    override fun password() {
        println("Для начала введите логин")
    }

    override fun recoveryPassword() {
        println("Нажимаю на восстановить пароль...")
        authentication.state = authentication.recoveryPasswordState
    }

    override fun content() {
        println("Для начала введите логин")
    }

    override fun error() {
        println("Такого пользователя не существует")
        authentication.state = authentication.errorState
    }
}