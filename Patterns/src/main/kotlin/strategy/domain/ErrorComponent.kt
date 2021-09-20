package strategy.domain

import strategy.domain.strategy.ShowStrategy
import template.domain.Error

class ErrorComponent(private val error: Error) {

    private var showStrategy: ShowStrategy? = null

    fun errorToString(): String {
        return "          code: ${error.code} || message: ${error.message} || initializer ${error.initializer}"
    }

    fun showError() {
        showStrategy?.show(errorToString())
    }

    fun setStrategy(strategy: ShowStrategy) {
        showStrategy = strategy
    }

}