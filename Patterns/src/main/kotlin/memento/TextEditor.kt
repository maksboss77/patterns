package memento

class TextEditor(private val textTerminal: TextTerminal) {

    private var savedTextTerminal: TextTerminalState? = null

    fun clickSave() {
        savedTextTerminal = textTerminal.save()
    }

    fun clickUndo() {
        savedTextTerminal?.let {
            textTerminal.restore(it)
        }
    }

    fun write(text: String) {
        textTerminal.addText(text)
    }

    fun print() : String {
        return textTerminal.getCurrentText()
    }

}