package memento

class TextTerminal {

    private var currentText: StringBuilder = StringBuilder()

    fun addText(text: String) {
        currentText.append(text)
    }

    fun save() : TextTerminalState {
        return TextTerminalState(currentText.toString())
    }

    fun restore(save: TextTerminalState) {
        currentText = StringBuilder(save.text)
    }

    fun getCurrentText() : String {
        return currentText.toString()
    }
}