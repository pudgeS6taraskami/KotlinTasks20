package org.example.kt_base

class Programm7 {
    fun main() {
        val a: String? = "pop"
        safety(a!!)
    }
    fun safety(a: String) {
        if (a != null) {
            println(a.length)
        } else {
            println("строка пуста")
        }
    }
}