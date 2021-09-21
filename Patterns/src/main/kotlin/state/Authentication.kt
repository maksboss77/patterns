package state

class Authentication {

    val loginState = LoginState(this)
    val passwordState = PasswordState(this)
    val recoveryPasswordState = RecoveryPasswordState(this)
    val contentState = ContentState(this)
    val errorState = ErrorState(this)

    var state: State = loginState

    fun inputLogin() {
        println("STATE :: ${state.javaClass.name} :: inputLogin()")
        state.login()
    }

    fun inputPassword() {
        println("STATE :: ${state.javaClass.name} :: inputPassword()")
        state.password()
    }

    fun recoveryPassword() {
        println("STATE :: ${state.javaClass.name} :: recoveryPassword()")
        state.recoveryPassword()
    }

    fun watchContent() {
        println("STATE :: ${state.javaClass.name} :: watchContent()")
        state.content()
    }

    fun error() {
        println("STATE :: ${state.javaClass.name} :: showError()")
        state.error()
    }

}

fun main() {
    /**Положительный сценарий*/
    val authMaks = Authentication()
    authMaks.inputLogin()
    authMaks.inputPassword()
    authMaks.watchContent()

    println()

    val authNoName = Authentication()
    authNoName.watchContent()
    authNoName.inputLogin()
    authNoName.error()
    authNoName.watchContent()
    authNoName.recoveryPassword()
    authNoName.recoveryPassword()
    authNoName.inputLogin()
    authNoName.inputPassword()
    authNoName.watchContent()


}