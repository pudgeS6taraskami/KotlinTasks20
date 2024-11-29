package org.example.kt_base

class Program2 {
    fun main() {
        println(checkChar('1'))

    }

    fun checkChar(a: Char ): Boolean {
        return a.isLetter()
    }
}