package com.fabriciocurvello.helloworld

// https://play.kotlinlang.org/byExample/01_introduction/03_Variables

fun someCondition() = true // lembrando, conforme visto em 02-Funcoes-A.kt que esta é uma inline function, onde true é o retorno.

fun main() {
    val d: Int  // 1

    if (someCondition()) {
        d = 1   // 2
    } else {
        d = 2   // 2
    }

    println(d) // 3
}

