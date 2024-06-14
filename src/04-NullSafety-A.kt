package com.fabriciocurvello.nullsafety

// https://play.kotlinlang.org/byExample/01_introduction/04_Null%20Safety

// Null Safety - Nulidade ou Segurança Nula

/*
Em um esforço para livrar o mundo de NullPointerException, os tipos de variáveis
em Kotlin não permitem a atribuição de nulo. Se você precisar de uma
 variável que possa ser nula, declare-a anulável adicionando ? no final de seu tipo.
 */

fun main() {
    var neverNull: String = "This can't be null"            // 1
//    neverNull = null                                        // 2

    var nullable: String? = "You can keep a null here"      // 3 - A ? deixa explícito que esta var pode ser nula
    nullable = null                                         // 4

    var inferredNonNull = "The compiler assumes non-null"   // 5
//    inferredNonNull = null                                  // 6

    fun strLength(notNull: String): Int {                   // 7
        return notNull.length
    }

    print(strLength(neverNull))                                    // 8
//    print(strLength(nullable))                                     // 9
}

// As linhas comentadas geram erros propositais