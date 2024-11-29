package org.example.kt_base

class Programm4 {
    fun main() {
        toLow('a')

    }

    fun toLow(a : Char) {
        a.uppercase()
        val aUnicode = a.toInt()

        print(aUnicode)
    }
}