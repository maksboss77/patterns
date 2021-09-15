package adapter

class ColorPaletteAdapter : ColorPalette {

    override fun getColor(color: String): String {
        return ColorPaletteCodeImpl.getColorRGB(color)
    }
}
