package interpreter

class WhomExpression(private val objectName: String) : Expression {

    override fun interpret(context: InterpreterContext): String {
        context.objectName = objectName
        return context.searchMovie()
    }

}