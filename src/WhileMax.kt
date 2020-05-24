package ru.vgoudk.kotlinclass

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var n:Int
    var max = Int.MIN_VALUE
    do {
        n = scanner.nextInt()
        if (n > max && n!=0) {max = n}
    } while (n != 0)
    println( "$max")
}