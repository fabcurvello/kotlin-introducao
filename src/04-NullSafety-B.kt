package com.fabriciocurvello.helloworld

// https://play.kotlinlang.org/byExample/01_introduction/04_Null%20Safety

// Null Safety - Nulidade ou Segurança Nula

/*
   Trabalhando com Nulos

   Às vezes, os programas Kotlin precisam trabalhar com valores nulos, como ao interagir com código Java externo
   ou representar um estado verdadeiramente ausente. Kotlin fornece rastreamento nulo para lidar com tais situações
   com elegância.
 */

fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}

fun main() {
    println(describeString(null))
}