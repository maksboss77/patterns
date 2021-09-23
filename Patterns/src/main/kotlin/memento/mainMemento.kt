package memento

fun main() {

    val textTerminal = TextTerminal()
    val textEditor = TextEditor(textTerminal)
    textEditor.write(readLine().orEmpty())
    textEditor.write(readLine().orEmpty())
    textEditor.clickSave()

    println(textEditor.print())

    textEditor.write(readLine().orEmpty())
    textEditor.write(readLine().orEmpty())
    textEditor.write(readLine().orEmpty())
    println(textEditor.print())

    textEditor.clickUndo()
    println(textEditor.print())


}