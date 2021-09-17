package strategy.domain

import template.domain.Error

class DialogErrorComponent(error: Error) : ErrorComponent(error) {

    override val showStrategy: ShowStrategy
        get() = DialogShowStrategy()

}