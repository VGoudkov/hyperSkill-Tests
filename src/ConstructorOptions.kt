package ru.vgoudk.kotlinclass

class City(val name: String) {
    var population: Int = 0
        set(value) {
            field = when {
                value < 0 -> 0
                value > 50_000_000 -> 50_00_000
                else -> value
            }
        }

    override fun toString(): String {
        return "City(name='$name', population=$population)"
    }

}


class ByteTimer(time: Int) {
    var time:Int = time
        get(){
            return when{
                field < -128 -> -128
                field > 127 -> 127
                else -> field
        }
    }
}

class Client(length: Int) {
    var length: Int = length
        set(value) {
            field = if (length < 0) 0 else length
        }
}



fun main(args: Array<String>) {
//    val city = City("London")
//    city.population = 10;
//    println(city)
//
//    val timerValue = readLine()!!.toInt()
//    val timer = ByteTimer(timerValue)
//    println(timer.time)
    
    val bt = ByteTimer(999);
    println(bt.time)
     
    val btm = ByteTimer(-999);
    println(btm.time)
}