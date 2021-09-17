package template.domain

class DialogError(error: Error) : ErrorComponent(error) {

    override fun showError() {
        println(errorToString())
        println(RETRY)
    }

}

const val RETRY = "Retry?"
