package adapter

object ColorPaletteCodeImpl {

    fun getColorRGB(color: String): String {

        val colorList = color.split(SPACE)

        val redIsColor = colorList.contains(RED)
        val greenIsColor = colorList.contains(GREEN)
        val blueIsColor = colorList.contains(BLUE)
        return getColor(red = redIsColor, green = greenIsColor, blue = blueIsColor)
    }

    private fun getColor(red: Boolean, green: Boolean, blue: Boolean): String {
        return when {
            red && green -> YELLOW
            red && blue -> PURPLE
            green && blue -> LIGHT_BLUE
            red -> RED
            green -> GREEN
            blue -> BLUE
            else -> UNKNOWN
        }
    }
}

private const val YELLOW = "yellow"
private const val PURPLE = "purple"
private const val LIGHT_BLUE = "light blue"
private const val UNKNOWN = "unknown"

private const val RED = "red"
private const val GREEN = "green"
private const val BLUE = "blue"

private val SPACE = "\\s".toRegex()