package org.example.kt_base

class Program1 {
    fun main() {
        average()
    }

    fun average() {
        println("Введите три числа")
        val a = readLine()?.toDouble()
        val b = readLine()?.toDouble()
        val c = readLine()?.toDouble()

        val av = (a!! + b!! + c!!)/3

        println("Среднее арифметическое: $av")

    }
}