package org.example.kt_base

import java.util.Scanner

class Programm8 {
    var sc: Scanner = Scanner(System.`in`)
    var line = sc.nextInt()


    fun prnt(){
        println(line)
    }

    fun checknull(){
        if (line == 0){
            println("ddsvcsd")
            line = sc.nextInt()
            checknull()
        }
    }
    fun check(){
        if (line < 18){
            println("Вы маленький!!!")
        }
        else {
            println("Вы совершеннолетний!!!")
        }
    }
}