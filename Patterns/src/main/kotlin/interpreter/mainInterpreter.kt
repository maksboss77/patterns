package interpreter

fun main() {

    while (true) {
        println("Кто?")
        val who = readLine().orEmpty()
        println("Что сделали?")
        val action = readLine().orEmpty()
        println("С кем?")
        val whom = readLine().orEmpty()

        val whomExpression = WhomExpression(whom)
        val whatDoExpression = WhatDoExpression(action, whomExpression)
        val query =  WhoExpression(who, whatDoExpression)
        val context = InterpreterContext()
        val movie = query.interpret(context)
        println(movie)
        println()
    }

}