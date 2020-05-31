package ru.vgoudk.kotlinclass

import java.util.*


class CoffeeMachineClass {
    private var water = 400
    private var milk = 540
    private var beans = 120
    private var cups = 9
    private var money = 550

    private var state: States = States.READY
    private var fillStage: FillStages = FillStages.WATER

    fun handleAction(action: String) {
        when (state) {
            States.READY -> {
                state = when (action) {
                    "buy" -> {
                        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                        States.BUY
                    }
                    "fill" -> {
                        print("Write how many ml of water do you want to add: ")
                        States.FILL
                    }
                    "take" -> doTake()
                    "remaining" -> doRemaining()
                    else -> States.READY
                }
            }
            States.BUY -> state = doBuy(action)
            States.FILL -> {
                state = doFill(action)
            }
        }
        if (state == States.READY) printBanner()
    }

    fun printBanner() {
        println("Write action (buy, fill, take, remaining, exit): ")
    }

    private fun doBuy(type: String): States {
        if( type == "back") return States.READY

        val isEnough = when (type) {
            "1" -> water >= 250 && beans >= 16
            "2" -> water >= 350 && milk >= 75 && beans >= 20
            "3" -> water >= 200 && milk >= 100 && beans >= 12
            else -> false
        } && cups >= 1

        if (isEnough) {
            when (type) {
                "1" -> {
                    water -= 250
                    beans -= 16
                    money += 4
                    --cups
                }
                "2" -> {
                    water -= 350
                    milk -= 75
                    beans -= 20
                    money += 7
                    --cups
                }
                "3" -> {
                    water -= 200
                    milk -= 100
                    beans -= 12
                    money += 6
                    --cups
                }
            }
            println("I have enough resources, making you a coffee!")
        } else println("Can't make a cup of coffee")
        return States.READY
    }

    private fun doFill(action: String): States {
        val amount = action.toInt()
        fillStage = when (fillStage) {
            FillStages.WATER -> {
                water += amount
                print("Write how many ml of milk do you want to add: ")
                FillStages.MILK
            }
            FillStages.MILK -> {
                milk += amount
                print("Write how many grams of coffee beans do you want to add: ")
                FillStages.BEANS
            }
            FillStages.BEANS -> {
                beans += amount
                print("Write how many disposable cups of coffee do you want to add: ")
                FillStages.CUPS
            }
            FillStages.CUPS -> {
                cups += amount
                FillStages.WATER
            }
        }
        return if (fillStage != FillStages.WATER)
            States.FILL
        else
            States.READY
    }

    private fun doTake(): States {
        println("I gave you \$$money")
        money = 0
        return States.READY
    }

    private fun doRemaining(): States {
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$beans of coffee beans")
        println("$cups of disposable cups")
        println("$money of money")
        return States.READY
    }


    enum class States {
        READY, BUY, FILL
    }

    enum class FillStages {
        WATER, MILK, BEANS, CUPS
    }
}


fun main() {
    val scanner = Scanner(System.`in`)
    val machine = CoffeeMachineClass()
    machine.printBanner()
    do {
        val action = scanner.nextLine()
        machine.handleAction(action)
    } while (action != "exit")
}
