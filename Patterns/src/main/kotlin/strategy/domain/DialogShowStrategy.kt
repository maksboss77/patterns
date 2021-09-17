package strategy.domain

class DialogShowStrategy : ShowStrategy {
    override fun show(text: String) {
        println(text)
    }
}

const val RETRY = "Retry?"