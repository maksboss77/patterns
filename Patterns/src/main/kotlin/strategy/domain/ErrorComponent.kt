package strategy.domain

import template.domain.Error

abstract class ErrorComponent(private val error: Error) {

    abstract val showStrategy: ShowStrategy

    fun errorToString(): String {
        return "          code: ${error.code} || message: ${error.message} || initializer ${error.initializer}"
    }

    fun showError() {
        showStrategy.show(errorToString())
    }

}