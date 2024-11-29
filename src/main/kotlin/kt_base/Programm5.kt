package org.example.kt_base

class Programm5 {
    fun main() {
        stringUnit("Привет", "меня", "зовут", "Артём", "!")
    }

    fun stringUnit(a: String, b: String, c: String, d: String, e: String) {
        val concat = "$a $b $c $d $e"
        print(concat)
    }
}