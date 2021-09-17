package strategy

import strategy.domain.*
import template.domain.Error

fun main() {

    val error = Error(code = 12, message = "Ошибка!", initializer = "main")


    // 1 вариант
    val toastShowStrategy = ToastShowStrategy()
    val dialogShowStrategy = DialogShowStrategy()

    val toastError = ErrorComponentImpl(error, toastShowStrategy)
    toastError.showError()

    val dialogError = ErrorComponentImpl(error, dialogShowStrategy)
    dialogError.showError()

    // 2 вариант
    val toast = ToastErrorComponent(error)
    val dialog = DialogErrorComponent(error)

    toast.showError()
    dialog.showError()

}