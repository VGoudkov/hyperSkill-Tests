package ru.vgoudk.kotlinclass

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val ch = scanner.next().first()
    println (ch.isUpperCase() || ch.isDigit())
}