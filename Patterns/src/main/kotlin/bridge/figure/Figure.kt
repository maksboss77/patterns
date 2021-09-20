package bridge.figure

interface Figure {
    fun line()
    fun circle()
    fun oval()
    fun rectangle()
}

interface Document {
    fun print()
}

class Document2Oval(private val figure: Figure) : Document {
    override fun print() {
        figure.oval()
        figure.oval()
    }
}

class Document5Line(private val figure: Figure) : Document {
    override fun print() {
        repeat(5) {
            figure.line()
        }
    }
}

class Document4Rectangle(private val figure: Figure) : Document {
    override fun print() {
        repeat(4) {
            figure.rectangle()
        }
    }
}

class FigureForUI : Figure {
    override fun line() {
        println("Line for UI")
    }

    override fun circle() {
        println("Circle for UI")
    }

    override fun oval() {
        println("Oval for UI")
    }

    override fun rectangle() {
        println("Rectangle for UI")
    }
}

class FigureForPDF : Figure {
    override fun line() {
        println("Line for PDF")
    }

    override fun circle() {
        println("Circle for PDF")
    }

    override fun oval() {
        println("Oval for PDF")
    }

    override fun rectangle() {
        println("Rectangle for PDF")
    }
}

fun main() {

    val figure = FigureForUI()
    val document = Document2Oval(figure)
    document.print()
    val document5 = Document5Line(figure)
    document5.print()


    val figurePdf = FigureForPDF()
    val documentPdf = Document2Oval(figurePdf)
    documentPdf.print()
    val documentPdf5 = Document5Line(figurePdf)
    documentPdf5.print()
    val document4 = Document4Rectangle(figurePdf)
    document4.print()

}