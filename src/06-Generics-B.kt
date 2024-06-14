package com.fabriciocurvello.generics.b

// https://play.kotlinlang.org/byExample/01_introduction/06_Generics

// Generic Classes
// Você também pode gerar funções se sua lógica for independente de um tipo específico. Por exemplo, você pode escrever
// uma função utilitária para criar pilhas mutáveis:

class MutableStack<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = mutableStackOf(1, 2, "casa", true, 5.5)
    println(stack)
}