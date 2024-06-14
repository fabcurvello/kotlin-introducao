package com.fabriciocurvello.classes

// https://play.kotlinlang.org/byExample/01_introduction/05_Classes

// Classes

class Customer                                  // 1 - Classe sem atributos e métodos. Possui construtor oculto.

class Contact(val id: Int, var email: String)   // 2 - Classe com construtor, e os atributos id (imutável val) e email (mutável var)

fun main() {

    val customer = Customer()                   // 3 - Instância (obj) da classe customer (não existe new)

    val contact = Contact(1, "mary@gmail.com")  // 4 - Instância da classe contact

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6 - alterando o e-mail, uma vez que é mutável (var)
}