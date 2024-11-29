package org.example.kt_base

class Program13 {
    fun main() {
        println("Bведите число ")
        val a = readLine()?.toInt()

        if (a != null && a > 0) {
            for (i in a downTo 1) {
                println(i)
                Thread.sleep(500)
            }
            println("старт")
        } else {
            println("некорректное значение")
        }
    }
}