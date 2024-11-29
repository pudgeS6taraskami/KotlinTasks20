package org.example.kt_base
import kotlin.random.Random

class Program14 {


    fun main() {
        println("Bведите число ")
        val a = readLine()?.toInt()


        println("Bведите количество элементов массива ")
        val b = readLine()?.toInt()

        val random = Random
        val array = IntArray(b!!)
        for (i in 0 until b) {
            array[i] = random.nextInt(100)
        }

        val isContains = array.contains(a!!)
        println(isContains)
    }
}