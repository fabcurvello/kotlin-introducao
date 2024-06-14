package com.fabriciocurvello.funcoes

// Functions - Functions with vararg Parameters
// https://play.kotlinlang.org/byExample/01_introduction/02_Functions

/*
    Varargs permitem que você passe qualquer número de argumentos separando-os com vírgulas.
 */

fun main() {
    fun printAll(vararg messages: String) {                            // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "你好", prefix = "Greeting: "  )   // 4


    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好", "Olá")
}