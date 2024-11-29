package org.example.kt_base

class `Program 16` {
    fun main() {
        println("Bведите длину списка")
        val a = readLine()?.toInt()

        val list = ArrayList<String>()

        println("Bведите элементы списка")
        for (i in 1..a!!) {
            list.add(readLine()!!)
        }

        val uniqueSet = list.toSet()
        list.clear()
        list.addAll(uniqueSet)

        for (i in list) {
            println(i)
        }
    }
}