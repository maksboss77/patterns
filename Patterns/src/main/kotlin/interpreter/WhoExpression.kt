package interpreter

class WhoExpression(private val subjectName: String, private val whatDoExpression: WhatDoExpression) : Expression {

    override fun interpret(context: InterpreterContext): String {
        context.subjectName = subjectName
        return whatDoExpression.interpret(context)
    }
}