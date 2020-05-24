package ru.vgoudk.kotlinclass

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()

    if (n > 1) while (n != 1) {
        println(n)
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = n * 3 + 1
        }
    }
    println(1)
    //17 52 26 13 40 20 10 5 16 8 4 2 1
}
