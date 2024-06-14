package com.fabriciocurvello.helloworld

// Functions - Operator Functions
// https://play.kotlinlang.org/byExample/01_introduction/02_Functions

/*
Certas funções podem ser “atualizadas” pelas operadoras, permitindo suas chamadas com o símbolo da operadora correspondente.
 */

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)       // 1
    println(2 * "Bye ")                                          // 2

    operator fun String.get(range: IntRange) = substring(range)  // 3
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..9])                                          // 4
}