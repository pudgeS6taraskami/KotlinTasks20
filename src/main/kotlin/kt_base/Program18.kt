package org.example.kt_base

class Program18 {
    fun main() {
        println("Bведите число элементов первого множества")
        val a = readLine()!!.toInt()

        println("Bведите число элементов второго множества")
        val b = readLine()!!.toInt()

        val set1 = mutableSetOf<Int>()
        println("Bведите элементы первого множества")
        for (i in 1..a) {
            set1.add(readLine()!!.toInt())
        }

        val set2 = mutableSetOf<Int>()
        println("Bведите элементы второго множества")
        for (i in 1..b) {
            set2.add(readLine()!!.toInt())
        }

        val intersectSet = set1.intersect(set2)

        for (i in intersectSet) {
            println(i)
        }
    }
}