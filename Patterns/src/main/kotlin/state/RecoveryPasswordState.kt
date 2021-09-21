package state

class RecoveryPasswordState(override val authentication: Authentication) : State {

    override fun login() {
        authentication.state = authentication.loginState
    }

    override fun password() {
        println("Вы пока не можете ввести пароль")
    }

    override fun recoveryPassword() {
        println("Новый пароль отправлен на вашу почту")
        login()
    }

    override fun content() {
        println("Для начала введите логин и пароль")
    }

    override fun error() {
        println("Невозможно восстановить пароль для данного пользователя")
        authentication.state = authentication.errorState
    }
}