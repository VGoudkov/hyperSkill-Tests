package ru.vgoudk.kotlinclass

import java.util.*

/**
 * Your little brother wants to learn by heart different currencies, so you want to create a game for him. The game is to read two countries and print true if those countries have the same currency and false if the currencies are different in these countries, or there is no information about at least one of them.
 */

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val country1 = input.next()
    val country2 = input.next()

    println(CountryCurrency.getCurrency(country1) == CountryCurrency.getCurrency(country2))
}


enum class CountryCurrency(val currency: String) {
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    KIRIBATI("Australian dollar");

    companion object {
        fun getCurrency(country: String): String {
            for (enum in CountryCurrency.values()) {
                if (enum.name == country.toUpperCase()) return enum.currency
            }
            return "?"
        }
    }
}