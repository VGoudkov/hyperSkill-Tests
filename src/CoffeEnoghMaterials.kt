package ru.vgoudk.kotlinclass

import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    print("Write how many ml of water the coffee machine has: ")
    val water_ml = scanner.nextInt()
    val cupsByWater = water_ml / 200;

    print("Write how many ml of milk the coffee machine has: ")
    val milk_ml = scanner.nextInt()
    val cupsByMilk = milk_ml / 50;

    print("Write how many grams of coffee beans the coffee machine has: ")
    val coffee_gr = scanner.nextInt()
    val cupsByCoffee = coffee_gr / 15;

    print("Write how many cups of coffee you will need: ")
    val cups = scanner.nextInt()

    val availableCups =
        if (cupsByWater <= cupsByMilk && cupsByWater <= cupsByCoffee) cupsByWater
        else if (cupsByCoffee <= cupsByMilk) cupsByCoffee
        else cupsByMilk

    if (availableCups < cups) println("No, I can make only $availableCups cups of coffee")
    else if (availableCups == cups) println("Yes, I can make that amount of coffee")
    else println("Yes, I can make that amount of coffee (and even ${availableCups - cups} more than that)")

    val _var:Int
}
