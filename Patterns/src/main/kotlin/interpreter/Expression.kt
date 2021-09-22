package interpreter

interface Expression {
    fun interpret(context: InterpreterContext) : String
}