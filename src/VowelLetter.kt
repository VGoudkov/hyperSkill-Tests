package ru.vgoudk.kotlinclass

import java.util.Scanner

// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}

fun isVowel( c:Char) = c.toUpperCase() in setOf( 'A', 'E', 'I', 'O', 'U')