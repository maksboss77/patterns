package strategy.domain

import template.domain.Error

class ErrorComponentImpl(error: Error, showStrategyImpl: ShowStrategy) : ErrorComponent(error) {

    override val showStrategy: ShowStrategy = showStrategyImpl
}