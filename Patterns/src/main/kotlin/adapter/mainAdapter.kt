package adapter

fun main() {

    println("Будете ли вы работать с полутонами? true/false")
    val isSemitone = readLine().toBoolean()

    // вот тут применяем адаптер (по факту могли бы просто старый заменить на новый
    val colorPalette = if (isSemitone) {
        ColorPaletteAdapter()
    } else {
        ColorPaletteImpl()
    }
    while (true) {
        val color = readLine().orEmpty().uppercase()
        val colorCode = colorPalette.getColor(color)
        println(colorCode)
    }

}