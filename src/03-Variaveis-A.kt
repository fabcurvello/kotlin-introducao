package com.fabriciocurvello.variaveis

// https://play.kotlinlang.org/byExample/01_introduction/03_Variables

// var x val
// var -> variável mutável
// val -> variável imutável. Depois que recebe o valor, este não pode ser alterado.

fun main() {
    var a: String = "initial"  // 1 - Declaração explícita do tipo
    println(a)
    val b: Int = 1             // 2 -
    val c = 3                  // 3 - Inferência de tipo (detecta o tipo conforme o valor inserido)

}

