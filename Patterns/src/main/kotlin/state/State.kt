package state

interface State {

    val authentication: Authentication
    fun login()
    fun password()
    fun recoveryPassword()
    fun content()
    fun error()

}