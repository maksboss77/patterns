package adapter

@Deprecated("use library with semitone")
class ColorPaletteImpl : ColorPalette {

    override fun getColor(color: String): String {
        val returnColor =  when (color){
            RED -> RED
            GREEN -> GREEN
            BLUE -> BLUE
            else -> UNKNOWN
        }
        return "color: $returnColor"
    }
}

private const val RED = "red"
private const val GREEN = "green"
private const val BLUE = "blue"

private const val UNKNOWN = "unknown"
