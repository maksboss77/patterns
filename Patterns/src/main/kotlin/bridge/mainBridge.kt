package bridge

import bridge.color.InformationColor
import bridge.color.WarningColor

fun main() {


    val informationColor = InformationColor()
    val dialogError = DialogError(informationColor)
    dialogError.show("Диалог упс...")

    val warningColor = WarningColor()
    val toastError = ToastError(warningColor)
    toastError.show("Тост готов...")

}