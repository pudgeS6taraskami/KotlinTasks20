package org.example.kt_base

class Program11 {
    fun main() {
        println("введите число")
        val a = readLine()!!.toInt()

        when(a) {
            1 -> println("понедельник")
            2 -> println("вторник")
            3 -> println("среда")
            4 -> println("четверг")
            5 -> println("пятница")
            6 -> println("суббота")
            7 -> println("воскресенье")
            else -> println("некорректно")
        }
    }
}