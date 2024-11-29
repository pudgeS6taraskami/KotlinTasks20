package org.example.kt_base

class Programm6 {
    fun main() {
        print(deleteAndAdd(toArray("sasda")))


    }

    fun toArray(a: String): Array<Char?> {
        val array = arrayOfNulls<Char>(a.length)
        for (i in a.indices) array[i] = a[i]

        return array
    }

    fun deleteAndAdd(array: Array<Char?>): String {
        val firstSecond = array.copyOfRange(0, 2)
        val c = array.copyOfRange(2, array.size)


        return array.contentToString()
    }
}