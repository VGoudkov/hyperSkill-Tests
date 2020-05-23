package ru.vgoudk.kotlinclass


fun a() {
    var a = 10

    when (a) {
        //> 0  -> print("Ok")
        //in 1..20 -> print("Ok"); print("Ok")
        //"2" -> print("Ok")
        a + a -> print("Ok")
        11, 12 -> print("Ok")
        in 1..22 -> print("Ok")
    }
}