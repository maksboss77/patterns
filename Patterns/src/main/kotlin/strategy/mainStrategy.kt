package strategy

import strategy.domain.*
import strategy.domain.strategy.DialogShowStrategy
import strategy.domain.strategy.ToastShowStrategy
import template.domain.Error

fun main() {

    val error = Error(code = 12, message = "Ошибка!", initializer = "main")

    val toastShowStrategy = ToastShowStrategy()
    val dialogShowStrategy = DialogShowStrategy()

    val errorComponent = ErrorComponent(error)
    errorComponent.showError() // если не присвоили никакую стратегию, то просто ничего не выводится
    errorComponent.setStrategy(toastShowStrategy)
    errorComponent.showError()
    errorComponent.setStrategy(dialogShowStrategy)
    errorComponent.showError()

}