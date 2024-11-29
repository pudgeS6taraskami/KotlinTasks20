package org.example.kt_base

class Program10 {
    fun main() {
        println("введите возраст")
        val a = readLine()!!.toInt()

        if (a >= 0 && a <= 12) {
            println("ребенок")
        } else if (a >= 13 && a <= 17) {
            println("подросток")
        } else if (a >= 18 && a <= 64) {
            println("взрослый")
        } else if (a >= 65) {
            println("пожилой")
        } else {
            println("некорректно")
        }
    }
}