package template

import template.domain.DialogError
import template.domain.Error
import template.domain.ToastError

//Шаблонный Метод определяет основные шаги алгоритма и позволяет
//субклассам предоставить реализацию одного или нескольких шагов

fun main() {
    val error = Error(code = 12, message = "Ошибка!", initializer = "main")

    val toastError = ToastError(error)
    toastError.showError()

    val dialogError = DialogError(error)
    dialogError.showError()

}