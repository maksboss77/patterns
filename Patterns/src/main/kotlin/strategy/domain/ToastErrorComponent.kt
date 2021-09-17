package strategy.domain

import template.domain.Error

class ToastErrorComponent(error: Error) : ErrorComponent(error) {

    override val showStrategy: ShowStrategy
        get() = ToastShowStrategy()
}