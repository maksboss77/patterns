package chainOfResponsibility

class LimitHandler(override var nextHandler: Handler?) : BaseHandler() {

    override fun valid(name: String): Boolean {
        return name.length < LIMIT
    }

    companion object {
        private const val LIMIT = 10
    }
}

