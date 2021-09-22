package chainOfResponsibility

// зачем тут интерфейс, если есть BaseHandler
// CleanCode and Patterns :: проектируйте на уровне интерфейсов :)
interface Handler {
    fun check(name: String)
    fun showError(error: String, name: String)
    fun valid(name: String) : Boolean
}