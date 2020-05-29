package ru.vgoudk.kotlinclass

fun main() {
    val input = readLine()!!

    //If the string's first symbol is i, remove the first symbol. The string will contain a number. Print the number + 1.
    //If the string's first symbol is s, remove the first symbol. Then print the reversed remainder.
    //Otherwise, just print the unchanged string.
    if (!input.isEmpty()) {
        when (input.first()) {
            'i' -> println(input.drop(1).toInt() + 1)
            's' -> println(input.drop(1).reversed())
            else -> println(input)
        }
    }
}