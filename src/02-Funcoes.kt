package com.fabriciocurvello.helloworld

// https://play.kotlinlang.org/byExample/01_introduction/02_Functions


//Função com argumento String e sem retorno
//: Unit é opcional no caso de funções sem retorno
//Poderia simplesmente ser omitido
fun printMessage(message: String): Unit {                               // 1
    println(message)
}
//Função sem retorno. : Unit foi omitido
//Possui 2 argumentos String. O segundo tem valor padrao "Info".
//Caso não receba esse argumento, esse valor será utilizado.
fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message") //Interpolação de Strings (feita com $var)
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y                                    // 4

fun main() {
    printMessage("Hello")                                               // 5
    printMessageWithPrefix("Hello", "Log")                              // 6
    printMessageWithPrefix("Hello")                                     // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                                  // 9
    println(multiply(2, 4))                                             // 10
}