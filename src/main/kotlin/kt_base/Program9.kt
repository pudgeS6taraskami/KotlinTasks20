package org.example.kt_base

class Program9 {
    fun main() {
        println("введите возраст")
        val a = readLine()!!.toInt()

        if (a % 2 == 0) {
            println("Четное")
        } else {
            println("Нечетное")
        }
    }
}