package org.example.kt_base

class Program12 {
    fun main() {
        print("Bведите число")
        val n = readLine()!!.toInt()

        for (i in 2 until n step 2) {
            println(i)
        }
    }
}