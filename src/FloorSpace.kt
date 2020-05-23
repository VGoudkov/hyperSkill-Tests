package ru.vgoudk.kotlinclass

import java.util.*

/**
triangle
a
b
c

rectangle
a
b

circle
r
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print("type: [triangle, rectangle,  circle] :");
    val type = scanner.nextLine()

    println(
        when (type) {
            "triangle" -> calcTriangle(scanner)
            "rectangle" -> calcRectangle(scanner)
            "circle" -> calcCircle(scanner)
            else -> "Unknown arg $type"
        }
    )

}

fun calcTriangle(scanner: Scanner): Double {
    print("a: ");
    val a = scanner.nextDouble()
    print("b: ");
    val b = scanner.nextDouble()
    print("c: ");
    val c = scanner.nextDouble()

    val p = (a + b + c) / 2
    return Math.sqrt(p * (p - a) * (p - b) * (p - c))
}

fun calcRectangle(scanner: Scanner): Double {
    print("x: ");
    val x = scanner.nextDouble()
    print("y: ");
    val y = scanner.nextDouble()
    return x * y;
}

fun calcCircle(scanner: Scanner): Double {
    print("r: ");
    val r = scanner.nextDouble()
    return 3.14 * r * r;
}
