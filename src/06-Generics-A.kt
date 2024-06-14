package com.fabriciocurvello.helloworld

// https://play.kotlinlang.org/byExample/01_introduction/06_Generics

// Generic Classes
// A primeira maneira de usar genéricos em Kotlin é criando classes genéricas.

class MutableStack<E>(vararg items: E) {              // 1 - E é um parâmetro genérico. Vararg E é uma lista desse parametro genérico.

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3 - Pega o último elemento, mas não o remove.

    fun pop(): E = elements.removeAt(elements.size - 1) // Pega o último elemento e o remove

    fun isEmpty() = elements.isEmpty()  // Valida se a lista está vazia

    fun size() = elements.size  // Tamanho da lista

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main() {
    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}
