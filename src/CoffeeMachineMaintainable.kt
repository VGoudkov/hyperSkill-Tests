package ru.vgoudk.kotlinclass

import java.util.*


fun main() {

    //region Initial machine state
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550
    //endregion

    printState(water, milk, beans, cups, money)

    val scanner = Scanner(System.`in`)


    print("Write action (buy, fill, take): ")
    val action = scanner.nextLine()
    when (action) {
        "buy" -> {
            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
            when (scanner.nextInt()) {
                1 -> {
                    water -= 250
                    beans -= 16
                    money += 4
                }
                2 -> {
                    water -= 350
                    milk -= 75
                    beans -= 20
                    money += 7
                }
                3 -> {
                    water -= 200
                    milk -= 100
                    beans -= 12
                    money += 6
                }
            }
            --cups

        }
        "fill" -> {
            //region maintanance section
            print("Write how many ml of water do you want to add: ")
            water += scanner.nextInt()
            print("Write how many ml of milk do you want to add: ")
            milk += scanner.nextInt()
            print("Write how many grams of coffee beans do you want to add: ")
            beans += scanner.nextInt()
            print("Write how many disposable cups of coffee do you want to add: ")
            cups += scanner.nextInt()
            //endregion
        }
        "take" -> {
            println("I gave you \$$money")
            money = 0;
        }
    }

    printState(water, milk, beans, cups, money)
}

fun printState(water: Int, milk: Int, beans: Int, cups: Int, money: Int) {
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$beans of coffee beans")
    println("$cups of disposable cups")
    println("$money of money")
}