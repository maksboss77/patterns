package state

class ContentState(override val authentication: Authentication) : State {

    override fun login() {
        println("Вернуться к авторизации...")
        authentication.state = authentication.loginState
    }

    override fun password() {
        println("Ты уже вошел")
    }

    override fun recoveryPassword() {
        println("Ты уже вошел")
    }

    override fun content() {
        println("Показываю контент")
    }

    override fun error() {
        println("Ошибка показа контента")
        authentication.state = authentication.errorState
    }
}