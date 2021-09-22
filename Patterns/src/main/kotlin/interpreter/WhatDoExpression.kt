package interpreter

class WhatDoExpression(private val action: String, private val whomExpression: WhomExpression) : Expression {

    override fun interpret(context: InterpreterContext): String {
        context.actionName = action
        return whomExpression.interpret(context)
    }
}