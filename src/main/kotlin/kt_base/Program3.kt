package org.example.kt_base

class Program3 {
    fun main() {
        unicode('A', 'B')

    }

    fun unicode(a: Char, b: Char) {
        val aUnicode = a.toInt()
        val bUnicode = b.toInt()
        val d = aUnicode - bUnicode

        println(d)
    }
}